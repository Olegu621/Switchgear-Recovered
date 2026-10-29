            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class wf1 {

                /* JADX INFO: renamed from: a */
                public static final wf1 f18603a;

                /* JADX INFO: renamed from: b */
                public static final wf1 f18604b;

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ wf1[] f18605c;

                static {
/* 6 */             wf1 wf1Var = new wf1("Video", 0);
/* 9 */             f18603a = wf1Var;
/* 16 */            wf1 wf1Var2 = new wf1("Audio", 1);
/* 19 */            f18604b = wf1Var2;
/* 25 */            f18605c = new wf1[]{wf1Var, wf1Var2};
                }

                public static wf1 valueOf(String str) {
/* 7 */             return (wf1) Enum.valueOf(wf1.class, str);
                }

                public static wf1[] values() {
/* 7 */             return (wf1[]) f18605c.clone();
                }

                @Override // java.lang.Enum
                public final String toString() {
/* 1 */             int iOrdinal = ordinal();
/* 5 */             if (iOrdinal == 0) {
/* 18 */                return "video";
                    }
/* 8 */             if (iOrdinal == 1) {
/* 10 */                return "audio";
                    }
/* 13 */            ds0.m3187b();
/* 16 */            return null;
                }
            }
