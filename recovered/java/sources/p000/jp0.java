            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum jp0 implements InterfaceC2071pi {
                /* JADX INFO: Fake field, exist only in values array */
                CATEGORY("Category"),
                /* JADX INFO: Fake field, exist only in values array */
                SERVICE("Service");


                /* JADX INFO: renamed from: a */
                public final String f12416a;

                jp0(String str) {
/* 4 */             this.f12416a = str;
                }

                @Override // p000.InterfaceC2071pi
                public final String getPrefix() {
/* 1 */             return this.f12416a;
                }
            }
