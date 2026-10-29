            package com.google.firebase;

            import android.content.Context;
            import android.os.Build;
            import com.google.firebase.components.ComponentRegistrar;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.Executor;
            import p000.C1951n4;
            import p000.C2160rx;
            import p000.C2197sx;
            import p000.C2549zf;
            import p000.InterfaceC1027ih;
            import p000.a70;
            import p000.b60;
            import p000.f02;
            import p000.i13;
            import p000.r70;
            import p000.s80;
            import p000.vi0;
            import p000.xt0;
            import p000.yt0;
            import p000.z41;
            import p000.z50;
            import p000.zt0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FirebaseCommonRegistrar implements ComponentRegistrar {
                /* JADX INFO: renamed from: a */
                public static String m2513a(String str) {
/* 11 */            return str.replace(' ', '_').replace('/', '_');
                }

                @Override // com.google.firebase.components.ComponentRegistrar
                public final List getComponents() {
                    String str;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             C2160rx c2160rxM8644b = C2197sx.m8644b(a70.class);
/* 21 */            c2160rxM8644b.m8314a(new r70(2, 0, C2549zf.class));
/* 31 */            c2160rxM8644b.f16334f = new C1951n4(27);
/* 37 */            arrayList.add(c2160rxM8644b.m8315b());
/* 46 */            f02 f02Var = new f02(InterfaceC1027ih.class, Executor.class);
/* 61 */            C2160rx c2160rx = new C2160rx(b60.class, new Class[]{yt0.class, zt0.class});
/* 70 */            c2160rx.m8314a(r70.m8078a(Context.class));
/* 79 */            c2160rx.m8314a(r70.m8078a(vi0.class));
/* 89 */            c2160rx.m8314a(new r70(2, 0, xt0.class));
/* 98 */            c2160rx.m8314a(new r70(1, 1, a70.class));
/* 106 */           c2160rx.m8314a(new r70(f02Var, 1, 0));
/* 114 */           c2160rx.f16334f = new z50(f02Var, 0);
/* 120 */           arrayList.add(c2160rx.m8315b());
/* 135 */           arrayList.add(i13.m4432i("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
/* 146 */           arrayList.add(i13.m4432i("fire-core", "21.0.0"));
/* 161 */           arrayList.add(i13.m4432i("device-name", m2513a(Build.PRODUCT)));
/* 176 */           arrayList.add(i13.m4432i("device-model", m2513a(Build.DEVICE)));
/* 191 */           arrayList.add(i13.m4432i("device-brand", m2513a(Build.BRAND)));
/* 207 */           arrayList.add(i13.m4437p("android-target-sdk", new s80(10)));
/* 223 */           arrayList.add(i13.m4437p("android-min-sdk", new s80(11)));
/* 239 */           arrayList.add(i13.m4437p("android-platform", new s80(12)));
/* 255 */           arrayList.add(i13.m4437p("android-installer", new s80(13)));
                    try {
/* 260 */               z41.f19930c.getClass();
/* 263 */               str = "2.2.10";
                    } catch (NoClassDefFoundError unused) {
/* 266 */               str = null;
                    }
/* 267 */           if (str != null) {
/* 275 */               arrayList.add(i13.m4432i("kotlin", str));
                    }
/* 278 */           return arrayList;
                }
            }
