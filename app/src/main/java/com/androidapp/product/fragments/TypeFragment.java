package com.androidapp.product.fragments;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.alibaba.fastjson.JSON;
import com.androidapp.R;
import com.androidapp.activity.ProductListActivity;
import com.androidapp.base.BaseFragment;
import com.androidapp.constant.Constants;
import com.androidapp.nethelper.NetConfig;
import com.androidapp.nethelper.NetUtils;
import com.androidapp.product.model.adapter.TyAdapter;
import com.androidapp.product.model.adapter.TypefgAdapter;
import com.androidapp.product.model.bean.Classification;
import com.androidapp.util.LogUtils;

import java.util.List;

import butterknife.BindView;

/**
 * Created by etenel on 2017/7/6.
 */

public class TypeFragment extends BaseFragment {
    @BindView(R.id.recycle)
    RecyclerView recycle;
    private TypefgAdapter adapter;
    private List<Classification.DataBean.ItemsBean> datas;
    private TyAdapter tyAdapter;
    private String[] urls = {NetConfig.HOME_HOUSE_URL, NetConfig.FURNITURE_URL, NetConfig.STATIONERY_URL,
            NetConfig.DIGITAL_URL, NetConfig.LIBERTINISM_URL, NetConfig.KITCHEN_URL, NetConfig.CATE_URL, NetConfig.MEN_URL,
            NetConfig.WOMEN_URL, NetConfig.CHILDREN_URL, NetConfig.SHOES_URL, NetConfig.ACCESSORY_URL,
            NetConfig.BEAUTYCARE_URL, NetConfig.OUTDOORS_URL, NetConfig.PLANT_URL, NetConfig.BOOKS_URL,
            NetConfig.GIFT_URL, NetConfig.RECOMMEND_URL, NetConfig.ART_URL};

    @Override
    public void initData() {
        NetUtils.getInstance().get(NetConfig.CATEGORY_URL, new NetUtils.OnHttpClientListener() {

            @Override
            public void onSuccess(String response) {
                if (response != null&&!response.isEmpty()) {
                    LogUtils.e("TAG", response);
                    Classification classification = JSON.parseObject(response, Classification.class);
                    datas = classification.getData().getItems();
                    if(datas!=null&&datas.size()>0) {
                        tyAdapter = new TyAdapter(R.layout.item_t, datas);
                        recycle.setAdapter(tyAdapter);
                        //recycle.setAdapter(adapter);
                        StaggeredGridLayoutManager gridLayoutManager =
                                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                        recycle.setLayoutManager(gridLayoutManager);
                        tyAdapter.setOnItemClickListener((adapter1, view, position) -> {
                            Intent intent = new Intent(getContext(), ProductListActivity.class);
                            intent.putExtra(Constants.PRODUCT_MSG, urls[position]);
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(getActivity()).toBundle());
                            } else {
                                startActivity(intent);
                            }
                        });
                    }

//                    adapter.setmOnitemClickListenr(view -> {
//                        startActivity(new Intent(getContext(), ProductListActivity.class));
//                    });
//                    recycle.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
                }
            }

            @Override
            public void onFailure(String message) {

            }
        });

    }

    @Override
    public int getlayoutid() {
        return R.layout.item_type;
    }


}
