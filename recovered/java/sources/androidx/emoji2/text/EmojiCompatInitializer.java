            package androidx.emoji2.text;

            import android.content.Context;
            import androidx.lifecycle.ProcessLifecycleInitializer;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import p000.C0875ec;
            import p000.C2214td;
            import p000.g71;
            import p000.ml0;
            import p000.sc0;
            import p000.tc0;
            import p000.v61;
            import p000.wx0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class EmojiCompatInitializer implements wx0 {
                @Override // p000.wx0
                public final Object create(Context context) {
                    Object objM3394r;
/* 9 */             ml0 ml0Var = new ml0(new C2214td(context, 1));
/* 12 */            ml0Var.f15060a = 1;
/* 16 */            if (sc0.f16512k == null) {
                        synchronized (sc0.f16511j) {
                            try {
/* 23 */                        if (sc0.f16512k == null) {
/* 30 */                            sc0.f16512k = new sc0(ml0Var);
                                }
                            } catch (Throwable th) {
/* 38 */                        throw th;
                            }
                        }
                    }
/* 39 */            C0875ec c0875ecM3362v = C0875ec.m3362v(context);
/* 45 */            c0875ecM3362v.getClass();
                    synchronized (C0875ec.f7611f) {
                        try {
/* 55 */                    objM3394r = ((HashMap) c0875ecM3362v.f7613b).get(ProcessLifecycleInitializer.class);
/* 59 */                    if (objM3394r == null) {
/* 66 */                        objM3394r = c0875ecM3362v.m3394r(ProcessLifecycleInitializer.class, new HashSet());
                            }
                        } catch (Throwable th2) {
/* 92 */                    throw th2;
                        }
                    }
/* 76 */            v61 lifecycle = ((g71) objM3394r).getLifecycle();
/* 85 */            lifecycle.mo4483a(new tc0(this, lifecycle));
/* 88 */            return Boolean.TRUE;
                }

                @Override // p000.wx0
                public final List dependencies() {
/* 3 */             return Collections.singletonList(ProcessLifecycleInitializer.class);
                }
            }
