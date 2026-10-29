            package p000;

            import java.util.LinkedHashMap;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.json.AbstractC1858b;
            import kotlinx.serialization.json.AbstractC1860d;
            import kotlinx.serialization.json.C1857a;
            import kotlinx.serialization.json.C1859c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class h21 extends c21 {

                /* JADX INFO: renamed from: h */
                public String f8871h;

                /* JADX INFO: renamed from: i */
                public boolean f8872i;

                @Override // p000.c21
                /* JADX INFO: renamed from: J */
                public final AbstractC1858b mo1493J() {
/* 7 */             return new C1859c((LinkedHashMap) this.f2663g);
                }

                @Override // p000.c21
                /* JADX INFO: renamed from: M */
                public final void mo1496M(String str, AbstractC1858b abstractC1858b) {
/* 1 */             str.getClass();
/* 4 */             abstractC1858b.getClass();
/* 9 */             if (!this.f8872i) {
/* 55 */                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f2663g;
/* 57 */                String str2 = this.f8871h;
/* 59 */                if (str2 == null) {
/* 70 */                    Intrinsics.m6220e("tag");
/* 74 */                    throw null;
                        }
/* 61 */                linkedHashMap.put(str2, abstractC1858b);
/* 65 */                this.f8872i = true;
/* 67 */                return;
                    }
/* 13 */            if (abstractC1858b instanceof AbstractC1860d) {
/* 21 */                this.f8871h = ((AbstractC1860d) abstractC1858b).mo6271a();
/* 24 */                this.f8872i = false;
                    } else {
/* 29 */                if (abstractC1858b instanceof C1859c) {
/* 52 */                    throw kb1.m6049b(z11.f19905b);
                        }
/* 33 */                if (abstractC1858b instanceof C1857a) {
/* 45 */                    throw kb1.m6049b(d11.f6956b);
                        }
/* 35 */                ds0.m3187b();
                    }
                }
            }
