package com.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.androidapp.GoodsInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "GOODS_INFO".
*/
public class GoodsInfoDao extends AbstractDao<GoodsInfo, Long> {

    public static final String TABLENAME = "GOODS_INFO";

    /**
     * Properties of entity GoodsInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Image = new Property(1, String.class, "image", false, "IMAGE");
        public final static Property Gooddesc = new Property(2, String.class, "gooddesc", false, "GOODDESC");
        public final static Property Content = new Property(3, String.class, "content", false, "CONTENT");
        public final static Property Count = new Property(4, int.class, "count", false, "COUNT");
        public final static Property Price = new Property(5, double.class, "price", false, "PRICE");
        public final static Property Disprice = new Property(6, double.class, "disprice", false, "DISPRICE");
        public final static Property Ischecked = new Property(7, boolean.class, "ischecked", false, "ISCHECKED");
    }


    public GoodsInfoDao(DaoConfig config) {
        super(config);
    }
    
    public GoodsInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GOODS_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"IMAGE\" TEXT," + // 1: image
                "\"GOODDESC\" TEXT," + // 2: gooddesc
                "\"CONTENT\" TEXT," + // 3: content
                "\"COUNT\" INTEGER NOT NULL ," + // 4: count
                "\"PRICE\" REAL NOT NULL ," + // 5: price
                "\"DISPRICE\" REAL NOT NULL ," + // 6: disprice
                "\"ISCHECKED\" INTEGER NOT NULL );"); // 7: ischecked
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GOODS_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GoodsInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(2, image);
        }
 
        String gooddesc = entity.getGooddesc();
        if (gooddesc != null) {
            stmt.bindString(3, gooddesc);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
        stmt.bindLong(5, entity.getCount());
        stmt.bindDouble(6, entity.getPrice());
        stmt.bindDouble(7, entity.getDisprice());
        stmt.bindLong(8, entity.getIschecked() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GoodsInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(2, image);
        }
 
        String gooddesc = entity.getGooddesc();
        if (gooddesc != null) {
            stmt.bindString(3, gooddesc);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(4, content);
        }
        stmt.bindLong(5, entity.getCount());
        stmt.bindDouble(6, entity.getPrice());
        stmt.bindDouble(7, entity.getDisprice());
        stmt.bindLong(8, entity.getIschecked() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public GoodsInfo readEntity(Cursor cursor, int offset) {
        GoodsInfo entity = new GoodsInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // image
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // gooddesc
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // content
            cursor.getInt(offset + 4), // count
            cursor.getDouble(offset + 5), // price
            cursor.getDouble(offset + 6), // disprice
            cursor.getShort(offset + 7) != 0 // ischecked
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GoodsInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setImage(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setGooddesc(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setContent(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCount(cursor.getInt(offset + 4));
        entity.setPrice(cursor.getDouble(offset + 5));
        entity.setDisprice(cursor.getDouble(offset + 6));
        entity.setIschecked(cursor.getShort(offset + 7) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(GoodsInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(GoodsInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GoodsInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
