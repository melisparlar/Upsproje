// Generated by data binding compiler. Do not edit!
package com.example.yemekler.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.yemekler.R;
import com.example.yemekler.model.Food;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class YemekTasarimBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardViewYemek;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageViewYemekResim;

  @NonNull
  public final TextView textViewYemekAdi;

  @Bindable
  protected Food mYemek;

  protected YemekTasarimBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardViewYemek, ImageView imageView4, ImageView imageViewYemekResim,
      TextView textViewYemekAdi) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardViewYemek = cardViewYemek;
    this.imageView4 = imageView4;
    this.imageViewYemekResim = imageViewYemekResim;
    this.textViewYemekAdi = textViewYemekAdi;
  }

  public abstract void setYemek(@Nullable Food yemek);

  @Nullable
  public Food getYemek() {
    return mYemek;
  }

  @NonNull
  public static YemekTasarimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.yemek_tasarim, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static YemekTasarimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<YemekTasarimBinding>inflateInternal(inflater, R.layout.yemek_tasarim, root, attachToRoot, component);
  }

  @NonNull
  public static YemekTasarimBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.yemek_tasarim, null, false, component)
   */
  @NonNull
  @Deprecated
  public static YemekTasarimBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<YemekTasarimBinding>inflateInternal(inflater, R.layout.yemek_tasarim, null, false, component);
  }

  public static YemekTasarimBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static YemekTasarimBinding bind(@NonNull View view, @Nullable Object component) {
    return (YemekTasarimBinding)bind(component, view, R.layout.yemek_tasarim);
  }
}