            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import androidx.recyclerview.widget.LinearLayoutManager;
            import androidx.recyclerview.widget.RecyclerView;
            import androidx.viewpager.widget.PagerAdapter;
            import com.usercentrics.sdk.p008ui.R$dimen;
            import com.usercentrics.sdk.p008ui.R$id;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rv2 extends PagerAdapter {

                /* JADX INFO: renamed from: a */
                public final ew2 f16323a;

                /* JADX INFO: renamed from: b */
                public final n01 f16324b;

                /* JADX INFO: renamed from: c */
                public final v11 f16325c;

                /* JADX INFO: renamed from: d */
                public List f16326d;

                /* JADX INFO: renamed from: e */
                public final LinkedHashMap f16327e;

                /* JADX INFO: renamed from: f */
                public final LinkedHashMap f16328f;

                public rv2(ew2 ew2Var, n01 n01Var, v11 v11Var) {
/* 1 */             ew2Var.getClass();
/* 7 */             this.f16323a = ew2Var;
/* 9 */             this.f16324b = n01Var;
/* 11 */            this.f16325c = v11Var;
/* 15 */            this.f16326d = nd0.f14189a;
/* 22 */            this.f16327e = new LinkedHashMap();
/* 29 */            this.f16328f = new LinkedHashMap();
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
/* 1 */             viewGroup.getClass();
/* 4 */             obj.getClass();
/* 10 */            viewGroup.removeView((View) obj);
/* 21 */            RecyclerView recyclerView = obj instanceof RecyclerView ? (RecyclerView) obj : null;
/* 22 */            LinkedHashMap linkedHashMap = this.f16327e;
/* 26 */            if (linkedHashMap instanceof r21) {
/* 45 */                gs2.m4013d(linkedHashMap, "kotlin.collections.MutableMap");
/* 48 */                throw null;
                    }
/* 32 */            kv2 kv2Var = (kv2) linkedHashMap.remove(recyclerView);
/* 34 */            if (kv2Var == null) {
/* 36 */                return;
                    }
/* 39 */            this.f16328f.remove(kv2Var);
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final int getCount() {
/* 3 */             return this.f16326d.size();
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final CharSequence getPageTitle(int i) {
                    String str;
/* 7 */             dv2 dv2Var = (dv2) CollectionsKt.m6201v(i, this.f16326d);
                    return (dv2Var == null || (str = dv2Var.f7421a) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : str;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final Object instantiateItem(ViewGroup viewGroup, int i) {
                    int i2;
/* 1 */             viewGroup.getClass();
/* 14 */            int dimension = (int) viewGroup.getResources().getDimension(R$dimen.ucCardVerticalMargin);
/* 22 */            RecyclerView recyclerView = new RecyclerView(viewGroup.getContext(), null);
/* 39 */            recyclerView.setContentDescription("Tab list " + i);
/* 56 */            recyclerView.setTag("page_" + i);
/* 60 */            if (i != 0) {
/* 66 */                i2 = i != 1 ? -1 : R$id.ucHeaderSecondTabRecyclerView;
                    } else {
/* 69 */                i2 = R$id.ucHeaderFirstTabRecyclerView;
                    }
/* 71 */            recyclerView.setId(i2);
/* 76 */            viewGroup.getContext();
/* 82 */            recyclerView.setLayoutManager(new LinearLayoutManager(1));
/* 99 */            n01 n01Var = new n01(1, this, rv2.class, "navigateToCard", "navigateToCard(Ljava/lang/String;)V", 0, 6);
/* 104 */           jv2 jv2Var = new jv2(this, recyclerView, dimension);
/* 107 */           ew2 ew2Var = this.f16323a;
/* 109 */           kv2 kv2Var = new kv2(ew2Var, n01Var, jv2Var);
/* 114 */           this.f16327e.put(recyclerView, kv2Var);
/* 123 */           this.f16328f.put(kv2Var, Integer.valueOf(i));
/* 132 */           dv2 dv2Var = (dv2) CollectionsKt.m6201v(i, this.f16326d);
/* 134 */           if (dv2Var != null) {
/* 136 */               ArrayList arrayList = dv2Var.f7422b;
/* 140 */               qt2.Companion.getClass();
/* 147 */               kv2Var.f13025g = pt2.m7552a(arrayList);
/* 149 */               kv2Var.m958d();
                    }
/* 152 */           recyclerView.setAdapter(kv2Var);
/* 155 */           viewGroup.addView(recyclerView);
/* 160 */           Integer num = ew2Var.f7907a.f18810f;
/* 162 */           if (num != null) {
/* 168 */               recyclerView.setBackgroundColor(num.intValue());
                    }
/* 178 */           recyclerView.post(new f72(recyclerView, 10));
/* 181 */           return recyclerView;
                }

                @Override // androidx.viewpager.widget.PagerAdapter
                public final boolean isViewFromObject(View view, Object obj) {
/* 1 */             view.getClass();
/* 4 */             obj.getClass();
/* 7 */             return Intrinsics.m6216a(view, obj);
                }
            }
