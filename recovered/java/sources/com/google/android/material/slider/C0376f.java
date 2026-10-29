            package com.google.android.material.slider;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: com.google.android.material.slider.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0376f implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 3 */             BaseSlider.SliderState sliderState = new BaseSlider.SliderState(parcel);
/* 10 */            sliderState.f4919a = parcel.readFloat();
/* 16 */            sliderState.f4920b = parcel.readFloat();
/* 20 */            ArrayList arrayList = new ArrayList();
/* 23 */            sliderState.f4921c = arrayList;
/* 31 */            parcel.readList(arrayList, Float.class.getClassLoader());
/* 38 */            sliderState.f4922d = parcel.readFloat();
/* 47 */            sliderState.f4923e = parcel.createBooleanArray()[0];
/* 49 */            return sliderState;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new BaseSlider.SliderState[i];
                }
            }
