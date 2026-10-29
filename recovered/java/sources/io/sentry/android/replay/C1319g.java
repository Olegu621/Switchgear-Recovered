            package io.sentry.android.replay;

            import io.sentry.rrweb.AbstractC1647b;
            import java.util.Comparator;
            import p000.C1772ix;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1319g implements Comparator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10531a;

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    switch (this.f10531a) {
                        case 0:
/* 43 */                    return C1772ix.m5609a(Long.valueOf(((C1327l) obj).f10562b), Long.valueOf(((C1327l) obj2).f10562b));
                        default:
/* 22 */                    return C1772ix.m5609a(Long.valueOf(((AbstractC1647b) obj).f11589b), Long.valueOf(((AbstractC1647b) obj2).f11589b));
                    }
                }
            }
