            package com.google.firebase.concurrent;

            import com.google.firebase.components.ComponentRegistrar;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.List;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ScheduledExecutorService;
            import p000.C0971gy;
            import p000.C2160rx;
            import p000.C2197sx;
            import p000.InterfaceC1027ih;
            import p000.InterfaceC2296vj;
            import p000.f02;
            import p000.gx2;
            import p000.l71;
            import p000.q51;
            import p000.s80;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ExecutorsRegistrar implements ComponentRegistrar {

                /* JADX INFO: renamed from: a */
                public static final q51 f5284a = new q51(new C0971gy(1));

                /* JADX INFO: renamed from: b */
                public static final q51 f5285b = new q51(new C0971gy(2));

                /* JADX INFO: renamed from: c */
                public static final q51 f5286c = new q51(new C0971gy(3));

                /* JADX INFO: renamed from: d */
                public static final q51 f5287d = new q51(new C0971gy(4));

                @Override // com.google.firebase.components.ComponentRegistrar
                public final List getComponents() {
/* 7 */             f02 f02Var = new f02(InterfaceC1027ih.class, ScheduledExecutorService.class);
/* 24 */            f02[] f02VarArr = {new f02(InterfaceC1027ih.class, ExecutorService.class), new f02(InterfaceC1027ih.class, Executor.class)};
/* 30 */            HashSet hashSet = new HashSet();
/* 35 */            HashSet hashSet2 = new HashSet();
/* 40 */            HashSet hashSet3 = new HashSet();
/* 43 */            hashSet.add(f02Var);
/* 51 */            for (f02 f02Var2 : f02VarArr) {
/* 55 */                xe2.m9769g(f02Var2, "Null interface");
                    }
/* 61 */            Collections.addAll(hashSet, f02VarArr);
/* 84 */            C2197sx c2197sx = new C2197sx(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s80(3), hashSet3);
/* 91 */            f02 f02Var3 = new f02(InterfaceC2296vj.class, ScheduledExecutorService.class);
/* 104 */           f02[] f02VarArr2 = {new f02(InterfaceC2296vj.class, ExecutorService.class), new f02(InterfaceC2296vj.class, Executor.class)};
/* 110 */           HashSet hashSet4 = new HashSet();
/* 115 */           HashSet hashSet5 = new HashSet();
/* 120 */           HashSet hashSet6 = new HashSet();
/* 123 */           hashSet4.add(f02Var3);
/* 131 */           for (f02 f02Var4 : f02VarArr2) {
/* 135 */               xe2.m9769g(f02Var4, "Null interface");
                    }
/* 141 */           Collections.addAll(hashSet4, f02VarArr2);
/* 172 */           C2197sx c2197sx2 = new C2197sx(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new s80(4), hashSet6);
/* 181 */           f02 f02Var5 = new f02(l71.class, ScheduledExecutorService.class);
/* 194 */           f02[] f02VarArr3 = {new f02(l71.class, ExecutorService.class), new f02(l71.class, Executor.class)};
/* 200 */           HashSet hashSet7 = new HashSet();
/* 205 */           HashSet hashSet8 = new HashSet();
/* 210 */           HashSet hashSet9 = new HashSet();
/* 213 */           hashSet7.add(f02Var5);
/* 221 */           for (f02 f02Var6 : f02VarArr3) {
/* 225 */               xe2.m9769g(f02Var6, "Null interface");
                    }
/* 231 */           Collections.addAll(hashSet7, f02VarArr3);
/* 262 */           C2197sx c2197sx3 = new C2197sx(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new s80(5), hashSet9);
/* 274 */           C2160rx c2160rxM8643a = C2197sx.m8643a(new f02(gx2.class, Executor.class));
/* 284 */           c2160rxM8643a.f16334f = new s80(6);
/* 294 */           return Arrays.asList(c2197sx, c2197sx2, c2197sx3, c2160rxM8643a.m8315b());
                }
            }
