            package p000;
            
            /* JADX INFO: renamed from: h3 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0977h3 extends AbstractC0903f3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f8877a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f8878b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AbstractC0830d3 f8879c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ AbstractC1816k3 f8880d;

                public /* synthetic */ C0977h3(AbstractC1816k3 abstractC1816k3, String str, AbstractC0830d3 abstractC0830d3, int i) {
/* 1 */             this.f8877a = i;
/* 3 */             this.f8880d = abstractC1816k3;
/* 5 */             this.f8878b = str;
/* 7 */             this.f8879c = abstractC0830d3;
                }

                @Override // p000.AbstractC0903f3
                /* JADX INFO: renamed from: a */
                public final void mo3637a(Object obj) {
/* 1 */             int i = this.f8877a;
/* 9 */             String str = this.f8878b;
/* 11 */            AbstractC1816k3 abstractC1816k3 = this.f8880d;
/* 13 */            AbstractC0830d3 abstractC0830d3 = this.f8879c;
                    switch (i) {
                        case 0:
/* 58 */                    Integer num = (Integer) abstractC1816k3.f12567b.get(str);
/* 60 */                    if (num == null) {
/* 82 */                        s80.m8431l("Attempting to launch an unregistered ActivityResultLauncher with contract ", abstractC0830d3, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
/* 85 */                        return;
                            }
/* 64 */                    abstractC1816k3.f12569d.add(str);
                            try {
/* 71 */                        abstractC1816k3.mo5938b(num.intValue(), abstractC0830d3, obj);
/* 85 */                        return;
                            } catch (Exception e) {
/* 78 */                        abstractC1816k3.f12569d.remove(str);
/* 81 */                        throw e;
                            }
                        default:
/* 24 */                    Integer num2 = (Integer) abstractC1816k3.f12567b.get(str);
/* 26 */                    if (num2 == null) {
/* 48 */                        s80.m8431l("Attempting to launch an unregistered ActivityResultLauncher with contract ", abstractC0830d3, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
/* 51 */                        return;
                            }
/* 30 */                    abstractC1816k3.f12569d.add(str);
                            try {
/* 37 */                        abstractC1816k3.mo5938b(num2.intValue(), abstractC0830d3, obj);
/* 51 */                        return;
                            } catch (Exception e2) {
/* 44 */                        abstractC1816k3.f12569d.remove(str);
/* 47 */                        throw e2;
                            }
                    }
                }

                /* JADX INFO: renamed from: b */
                public void m4098b() {
/* 5 */             this.f8880d.m5942f(this.f8878b);
                }
            }
