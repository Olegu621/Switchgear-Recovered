            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.ImageView;
            import android.widget.LinearLayout;
            import androidx.fragment.app.Fragment;
            import com.helpshift.R$id;
            import com.helpshift.R$layout;
            import com.helpshift.activities.HSMainActivity;
            import com.helpshift.views.HSWebView;
            import java.lang.ref.WeakReference;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class xs0 extends Fragment implements View.OnClickListener {

                /* JADX INFO: renamed from: a */
                public HSWebView f19345a;

                /* JADX INFO: renamed from: b */
                public View f19346b;

                /* JADX INFO: renamed from: c */
                public View f19347c;

                /* JADX INFO: renamed from: d */
                public LinearLayout f19348d;

                /* JADX INFO: renamed from: e */
                public HSMainActivity f19349e;

                /* JADX INFO: renamed from: f */
                public ra2 f19350f;

                /* JADX INFO: renamed from: h */
                public static we2 m10021h(Bundle bundle) {
                    String string;
/* 3 */             String string2 = bundle.getString("HELPCENTER_MODE");
/* 7 */             string2.getClass();
/* 12 */            boolean zEquals = string2.equals("FAQ_SECTION");
/* 16 */            String string3 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 18 */            if (zEquals) {
/* 42 */                string = bundle.getString("FAQ_SECTION_ID");
                    } else if (string2.equals("SINGLE_FAQ")) {
/* 32 */                string3 = bundle.getString("SINGLE_FAQ_PUBLISH_ID");
/* 38 */                string = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
/* 28 */                string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 51 */            return new we2(string3, string, 9, false);
                }

                /* JADX INFO: renamed from: g */
                public final void m10022g(String str) {
/* 13 */            rs0.f16254y.f16271p.m8115t(new dp0(this, str, 12, false));
                }

                /* JADX INFO: renamed from: i */
                public final void m10023i() {
/* 3 */             C1969nm c1969nm = rs0.f16254y.f16261f;
/* 5 */             int iM7006i = c1969nm.m7006i();
/* 22 */            int iIntValue = ((Integer) c1969nm.m7008k(0, "push_unread_count")).intValue();
/* 26 */            if (iM7006i > 0 || iIntValue > 0) {
/* 48 */                m10022g("Helpcenter(JSON.stringify({ \"eventType\": \"showNotifBadge\", \"config\": { \"notifCount\": %count } }));".replace("%count", String.valueOf(Math.max(iM7006i, iIntValue))));
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m10024j(boolean z) {
/* 7 */             if (this.f19346b.getVisibility() != 0) {
/* 31 */                m10022g("Helpcenter( JSON.stringify({ \"eventType\": \"sdkxIsInForeground\", \"config\": %foreground }));".replace("%foreground", HttpUrl.FRAGMENT_ENCODE_SET + z));
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m10025k(Bundle bundle) throws Throwable {
                    String strReplace;
/* 9 */             if (bundle == null) {
/* 13 */                xe2.m9777o("HelpCenter", "Bundle received in Helpcenter fragment is null.", null);
/* 18 */                this.f19347c.setVisibility(0);
/* 23 */                this.f19346b.setVisibility(8);
/* 26 */                return;
                    }
/* 27 */            we2 we2VarM10021h = m10021h(bundle);
/* 33 */            C0875ec c0875ec = rs0.f16254y.f16275t;
/* 35 */            Context context = getContext();
/* 41 */            String str = (String) we2VarM10021h.f18596c;
/* 45 */            String str2 = (String) we2VarM10021h.f18595b;
/* 55 */            if (b40.m1232p((String) c0875ec.f7614c)) {
/* 59 */                String strM10195A = yy1.m10195A(context, "helpshift/Helpcenter.js");
/* 67 */                if (b40.m1232p(strM10195A)) {
/* 69 */                    strReplace = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
/* 81 */                    c0875ec.f7614c = strM10195A.replace("%cdn", "https://d2duuy9yo5pldo.cloudfront.net/android/helpcenter.js");
/* 101 */                   strReplace = ((String) c0875ec.f7614c).replace("%config", ((C1773iy) c0875ec.f7615d).m5617l(str, str2, rs0.f16254y.f16256a));
                        }
                    } else {
/* 101 */               strReplace = ((String) c0875ec.f7614c).replace("%config", ((C1773iy) c0875ec.f7615d).m5617l(str, str2, rs0.f16254y.f16256a));
                    }
/* 71 */            String str3 = strReplace;
/* 110 */           if (b40.m1232p(str3)) {
/* 114 */               xe2.m9777o("HelpCenter", "Error in reading the source code from assets folder.", null);
/* 119 */               this.f19347c.setVisibility(0);
/* 124 */               this.f19346b.setVisibility(8);
/* 127 */               return;
                    }
/* 130 */           this.f19346b.setVisibility(0);
/* 135 */           this.f19347c.setVisibility(8);
/* 140 */           xe2.m9775m("HelpCenter", "Webview is launched", null);
/* 143 */           rs0 rs0Var = rs0.f16254y;
/* 145 */           C1969nm c1969nm = rs0Var.f16267l;
/* 147 */           Context context2 = rs0Var.f16279x;
/* 149 */           if (c1969nm == null) {
/* 197 */               rs0Var.f16267l = new C1969nm(new er0(context2, "__hs_helpcenter_resource_cache"), new zb0(new p62(7), 12), new ec0(10), context2.getCacheDir().getAbsolutePath(), "https://d2duuy9yo5pldo.cloudfront.net/hc-android-mapping.json", "helpcenter_cacheURLs", "helpcenter");
                    }
/* 199 */           C1969nm c1969nm2 = rs0Var.f16267l;
/* 203 */           C1773iy c1773iy = rs0Var.f16260e;
/* 205 */           ra2 ra2Var = rs0Var.f16271p;
/* 207 */           ra2 ra2Var2 = new ra2();
/* 210 */           ra2Var2.f15956b = c1773iy;
/* 212 */           ra2Var2.f15957c = ra2Var;
/* 214 */           ra2Var2.f15958d = c1969nm2;
/* 216 */           this.f19350f = ra2Var2;
/* 223 */           ra2Var2.f15955a = new WeakReference(this);
/* 225 */           HSWebView hSWebView = this.f19345a;
/* 229 */           zs0 zs0Var = new zs0();
/* 232 */           zs0Var.f20318a = c1969nm2;
/* 234 */           hSWebView.setWebViewClient(zs0Var);
/* 237 */           HSWebView hSWebView2 = this.f19345a;
/* 241 */           ra2 ra2Var3 = this.f19350f;
/* 243 */           ys0 ys0Var = new ys0();
/* 246 */           ys0Var.f19800a = ra2Var3;
/* 248 */           hSWebView2.setWebChromeClient(ys0Var);
/* 251 */           HSWebView hSWebView3 = this.f19345a;
/* 255 */           ra2 ra2Var4 = this.f19350f;
/* 257 */           au0 au0Var = new au0();
/* 260 */           au0Var.f2093a = ra2Var4;
/* 264 */           hSWebView3.addJavascriptInterface(au0Var, "HCInterface");
/* 276 */           this.f19345a.loadDataWithBaseURL("https://localhost", str3, "text/html", "utf-8", null);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
/* 1 */             int id = view.getId();
/* 7 */             if (id != R$id.hs__loading_view_close_btn && id != R$id.hs__retry_view_close_btn) {
/* 16 */                if (id == R$id.hs__retry_button) {
/* 22 */                    m10025k(getArguments());
                        }
                    } else {
/* 26 */                HSMainActivity hSMainActivity = this.f19349e;
/* 28 */                if (hSMainActivity != null) {
/* 30 */                    hSMainActivity.onBackPressed();
                        }
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
/* 22 */            xe2.m9775m("HelpCenter", "onCreateView - " + hashCode(), null);
/* 28 */            return layoutInflater.inflate(R$layout.hs__helpcenter_layout, viewGroup, false);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 25 */            xe2.m9775m("HelpCenter", "onDestroy - " + hashCode(), null);
/* 30 */            C0168b5 c0168b5 = rs0.f16254y.f16263h;
/* 32 */            c0168b5.getClass();
/* 40 */            c0168b5.f2214e = new WeakReference(null);
/* 42 */            ra2 ra2Var = this.f19350f;
/* 44 */            if (ra2Var != null) {
/* 51 */                ra2Var.f15955a = new WeakReference(null);
                    }
/* 56 */            rs0.f16254y.f16258c = false;
/* 62 */            this.f19348d.removeView(this.f19345a);
/* 65 */            HSWebView hSWebView = this.f19345a;
/* 67 */            hSWebView.removeAllViews();
/* 70 */            hSWebView.destroy();
/* 73 */            this.f19345a = null;
                }

                @Override // androidx.fragment.app.Fragment
                public final void onStart() {
/* 1 */             super.onStart();
/* 25 */            xe2.m9775m("HelpCenter", "onStart - " + hashCode(), null);
/* 30 */            C0168b5 c0168b5 = rs0.f16254y.f16263h;
/* 32 */            c0168b5.getClass();
/* 40 */            c0168b5.f2214e = new WeakReference(this);
/* 43 */            m10024j(false);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onStop() {
/* 1 */             super.onStop();
/* 5 */             m10024j(true);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onViewCreated(View view, Bundle bundle) throws Throwable {
/* 1 */             super.onViewCreated(view, bundle);
/* 25 */            xe2.m9775m("HelpCenter", "onViewCreated - " + hashCode(), null);
/* 28 */            Bundle arguments = getArguments();
/* 40 */            this.f19345a = (HSWebView) view.findViewById(R$id.hs__helpcenter_view);
/* 48 */            this.f19346b = view.findViewById(R$id.hs__loading_view);
/* 60 */            ((ImageView) view.findViewById(R$id.hs__chat_image)).setVisibility(8);
/* 69 */            this.f19347c = view.findViewById(R$id.hs__retry_view);
/* 79 */            this.f19348d = (LinearLayout) view.findViewById(R$id.hs__helpcenter_layout);
/* 87 */            view.findViewById(R$id.hs__retry_view_close_btn).setOnClickListener(this);
/* 96 */            view.findViewById(R$id.hs__loading_view_close_btn).setOnClickListener(this);
/* 105 */           view.findViewById(R$id.hs__retry_button).setOnClickListener(this);
/* 108 */           m10025k(arguments);
                }
            }
