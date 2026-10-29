            package p000;
            
            /* JADX INFO: renamed from: or */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class C2043or implements InterfaceC2299vm {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C2154rr f14868a;

                public /* synthetic */ C2043or(C2154rr c2154rr) {
/* 1 */             this.f14868a = c2154rr;
                }

                /* JADX INFO: renamed from: a */
                public void m7235a() {
/* 1 */             C2154rr c2154rr = this.f14868a;
                    synchronized (c2154rr.f16232a) {
                        try {
/* 9 */                     if (c2154rr.f16240i == 5) {
/* 13 */                        c2154rr.m8235h(c2154rr.f16237f);
                            }
                        } catch (Throwable th) {
/* 22 */                    throw th;
                        }
                    }
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public Object mo1148w(C2260um c2260um) {
                    String str;
/* 1 */             C2154rr c2154rr = this.f14868a;
                    synchronized (c2154rr.f16232a) {
/* 17 */                de3.m3028j("Release completer expected to be null", c2154rr.f16242k == null);
/* 20 */                c2154rr.f16242k = c2260um;
/* 35 */                str = "Release[session=" + c2154rr + "]";
                    }
/* 40 */            return str;
                }
            }
