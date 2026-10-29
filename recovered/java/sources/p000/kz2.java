            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum kz2 {
                ACCEPT_ALL_SERVICES("onAcceptAllServices"),
                DENY_ALL_SERVICES("onDenyAllServices"),
                ESSENTIAL_CHANGE("onEssentialChange"),
                INITIAL_PAGE_LOAD("onInitialPageLoad"),
                NON_EU_REGION("onNonEURegion"),
                SESSION_RESTORED("onSessionRestored"),
                TCF_STRING_CHANGE("onTcfStringChange"),
                UPDATE_SERVICES("onUpdateServices");

                public static final jz2 Companion = new jz2();

                /* JADX INFO: renamed from: a */
                public final String f13055a;

                kz2(String str) {
/* 4 */             this.f13055a = str;
                }

                /* JADX INFO: renamed from: a */
                public final mz2 m6318a() {
                    switch (this) {
                        case ACCEPT_ALL_SERVICES:
/* 34 */                    return mz2.f14076a;
                        case DENY_ALL_SERVICES:
/* 31 */                    return mz2.f14076a;
                        case ESSENTIAL_CHANGE:
/* 28 */                    return mz2.f14077b;
                        case INITIAL_PAGE_LOAD:
/* 25 */                    return mz2.f14077b;
                        case NON_EU_REGION:
/* 22 */                    return mz2.f14077b;
                        case SESSION_RESTORED:
/* 19 */                    return mz2.f14077b;
                        case TCF_STRING_CHANGE:
/* 16 */                    return mz2.f14076a;
                        case UPDATE_SERVICES:
/* 13 */                    return mz2.f14076a;
                        default:
/* 8 */                     ds0.m3187b();
/* 11 */                    return null;
                    }
                }
            }
