            package com.google.android.flexbox;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.view.ViewGroup;
            
            /* JADX INFO: renamed from: com.google.android.flexbox.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0315d implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 4 */             FlexboxLayoutManager.LayoutParams layoutParams = new FlexboxLayoutManager.LayoutParams(-2, -2);
/* 8 */             layoutParams.f3183e = 0.0f;
/* 12 */            layoutParams.f3184f = 1.0f;
/* 15 */            layoutParams.f3185i = -1;
/* 19 */            layoutParams.f3186v = -1.0f;
/* 24 */            layoutParams.f3180V = 16777215;
/* 26 */            layoutParams.f3181W = 16777215;
/* 32 */            layoutParams.f3183e = parcel.readFloat();
/* 38 */            layoutParams.f3184f = parcel.readFloat();
/* 44 */            layoutParams.f3185i = parcel.readInt();
/* 50 */            layoutParams.f3186v = parcel.readFloat();
/* 56 */            layoutParams.f3187w = parcel.readInt();
/* 62 */            layoutParams.f3179U = parcel.readInt();
/* 68 */            layoutParams.f3180V = parcel.readInt();
/* 74 */            layoutParams.f3181W = parcel.readInt();
/* 85 */            layoutParams.f3182X = parcel.readByte() != 0;
/* 91 */            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
/* 97 */            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
/* 103 */           ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
/* 109 */           ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
/* 115 */           ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
/* 121 */           ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
/* 123 */           return layoutParams;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new FlexboxLayoutManager.LayoutParams[i];
                }
            }
