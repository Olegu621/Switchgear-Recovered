            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.content.res.Configuration;
            import android.net.ConnectivityManager;
            import android.os.Bundle;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.webkit.ValueCallback;
            import android.webkit.WebChromeClient;
            import android.widget.LinearLayout;
            import androidx.fragment.app.Fragment;
            import androidx.fragment.app.FragmentActivity;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.helpshift.R$id;
            import com.helpshift.R$layout;
            import com.helpshift.activities.HSMainActivity;
            import com.helpshift.views.HSWebView;
            import java.lang.ref.WeakReference;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ls0 extends Fragment implements View.OnClickListener, ct0 {

                /* JADX INFO: renamed from: U */
                public String f13471U;

                /* JADX INFO: renamed from: W */
                public String f13473W;

                /* JADX INFO: renamed from: X */
                public boolean f13474X;

                /* JADX INFO: renamed from: a */
                public ValueCallback f13476a;

                /* JADX INFO: renamed from: c */
                public HSWebView f13478c;

                /* JADX INFO: renamed from: d */
                public ns0 f13479d;

                /* JADX INFO: renamed from: e */
                public LinearLayout f13480e;

                /* JADX INFO: renamed from: f */
                public View f13481f;

                /* JADX INFO: renamed from: i */
                public View f13482i;

                /* JADX INFO: renamed from: v */
                public eq2 f13483v;

                /* JADX INFO: renamed from: w */
                public HSMainActivity f13484w;

                /* JADX INFO: renamed from: b */
                public boolean f13477b = true;

                /* JADX INFO: renamed from: V */
                public boolean f13472V = false;

                /* JADX INFO: renamed from: Y */
                public final ViewTreeObserverOnGlobalLayoutListenerC1986o2 f13475Y = new ViewTreeObserverOnGlobalLayoutListenerC1986o2(this, 4);

                @Override // p000.ct0
                /* JADX INFO: renamed from: a */
                public final void mo2886a() {
/* 3 */             m6531i(w20.ONLINE_EXTRAS_KEY);
                }

                @Override // p000.ct0
                /* JADX INFO: renamed from: e */
                public final void mo2887e() {
/* 3 */             m6531i("offline");
                }

                /* JADX INFO: renamed from: g */
                public final void m6529g(String str, ks0 ks0Var) {
/* 11 */            rs0.f16254y.f16271p.m8115t(new js0(0, this, str, ks0Var));
                }

                /* JADX INFO: renamed from: h */
                public final void m6530h(boolean z) {
/* 28 */            m6529g("Helpshift('onKeyboardToggle','" + (!z ? "close" : "open") + "');", null);
                }

                /* JADX INFO: renamed from: i */
                public final void m6531i(String str) {
/* 21 */            m6529g("Helpshift('onNetworkStatusChange','" + str + "');", null);
                }

                /* JADX INFO: renamed from: j */
                public final void m6532j(int i) {
/* 29 */            m6529g("Helpshift('onOrientationChange','" + (i == 1 ? "portrait" : "landscape") + "');", null);
                }

                /* JADX WARN: Code duplicated, block: B:11:0x005a  */
                /* JADX INFO: renamed from: k */
                public final void m6533k() throws Throwable {
                    String strM3589r;
                    String strReplace;
/* 3 */             C0875ec c0875ec = rs0.f16254y.f16275t;
/* 5 */             Context context = getContext();
/* 11 */            C1773iy c1773iy = (C1773iy) c0875ec.f7615d;
/* 21 */            if (b40.m1232p((String) c0875ec.f7613b)) {
/* 25 */                String strM10195A = yy1.m10195A(context, "helpshift/Webchat.js");
/* 33 */                if (b40.m1232p(strM10195A)) {
/* 35 */                    strReplace = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
/* 47 */                    c0875ec.f7613b = strM10195A.replace("%cdn", "https://webchat.helpshift.com/latest/android/webChat.js");
/* 67 */                    String strReplace2 = ((String) c0875ec.f7613b).replace("%config", c1773iy.m5618m(rs0.f16254y.f16258c).toString());
/* 81 */                    strM3589r = ((er0) ((er0) c1773iy.f11955a).f7853b).m3589r("custom_issue_fields");
/* 89 */                    if (b40.m1232p(strM3589r)) {
/* 91 */                        strM3589r = "{}";
                            }
/* 95 */                    strReplace = strReplace2.replace("%cifs", strM3589r);
                        }
                    } else {
/* 67 */                String strReplace3 = ((String) c0875ec.f7613b).replace("%config", c1773iy.m5618m(rs0.f16254y.f16258c).toString());
/* 81 */                strM3589r = ((er0) ((er0) c1773iy.f11955a).f7853b).m3589r("custom_issue_fields");
/* 89 */                if (b40.m1232p(strM3589r)) {
/* 91 */                    strM3589r = "{}";
                        }
/* 95 */                strReplace = strReplace3.replace("%cifs", strM3589r);
                    }
/* 37 */            String str = strReplace;
/* 110 */           if (b40.m1232p(str)) {
/* 114 */               xe2.m9777o("HSChatFragment", "Error in reading the source code from assets folder", null);
/* 119 */               xe2.m9777o("HSChatFragment", "Received onWebchatError event", null);
/* 124 */               this.f13482i.setVisibility(0);
/* 129 */               this.f13481f.setVisibility(8);
/* 132 */               return;
                    }
/* 135 */           this.f13481f.setVisibility(0);
/* 140 */           this.f13482i.setVisibility(8);
/* 145 */           xe2.m9775m("HSChatFragment", "Webview is launched", null);
/* 148 */           rs0 rs0Var = rs0.f16254y;
/* 152 */           C1969nm c1969nm = rs0Var.f16261f;
/* 154 */           ra2 ra2Var = rs0Var.f16271p;
/* 156 */           C1773iy c1773iy2 = rs0Var.f16260e;
/* 158 */           C1969nm c1969nmM8240a = rs0Var.m8240a();
/* 162 */           ts0 ts0Var = rs0Var.f16270o;
/* 164 */           ll1 ll1Var = rs0Var.f16278w;
/* 166 */           eq2 eq2Var = new eq2();
/* 169 */           eq2Var.f7832a = ra2Var;
/* 171 */           eq2Var.f7834c = c1969nm;
/* 173 */           eq2Var.f7833b = c1773iy2;
/* 175 */           eq2Var.f7835d = c1969nmM8240a;
/* 177 */           eq2Var.f7836e = ts0Var;
/* 179 */           eq2Var.f7837f = ll1Var;
/* 181 */           this.f13483v = eq2Var;
/* 188 */           eq2Var.f7838i = new WeakReference(this);
/* 194 */           ns0 ns0Var = new ns0(this.f13483v);
/* 197 */           this.f13479d = ns0Var;
/* 201 */           ns0Var.f14419b = this.f13476a;
/* 205 */           this.f13478c.setWebChromeClient(ns0Var);
/* 221 */           this.f13478c.setWebViewClient(new os0(this.f13483v, rs0Var.m8240a()));
/* 237 */           this.f13478c.addJavascriptInterface(new ms0(rs0Var.f16272q, this.f13483v), "HSInterface");
/* 249 */           this.f13478c.loadDataWithBaseURL("https://localhost/", str, "text/html", "utf-8", null);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 2 */             this.f13477b = true;
/* 15 */            xe2.m9775m("HSChatFragment", AbstractC0886en.m3506j("onActivityResult, request code: ", i, i2, " , resultCode: "), null);
/* 18 */            if (i == 0) {
/* 54 */                this.f13476a.onReceiveValue(null);
/* 57 */                return;
                    }
/* 22 */            if (i != 1001) {
/* 24 */                super.onActivityResult(i, i2, intent);
/* 27 */                return;
                    }
/* 28 */            ValueCallback valueCallback = this.f13476a;
/* 30 */            if (valueCallback == null) {
/* 34 */                xe2.m9775m("HSChatFragment", "filePathCallback is null, return", null);
/* 37 */                return;
                    }
/* 42 */            valueCallback.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i2, intent));
/* 45 */            this.f13476a = null;
/* 49 */            this.f13479d.f14419b = null;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
/* 1 */             int id = view.getId();
/* 7 */             if (id != R$id.hs__loading_view_close_btn && id != R$id.hs__retry_view_close_btn) {
/* 16 */                if (id == R$id.hs__retry_button) {
/* 18 */                    m6533k();
                        }
                    } else {
/* 27 */                xe2.m9775m("HSChatFragment", "onWebchatClosed", null);
/* 30 */                HSMainActivity hSMainActivity = this.f13484w;
/* 32 */                if (hSMainActivity != null) {
/* 34 */                    hSMainActivity.onBackPressed();
                        }
                    }
                }

                @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
                public final void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 6 */             m6532j(configuration.orientation);
                }

                @Override // androidx.fragment.app.Fragment
                public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
/* 22 */            xe2.m9775m("HSChatFragment", "onCreateView() - " + hashCode(), null);
/* 28 */            View viewInflate = layoutInflater.inflate(R$layout.hs__webchat_fragment_layout, viewGroup, false);
/* 36 */            if (getArguments() != null) {
/* 48 */                this.f13473W = getArguments().getString(FirebaseAnalytics.Param.SOURCE);
                    }
/* 50 */            return viewInflate;
                }

                @Override // androidx.fragment.app.Fragment
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 25 */            xe2.m9775m("HSChatFragment", "onDestroy() -" + hashCode(), null);
/* 28 */            rs0 rs0Var = rs0.f16254y;
/* 31 */            rs0Var.f16256a = false;
/* 39 */            ((WeakReference) rs0Var.f16261f.f14380h).clear();
/* 42 */            eq2 eq2Var = this.f13483v;
/* 44 */            if (eq2Var != null) {
/* 51 */                eq2Var.f7838i = new WeakReference(null);
                    }
/* 57 */            this.f13480e.removeView(this.f13478c);
/* 60 */            HSWebView hSWebView = this.f13478c;
/* 62 */            hSWebView.removeAllViews();
/* 65 */            hSWebView.destroy();
/* 68 */            this.f13478c = null;
/* 80 */            SharedPreferences.Editor editorEdit = ((SharedPreferences) ((er0) rs0Var.f16269n.f7853b).f7853b).edit();
/* 88 */            editorEdit.putLong("last_unread_count_api_access", 0L);
/* 95 */            if (!editorEdit.commit()) {
/* 97 */                editorEdit.commit();
                    }
/* 108 */           rs0Var.f16261f.m7011n(0, "push_unread_count");
                }

                @Override // androidx.fragment.app.Fragment
                public final void onPause() {
                    et0 et0Var;
/* 1 */             super.onPause();
/* 25 */            xe2.m9775m("HSChatFragment", "onPause() -" + hashCode(), null);
/* 28 */            FragmentActivity activity = getActivity();
/* 32 */            if (activity != null && !activity.isChangingConfigurations()) {
/* 44 */                rs0.f16254y.f16274s.m1576K();
                    }
/* 51 */            ps0 ps0VarM7548b = ps0.m7548b(getContext());
                    synchronized (ps0VarM7548b) {
/* 58 */                ps0VarM7548b.f15274c.remove(this);
/* 67 */                if (ps0VarM7548b.f15274c.isEmpty() && (et0Var = ps0VarM7548b.f15275d) != null) {
/* 74 */                    ConnectivityManager connectivityManagerM3598a = et0Var.m3598a();
/* 78 */                    if (connectivityManagerM3598a != null) {
                                try {
/* 80 */                            connectivityManagerM3598a.unregisterNetworkCallback(et0Var);
                                } catch (Exception e) {
/* 89 */                            xe2.m9777o("AboveNConnectvtManager", "Exception while unregistering network callback", e);
                                }
                            }
/* 92 */                    et0Var.f7871b = null;
/* 94 */                    ps0VarM7548b.f15275d = null;
                        }
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onResume() {
                    int i;
/* 3 */             super.onResume();
/* 27 */            xe2.m9775m("HSChatFragment", "onResume() -" + hashCode(), null);
/* 30 */            FragmentActivity activity = getActivity();
/* 34 */            if (activity != null && !activity.isChangingConfigurations()) {
/* 46 */                rs0.f16254y.f16274s.m1577L();
                    }
/* 53 */            ps0 ps0VarM7548b = ps0.m7548b(getContext());
                    synchronized (ps0VarM7548b) {
                        try {
/* 60 */                    boolean zIsEmpty = ps0VarM7548b.f15274c.isEmpty();
/* 66 */                    ps0VarM7548b.f15274c.add(this);
/* 69 */                    if (zIsEmpty) {
/* 71 */                        ps0VarM7548b.m7549c();
                            } else {
/* 79 */                        ConnectivityManager connectivityManagerM3598a = ps0VarM7548b.f15275d.m3598a();
/* 85 */                        if (connectivityManagerM3598a != null) {
/* 95 */                            i = connectivityManagerM3598a.getActiveNetwork() != null ? 2 : 3;
                                } else {
/* 97 */                            i = 1;
                                }
/* 98 */                        int iM3520y = AbstractC0886en.m3520y(i);
/* 102 */                       if (iM3520y == 1) {
/* 111 */                           mo2886a();
                                } else if (iM3520y == 2) {
/* 107 */                           mo2887e();
                                }
                            }
                        } catch (Throwable th) {
/* 175 */                   throw th;
                        }
                    }
/* 115 */           rs0 rs0Var = rs0.f16254y;
/* 119 */           if (rs0Var.f16256a && this.f13474X) {
/* 129 */               xe2.m9775m("HSChatFragment", "Updating config with latest config in same webchat session", null);
                        try {
/* 161 */                   m6529g("window.helpshiftConfig = JSON.parse(JSON.stringify(" + rs0Var.f16260e.m5618m(rs0Var.f16258c).toString() + "));Helpshift('updateClientConfigWithoutReload');", null);
                        } catch (Exception e) {
/* 170 */                   xe2.m9777o("HSChatFragment", "Failed to update webchat config with latest config ", e);
                        }
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onStart() {
/* 1 */             super.onStart();
/* 25 */            xe2.m9775m("HSChatFragment", "onStart() -" + hashCode(), null);
/* 30 */            m6529g("Helpshift('sdkxIsInForeground',true);", null);
/* 41 */            this.f13478c.getViewTreeObserver().addOnGlobalLayoutListener(this.f13475Y);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onStop() {
/* 1 */             super.onStop();
/* 25 */            xe2.m9775m("HSChatFragment", "onStop() - " + hashCode(), null);
/* 30 */            if (this.f13477b) {
/* 34 */                m6529g("Helpshift('sdkxIsInForeground',false);", null);
                    }
/* 45 */            this.f13478c.getViewTreeObserver().removeOnGlobalLayoutListener(this.f13475Y);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onViewCreated(View view, Bundle bundle) throws Throwable {
/* 1 */             super.onViewCreated(view, bundle);
/* 25 */            xe2.m9775m("HSChatFragment", "onViewCreated() - " + hashCode(), null);
/* 28 */            rs0 rs0Var = rs0.f16254y;
/* 31 */            rs0Var.f16256a = true;
/* 33 */            C1969nm c1969nm = rs0Var.f16261f;
/* 35 */            c1969nm.getClass();
/* 43 */            c1969nm.f14380h = new WeakReference(this);
/* 51 */            this.f13481f = view.findViewById(R$id.hs__loading_view);
/* 59 */            this.f13482i = view.findViewById(R$id.hs__retry_view);
/* 69 */            this.f13480e = (LinearLayout) view.findViewById(R$id.hs__webview_layout);
/* 79 */            this.f13478c = (HSWebView) view.findViewById(R$id.hs__webchat_webview);
/* 87 */            view.findViewById(R$id.hs__retry_view_close_btn).setOnClickListener(this);
/* 96 */            view.findViewById(R$id.hs__loading_view_close_btn).setOnClickListener(this);
/* 105 */           view.findViewById(R$id.hs__retry_button).setOnClickListener(this);
/* 108 */           m6533k();
                }
            }
