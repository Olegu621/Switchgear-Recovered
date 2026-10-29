            package com.supercell.p007id.scid_plugin;

            import android.util.Size;
            import kotlin.Pair;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C0210cb;
            import p000.C1929mj;
            import p000.C2107qh;
            import p000.C2473xt;
            import p000.InterfaceC1838ko;
            import p000.InterfaceC2469xp;
            import p000.c10;
            import p000.cs1;
            import p000.gb1;
            import p000.i13;
            import p000.kt0;
            import p000.lw0;
            import p000.m60;
            import p000.mw0;
            import p000.pg3;
            import p000.ra2;
            import p000.sz0;
            import p000.tj2;
            import p000.un1;
            import p000.wc0;
            import p000.y10;
            import p000.yl0;
            import p000.z10;
            import p000.z80;
            
            /* JADX INFO: renamed from: com.supercell.id.scid_plugin.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0782a extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public /* synthetic */ Object f5693a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ MobileScanner f5694b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ mw0 f5695c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0782a(MobileScanner mobileScanner, mw0 mw0Var, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.f5694b = mobileScanner;
/* 3 */             this.f5695c = mw0Var;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             C0782a c0782a = new C0782a(this.f5694b, this.f5695c, c10Var);
/* 10 */            c0782a.f5693a = obj;
/* 12 */            return c0782a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((C0782a) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
                    kt0 kt0Var;
                    C1929mj c1929mj;
                    wc0 wc0VarM13a;
                    InterfaceC2469xp interfaceC2469xpMo6170a;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 8 */             y10 y10Var = (y10) this.f5693a;
/* 10 */            MobileScanner mobileScanner = this.f5694b;
/* 1 */             InterfaceC1838ko interfaceC1838ko = mobileScanner.camera;
/* 37 */            boolean z = ((interfaceC1838ko == null || (interfaceC2469xpMo6170a = interfaceC1838ko.mo6170a()) == null) ? 0 : interfaceC2469xpMo6170a.mo309a()) % 180 == 0;
/* 38 */            mw0 mw0Var = this.f5695c;
/* 75 */            Pair<Integer, Integer> pairCalculateAdjustedScanSize = mobileScanner.calculateAdjustedScanSize(new Size(z ? mw0Var.getWidth() : mw0Var.getHeight(), z ? mw0Var.getHeight() : mw0Var.getWidth()), mobileScanner.viewFinderSize, mobileScanner.scanWindowSize);
/* 83 */            int iIntValue = ((Number) pairCalculateAdjustedScanSize.f12908a).intValue();
/* 91 */            int iIntValue2 = ((Number) pairCalculateAdjustedScanSize.f12909b).intValue();
/* 95 */            int width = mw0Var.getWidth();
/* 99 */            int height = mw0Var.getHeight();
/* 103 */           int iMin = Math.min(iIntValue, width);
/* 107 */           int iMin2 = Math.min(iIntValue2, height);
/* 115 */           int iMax = Math.max(0, (width - iMin) / 2);
/* 122 */           int iMax2 = Math.max(0, (height - iMin2) / 2);
/* 136 */           int iMin3 = Math.min(width, iMin + iMax) - iMax;
/* 138 */           int iMin4 = Math.min(height, iMin2 + iMax2) - iMax2;
/* 140 */           ConversionUtils.Companion companion = ConversionUtils.INSTANCE;
/* 142 */           lw0[] lw0VarArrMo1726j = mw0Var.mo1726j();
/* 146 */           lw0VarArrMo1726j.getClass();
/* 155 */           cs1 cs1Var = new cs1(companion.YUV_420_888toNV21(lw0VarArrMo1726j, width, height), width, height, iMax, iMax2, iMin3, iMin4);
                    try {
                        try {
/* 164 */                   mobileScanner.reader.getClass();
                            try {
/* 183 */                       wc0VarM13a = mobileScanner.reader.m13a(new C0210cb(new ra2(cs1Var), 10));
                            } catch (un1 unused) {
/* 211 */                       wc0VarM13a = mobileScanner.reader.m13a(new C0210cb(new ra2(new sz0(cs1Var)), 10));
                            }
/* 217 */                   String str = (String) wc0VarM13a.f18577b;
/* 219 */                   str.getClass();
/* 226 */                   if (str.length() > 0) {
/* 228 */                       mobileScanner.setScanCode(false);
/* 231 */                       m60 m60Var = z80.f19975a;
/* 241 */                       i13.m4443w(y10Var, gb1.f8531a, new C2107qh(mobileScanner, str, null, 7), 2);
                            }
/* 244 */                   m60 m60Var2 = z80.f19975a;
/* 246 */                   kt0Var = gb1.f8531a;
/* 250 */                   c1929mj = new C1929mj(mw0Var, null, 5);
                        } catch (Exception e) {
/* 259 */                   if (!(e instanceof un1) && !(e instanceof C2473xt) && !(e instanceof yl0)) {
/* 269 */                       m60 m60Var3 = z80.f19975a;
/* 280 */                       i13.m4443w(y10Var, gb1.f8531a, new C2107qh(mobileScanner, e, null, 9), 2);
                            }
/* 283 */                   m60 m60Var4 = z80.f19975a;
/* 285 */                   kt0Var = gb1.f8531a;
/* 289 */                   c1929mj = new C1929mj(mw0Var, null, 5);
                        }
/* 253 */               i13.m4443w(y10Var, kt0Var, c1929mj, 2);
/* 293 */               return Unit.f12910a;
                    } catch (Throwable th) {
/* 296 */               m60 m60Var5 = z80.f19975a;
/* 305 */               i13.m4443w(y10Var, gb1.f8531a, new C1929mj(mw0Var, null, 5), 2);
/* 308 */               throw th;
                    }
                }
            }
