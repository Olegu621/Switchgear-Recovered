            package com.quago.mobile.sdk;

            import android.os.Build;
            import android.view.InputDevice;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.i0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0737i0 {

                /* JADX INFO: renamed from: a */
                public final int f5480a;

                /* JADX INFO: renamed from: b */
                public final int f5481b;

                /* JADX INFO: renamed from: c */
                public final int f5482c;

                /* JADX INFO: renamed from: d */
                public final int f5483d;

                /* JADX INFO: renamed from: e */
                public final int f5484e;

                /* JADX INFO: renamed from: f */
                public final int f5485f;

                /* JADX INFO: renamed from: g */
                public final String f5486g;

                /* JADX INFO: renamed from: h */
                public final Boolean f5487h;

                /* JADX INFO: renamed from: i */
                public final Boolean f5488i;

                public C0737i0(int i, InputDevice inputDevice) {
/* 4 */             this.f5480a = i;
/* 10 */            this.f5486g = inputDevice.getName();
/* 20 */            this.f5481b = AbstractC0730g.m2574a(inputDevice.getSources());
/* 26 */            this.f5482c = inputDevice.getKeyboardType();
/* 32 */            this.f5488i = m2607a(inputDevice);
/* 42 */            this.f5487h = Boolean.valueOf(inputDevice.isVirtual());
/* 48 */            this.f5483d = inputDevice.getVendorId();
/* 54 */            this.f5485f = inputDevice.getProductId();
/* 60 */            this.f5484e = inputDevice.getControllerNumber();
                }

                /* JADX INFO: renamed from: a */
                public static Boolean m2607a(InputDevice inputDevice) {
                    try {
                        return Build.VERSION.SDK_INT >= 29 ? Boolean.valueOf(inputDevice.isExternal()) : (Boolean) InputDevice.class.getMethod("isExternal", null).invoke(inputDevice, null);
                    } catch (Exception unused) {
/* 1 */                 return null;
                    }
                }
            }
