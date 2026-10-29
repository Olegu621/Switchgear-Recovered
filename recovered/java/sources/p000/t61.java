            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class t61 {
                private static final /* synthetic */ t61[] $VALUES;
                public static final r61 Companion;
                public static final t61 ON_ANY;
                public static final t61 ON_CREATE;
                public static final t61 ON_DESTROY;
                public static final t61 ON_PAUSE;
                public static final t61 ON_RESUME;
                public static final t61 ON_START;
                public static final t61 ON_STOP;

                static {
/* 6 */             t61 t61Var = new t61("ON_CREATE", 0);
/* 9 */             ON_CREATE = t61Var;
/* 16 */            t61 t61Var2 = new t61("ON_START", 1);
/* 19 */            ON_START = t61Var2;
/* 26 */            t61 t61Var3 = new t61("ON_RESUME", 2);
/* 29 */            ON_RESUME = t61Var3;
/* 36 */            t61 t61Var4 = new t61("ON_PAUSE", 3);
/* 39 */            ON_PAUSE = t61Var4;
/* 46 */            t61 t61Var5 = new t61("ON_STOP", 4);
/* 49 */            ON_STOP = t61Var5;
/* 56 */            t61 t61Var6 = new t61("ON_DESTROY", 5);
/* 59 */            ON_DESTROY = t61Var6;
/* 66 */            t61 t61Var7 = new t61("ON_ANY", 6);
/* 69 */            ON_ANY = t61Var7;
/* 75 */            $VALUES = new t61[]{t61Var, t61Var2, t61Var3, t61Var4, t61Var5, t61Var6, t61Var7};
/* 82 */            Companion = new r61();
                }

                public static t61 valueOf(String str) {
/* 7 */             return (t61) Enum.valueOf(t61.class, str);
                }

                public static t61[] values() {
/* 7 */             return (t61[]) $VALUES.clone();
                }

                /* JADX INFO: renamed from: a */
                public final u61 m8704a() {
                    switch (s61.f16449a[ordinal()]) {
                        case 1:
                        case 2:
/* 44 */                    return u61.f17376c;
                        case 3:
                        case 4:
/* 41 */                    return u61.f17377d;
                        case 5:
/* 38 */                    return u61.f17378e;
                        case 6:
/* 35 */                    return u61.f17374a;
                        default:
/* 34 */                    throw new IllegalArgumentException(this + " has no target state");
                    }
                }
            }
