            package com.google.android.flexbox;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.view.ViewGroup;
            
            /* JADX INFO: renamed from: com.google.android.flexbox.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0314c implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
/* 4 */             FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(0, 0);
/* 8 */             layoutParams.f3145a = 1;
/* 11 */            layoutParams.f3146b = 0.0f;
/* 15 */            layoutParams.f3147c = 1.0f;
/* 18 */            layoutParams.f3148d = -1;
/* 22 */            layoutParams.f3149e = -1.0f;
/* 24 */            layoutParams.f3150f = -1;
/* 26 */            layoutParams.f3151i = -1;
/* 31 */            layoutParams.f3152v = 16777215;
/* 33 */            layoutParams.f3153w = 16777215;
/* 39 */            layoutParams.f3145a = parcel.readInt();
/* 45 */            layoutParams.f3146b = parcel.readFloat();
/* 51 */            layoutParams.f3147c = parcel.readFloat();
/* 57 */            layoutParams.f3148d = parcel.readInt();
/* 63 */            layoutParams.f3149e = parcel.readFloat();
/* 69 */            layoutParams.f3150f = parcel.readInt();
/* 75 */            layoutParams.f3151i = parcel.readInt();
/* 81 */            layoutParams.f3152v = parcel.readInt();
/* 87 */            layoutParams.f3153w = parcel.readInt();
/* 96 */            layoutParams.f3144U = parcel.readByte() != 0;
/* 102 */           ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = parcel.readInt();
/* 108 */           ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = parcel.readInt();
/* 114 */           ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = parcel.readInt();
/* 120 */           ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = parcel.readInt();
/* 126 */           ((ViewGroup.MarginLayoutParams) layoutParams).height = parcel.readInt();
/* 132 */           ((ViewGroup.MarginLayoutParams) layoutParams).width = parcel.readInt();
/* 134 */           return layoutParams;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
/* 1 */             return new FlexboxLayout.LayoutParams[i];
                }
            }
