            package kotlin.collections;

            import java.util.Collections;
            import java.util.List;
            import p000.z71;
            
            /* JADX INFO: renamed from: kotlin.collections.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class C1839a {
                /* JADX INFO: renamed from: a */
                public static z71 m6209a(z71 z71Var) {
/* 1 */             z71Var.m10280f();
/* 5 */             z71Var.f19967c = true;
                    return z71Var.f19966b > 0 ? z71Var : z71.f19964e;
                }

                /* JADX INFO: renamed from: b */
                public static List m6210b(Object obj) {
/* 1 */             List listSingletonList = Collections.singletonList(obj);
/* 5 */             listSingletonList.getClass();
/* 8 */             return listSingletonList;
                }

                /* JADX INFO: renamed from: c */
                public static List m6211c(List list) {
/* 1 */             list.getClass();
/* 4 */             List listM6208q = CollectionsKt___CollectionsKt.m6208q(list);
/* 8 */             Collections.shuffle(listM6208q);
/* 11 */            return listM6208q;
                }
            }
