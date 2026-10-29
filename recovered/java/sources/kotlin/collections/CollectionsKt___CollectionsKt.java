            package kotlin.collections;

            import java.util.AbstractCollection;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.C2346ww;
            import p000.yh2;
            
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\u001f\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m6176d2 = {"T", HttpUrl.FRAGMENT_ENCODE_SET, "firstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "kotlin-stdlib"}, m6177k = 5, m6178mv = {2, 2, 0}, m6180xi = 49, m6181xs = "kotlin/collections/CollectionsKt")
            public class CollectionsKt___CollectionsKt extends C2346ww {
                public static <T> T firstOrNull(List<? extends T> list) {
/* 1 */             list.getClass();
/* 8 */             if (list.isEmpty()) {
/* 10 */                return null;
                    }
/* 13 */            return list.get(0);
                }

                /* JADX INFO: renamed from: o */
                public static final void m6206o(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
/* 1 */             iterable.getClass();
/* 4 */             charSequence.getClass();
/* 7 */             sb.append(charSequence2);
/* 14 */            int i = 0;
/* 19 */            for (Object obj : iterable) {
/* 26 */                i++;
/* 27 */                if (i > 1) {
/* 29 */                    sb.append(charSequence);
                        }
/* 32 */                yh2.m10149a(sb, obj, function1);
                    }
/* 36 */            sb.append(charSequence3);
                }

                /* JADX INFO: renamed from: p */
                public static final void m6207p(Iterable iterable, AbstractCollection abstractCollection) {
/* 1 */             iterable.getClass();
/* 4 */             Iterator it = iterable.iterator();
/* 12 */            while (it.hasNext()) {
/* 18 */                abstractCollection.add(it.next());
                    }
                }

                /* JADX INFO: renamed from: q */
                public static final List m6208q(Iterable iterable) {
/* 1 */             iterable.getClass();
/* 6 */             if (iterable instanceof Collection) {
/* 12 */                return new ArrayList((Collection) iterable);
                    }
/* 18 */            ArrayList arrayList = new ArrayList();
/* 21 */            m6207p(iterable, arrayList);
/* 24 */            return arrayList;
                }
            }
