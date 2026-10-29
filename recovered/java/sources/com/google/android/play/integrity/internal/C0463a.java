            package com.google.android.play.integrity.internal;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            
            /* JADX INFO: renamed from: com.google.android.play.integrity.internal.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C0463a implements IInterface {

                /* JADX INFO: renamed from: a */
                public final IBinder f5278a;

                /* JADX INFO: renamed from: b */
                public final String f5279b;

                public C0463a(IBinder iBinder, String str) {
/* 4 */             this.f5278a = iBinder;
/* 6 */             this.f5279b = str;
                }

                /* JADX INFO: renamed from: a */
                public final void m2505a(int i, Parcel parcel) {
                    try {
/* 5 */                 this.f5278a.transact(i, parcel, null, 1);
                    } finally {
/* 13 */                parcel.recycle();
                    }
                }

                @Override // android.os.IInterface
                public final IBinder asBinder() {
/* 1 */             return this.f5278a;
                }
            }
