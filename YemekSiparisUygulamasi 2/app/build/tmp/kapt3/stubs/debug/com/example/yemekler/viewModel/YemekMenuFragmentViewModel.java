package com.example.yemekler.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/example/yemekler/viewModel/YemekMenuFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "ydaor", "Lcom/example/yemekler/repository/YemeklerDaoRepository;", "yemekListesi", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/yemekler/model/Food;", "getYemekListesi", "()Landroidx/lifecycle/MutableLiveData;", "setYemekListesi", "(Landroidx/lifecycle/MutableLiveData;)V", "yemekleriYukle", "", "app_debug"})
public final class YemekMenuFragmentViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.yemekler.model.Food>> yemekListesi;
    private final com.example.yemekler.repository.YemeklerDaoRepository ydaor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.yemekler.model.Food>> getYemekListesi() {
        return null;
    }
    
    public final void setYemekListesi(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.yemekler.model.Food>> p0) {
    }
    
    public final void yemekleriYukle() {
    }
    
    public YemekMenuFragmentViewModel() {
        super();
    }
}