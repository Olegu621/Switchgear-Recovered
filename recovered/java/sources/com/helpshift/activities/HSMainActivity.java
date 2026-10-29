            package com.helpshift.activities;

            import android.content.Intent;
            import android.graphics.Color;
            import android.os.Bundle;
            import android.view.View;
            import android.widget.ImageView;
            import androidx.appcompat.app.AppCompatActivity;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0086a;
            import androidx.fragment.app.Fragment;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.helpshift.R$anim;
            import com.helpshift.R$drawable;
            import com.helpshift.R$id;
            import com.helpshift.R$layout;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.HashMap;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicBoolean;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.C1773iy;
            import p000.b40;
            import p000.bt0;
            import p000.cp0;
            import p000.es0;
            import p000.f42;
            import p000.fs0;
            import p000.he3;
            import p000.ht0;
            import p000.ks0;
            import p000.ls0;
            import p000.ra2;
            import p000.rs0;
            import p000.um0;
            import p000.we2;
            import p000.xe2;
            import p000.xs0;
            import p000.xy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HSMainActivity extends AppCompatActivity implements View.OnClickListener {

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ int f5313i = 0;

                /* JADX INFO: renamed from: b */
                public View f5314b;

                /* JADX INFO: renamed from: c */
                public ImageView f5315c;

                /* JADX INFO: renamed from: d */
                public AbstractC0111w f5316d;

                /* JADX INFO: renamed from: e */
                public C1773iy f5317e;

                /* JADX INFO: renamed from: f */
                public boolean f5318f;

                /* JADX INFO: renamed from: d */
                public static void m2537d(HSMainActivity hSMainActivity, boolean z, boolean z2) {
/* 26 */            hSMainActivity.m2538e(((z2 && hSMainActivity.f5318f) || z) ? hSMainActivity.f5317e.m5619n("helpcenter") : hSMainActivity.f5317e.m5619n("webchat"));
                }

                /* JADX INFO: renamed from: e */
                public final void m2538e(String str) {
/* 7 */             if (!b40.m1234r(str) || !b40.m1236t(str)) {
/* 55 */                getWindow().setStatusBarColor(Color.parseColor("#453FB9"));
/* 58 */                return;
                    }
                    try {
/* 34 */                getWindow().setStatusBarColor(Color.parseColor(new JSONObject(str).optString("primaryColor", "#453FB9")));
                    } catch (JSONException e) {
/* 43 */                xe2.m9777o("ViewUtil", "Error setting status bar color", e);
                    }
                }

                /* JADX INFO: renamed from: f */
                public final Fragment m2539f() {
/* 7 */             if (this.f5316d.m682G() == 0) {
/* 9 */                 return null;
                    }
/* 15 */            return this.f5316d.m679C(R$id.hs__container);
                }

                /* JADX INFO: renamed from: g */
                public final void m2540g(boolean z) {
/* 1 */             if (z) {
/* 37 */                return;
                    }
/* 8 */             if (m2539f() == null) {
/* 10 */                super.onBackPressed();
                    } else if (this.f5316d.m682G() > 0) {
/* 22 */                AbstractC0111w abstractC0111w = this.f5316d;
/* 24 */                abstractC0111w.getClass();
/* 34 */                abstractC0111w.m726x(new um0(abstractC0111w, -1, 0), false);
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m2541h(Intent intent, boolean z) {
/* 5 */             if (intent.getExtras() != null) {
/* 16 */                if (rs0.f16254y.f16273r.m1567A()) {
/* 32 */                    Bundle extras = intent.getExtras();
/* 44 */                    this.f5317e.f11960f = extras.getString(FirebaseAnalytics.Param.SOURCE);
/* 58 */                    if ("WEBCHAT_SERVICE_FLAG".equalsIgnoreCase(extras.getString("SERVICE_MODE"))) {
/* 64 */                        m2542i(extras.getString(FirebaseAnalytics.Param.SOURCE), z);
                            } else {
/* 68 */                        Bundle extras2 = intent.getExtras();
/* 74 */                        xs0 xs0Var = new xs0();
/* 77 */                        xs0Var.setArguments(extras2);
/* 80 */                        xs0Var.f19349e = this;
/* 82 */                        AbstractC0111w abstractC0111w = this.f5316d;
/* 84 */                        abstractC0111w.getClass();
/* 89 */                        C0086a c0086a = new C0086a(abstractC0111w);
/* 97 */                        c0086a.m639e(R$id.hs__container, xs0Var, "HelpCenter", 1);
/* 100 */                       if (z) {
/* 104 */                           if (!c0086a.f1392h) {
/* 114 */                               f42.m3656l("This FragmentTransaction is not allowed to be added to the back stack.");
/* 117 */                               return;
                                    } else {
/* 106 */                               c0086a.f1391g = true;
/* 109 */                               c0086a.f1393i = null;
                                    }
                                }
/* 118 */                       c0086a.m638d(true);
                            }
/* 125 */                   this.f5314b.setVisibility(8);
/* 128 */                   return;
                        }
/* 22 */                this.f5315c.setImageResource(R$drawable.hs__no_internet_icon);
                    }
/* 28 */            this.f5314b.setVisibility(0);
                }

                /* JADX INFO: renamed from: i */
                public final void m2542i(String str, boolean z) {
/* 9 */             if (rs0.f16254y.f16256a) {
/* 17 */                if ("proactive".equals(str)) {
/* 23 */                    xe2.m9775m("chatActvty", "Update config with proactive outbound config in same webchat session", null);
/* 32 */                    List listM751f = getSupportFragmentManager().f1493c.m751f();
/* 36 */                    if (listM751f == null || listM751f.isEmpty()) {
/* 84 */                        return;
                            }
/* 53 */                    Fragment fragment = (Fragment) listM751f.get(listM751f.size() - 1);
/* 57 */                    if (fragment instanceof ls0) {
/* 59 */                        ls0 ls0Var = (ls0) fragment;
/* 61 */                        ls0Var.f13474X = true;
/* 79 */                        xe2.m9775m("HSChatFragment", "Webchat source changed to proactive from " + ls0Var.f13473W, null);
/* 82 */                        ls0Var.f13473W = "proactive";
/* 84 */                        return;
                            }
/* 84 */                    return;
                        }
/* 84 */                return;
                    }
/* 87 */            Bundle bundle = new Bundle();
/* 98 */            if ("api".equalsIgnoreCase(str)) {
/* 100 */               bundle.putString(FirebaseAnalytics.Param.SOURCE, "api");
                    } else if (rs0.f16254y.f16258c) {
/* 122 */               ht0.f9230a.put("helpcenter", Long.valueOf(System.currentTimeMillis()));
/* 125 */               bundle.putString(FirebaseAnalytics.Param.SOURCE, "helpcenter");
                    } else if ("notification".equalsIgnoreCase(str)) {
/* 147 */               ht0.f9230a.put("notification", Long.valueOf(System.currentTimeMillis()));
/* 150 */               bundle.putString(FirebaseAnalytics.Param.SOURCE, "notification");
                    }
/* 155 */           ls0 ls0Var2 = new ls0();
/* 158 */           ls0Var2.setArguments(bundle);
/* 161 */           ls0Var2.f13484w = this;
/* 163 */           AbstractC0111w abstractC0111w = this.f5316d;
/* 165 */           abstractC0111w.getClass();
/* 170 */           C0086a c0086a = new C0086a(abstractC0111w);
/* 173 */           if (z) {
/* 175 */               this.f5318f = true;
/* 177 */               int i = R$anim.hs__slide_up;
/* 179 */               int i2 = R$anim.hs__slide_down;
/* 181 */               c0086a.f1386b = i;
/* 183 */               c0086a.f1387c = i2;
/* 185 */               c0086a.f1388d = i;
/* 187 */               c0086a.f1389e = i2;
                    }
/* 191 */           c0086a.m639e(R$id.hs__container, ls0Var2, "HSChatFragment", 1);
/* 194 */           if (z) {
/* 198 */               if (!c0086a.f1392h) {
/* 207 */                   f42.m3656l("This FragmentTransaction is not allowed to be added to the back stack.");
/* 210 */                   return;
                        } else {
/* 200 */                   c0086a.f1391g = true;
/* 202 */                   c0086a.f1393i = null;
                        }
                    }
/* 211 */           c0086a.m638d(true);
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
                public final void onBackPressed() {
/* 1 */             Fragment fragmentM2539f = m2539f();
/* 9 */             if (fragmentM2539f == null) {
/* 19 */                xs0 xs0Var = (xs0) this.f5316d.m680D("HelpCenter");
/* 21 */                if (xs0Var != null && xs0Var.f19345a.canGoBack()) {
/* 31 */                    xs0Var.m10022g("Helpcenter( JSON.stringify({ \"eventType\": \"backBtnClick\", \"config\": {} }));");
/* 36 */                    xs0Var.f19345a.goBack();
/* 39 */                    return;
                        }
/* 48 */                ls0 ls0Var = (ls0) this.f5316d.m680D("HSChatFragment");
/* 50 */                if (ls0Var != null) {
/* 57 */                    ls0Var.m6529g("Helpshift('backBtnPress');", new ks0(ls0Var));
/* 60 */                    return;
                        } else {
/* 61 */                    super.onBackPressed();
/* 64 */                    return;
                        }
                    }
/* 67 */            if (fragmentM2539f instanceof xs0) {
/* 69 */                xs0 xs0Var2 = (xs0) fragmentM2539f;
/* 77 */                if (xs0Var2.f19345a.canGoBack()) {
/* 79 */                    xs0Var2.m10022g("Helpcenter( JSON.stringify({ \"eventType\": \"backBtnClick\", \"config\": {} }));");
/* 84 */                    xs0Var2.f19345a.goBack();
/* 87 */                    return;
                        }
                    } else if (fragmentM2539f instanceof ls0) {
/* 92 */                ls0 ls0Var2 = (ls0) fragmentM2539f;
/* 99 */                ls0Var2.m6529g("Helpshift('backBtnPress');", new ks0(ls0Var2));
/* 102 */               return;
                    } else if (this.f5316d.m682G() > 0) {
/* 111 */               AbstractC0111w abstractC0111w = this.f5316d;
/* 113 */               abstractC0111w.getClass();
/* 123 */               abstractC0111w.m726x(new um0(abstractC0111w, -1, 0), false);
/* 126 */               return;
                    }
/* 127 */           super.onBackPressed();
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
/* 1 */             int id = view.getId();
/* 7 */             if (id == R$id.hs__retry_view_close_btn) {
/* 9 */                 finish();
                    } else if (id == R$id.hs__retry_button) {
/* 22 */                m2541h(getIntent(), false);
                    }
                }

                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public final void onCreate(Bundle bundle) {
                    try {
/* 1 */                 AtomicBoolean atomicBoolean = rs0.f16255z;
/* 7 */                 if (!atomicBoolean.get()) {
/* 10 */                    bundle = null;
                        }
/* 11 */                super.onCreate(bundle);
/* 18 */                if (!atomicBoolean.get()) {
/* 24 */                    AbstractC1245n0.m4876d("chatActvty", "Install call not successful, falling back to launcher activity");
/* 27 */                    he3.m4197t(this);
/* 30 */                    return;
                        }
/* 33 */                setContentView(R$layout.hs__chat_activity_layout);
                        try {
/* 46 */                    setRequestedOrientation(rs0.f16254y.f16269n.m3586o("screenOrientation"));
                        } catch (Exception e) {
/* 55 */                    xe2.m9777o("chatActvty", "Error setting orientation.", e);
                        }
/* 64 */                this.f5314b = findViewById(R$id.hs__retry_view);
/* 74 */                this.f5315c = (ImageView) findViewById(R$id.hs__error_image);
/* 82 */                findViewById(R$id.hs__retry_button).setOnClickListener(this);
/* 91 */                findViewById(R$id.hs__retry_view_close_btn).setOnClickListener(this);
/* 94 */                rs0 rs0Var = rs0.f16254y;
/* 96 */                xy1 xy1Var = rs0Var.f16265j;
                        synchronized (xy1Var) {
/* 99 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 103 */                   JSONArray jSONArrayM10043f = xy1Var.m10043f();
/* 111 */                   if (jSONArrayM10043f.length() != 0) {
/* 127 */                       ((fs0) ((ra2) xy1Var.f19397e).f15955a).m3826w(new es0(xy1Var, jSONArrayM10043f, jCurrentTimeMillis));
                            }
                        }
/* 135 */               this.f5316d = getSupportFragmentManager();
/* 139 */               this.f5317e = rs0Var.f16260e;
/* 146 */               m2541h(getIntent(), false);
/* 149 */               AbstractC0111w abstractC0111w = this.f5316d;
/* 151 */               if (abstractC0111w == null) {
/* 187 */                   return;
                        }
/* 161 */               abstractC0111w.f1503m.add(new bt0(this));
                    } catch (Exception e2) {
/* 173 */               AbstractC1245n0.m4877e("chatActvty", "Caught exception in HSMainActivity.onCreate()", e2);
/* 182 */               if (rs0.f16255z.get()) {
/* 187 */                   return;
                        }
/* 184 */               he3.m4197t(this);
                    }
                }

                @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
                public final void onDestroy() {
/* 1 */             super.onDestroy();
/* 10 */            if (rs0.f16255z.get()) {
/* 14 */                xy1 xy1Var = rs0.f16254y.f16265j;
/* 16 */                xy1Var.getClass();
/* 21 */                JSONArray jSONArray = new JSONArray();
                        try {
/* 26 */                    JSONObject jSONObject = new JSONObject();
/* 35 */                    jSONObject.put("ts", System.currentTimeMillis());
/* 42 */                    jSONObject.put("t", "q");
/* 45 */                    jSONArray.put(jSONObject);
/* 63 */                    ((fs0) ((ra2) xy1Var.f19397e).f15955a).m3826w(new cp0(xy1Var, jSONArray, 7, false));
                        } catch (Exception e) {
/* 72 */                    xe2.m9777o("analyticsMngr", "Error in creating quit event", e);
                        }
                    }
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
                public final void onNewIntent(Intent intent) {
                    xs0 xs0Var;
/* 1 */             super.onNewIntent(intent);
/* 8 */             if (intent.getExtras() == null) {
/* 10 */                return;
                    }
/* 19 */            if (!rs0.f16254y.f16273r.m1567A()) {
/* 25 */                this.f5315c.setImageResource(R$drawable.hs__no_internet_icon);
/* 28 */                return;
                    }
/* 29 */            Bundle extras = intent.getExtras();
/* 41 */            this.f5317e.f11960f = extras.getString(FirebaseAnalytics.Param.SOURCE);
/* 43 */            Fragment fragmentM2539f = m2539f();
/* 47 */            if (fragmentM2539f == null) {
/* 57 */                xs0Var = (xs0) this.f5316d.m680D("HelpCenter");
                    } else {
/* 67 */                xs0Var = fragmentM2539f instanceof xs0 ? (xs0) fragmentM2539f : null;
                    }
/* 68 */            if (xs0Var == null || !"HELP_CENTER_SERVICE_FLAG".equalsIgnoreCase(extras.getString("SERVICE_MODE"))) {
/* 119 */               m2541h(intent, true);
/* 122 */               return;
                    }
/* 84 */            we2 we2VarM10021h = xs0.m10021h(extras);
/* 88 */            rs0 rs0Var = rs0.f16254y;
/* 114 */           xs0Var.m10022g("Helpcenter( JSON.stringify({ \"eventType\": \"reloadHelpcenter\", \"config\": %helpshiftConfig }));".replace("%helpshiftConfig", rs0Var.f16260e.m5617l((String) we2VarM10021h.f18596c, (String) we2VarM10021h.f18595b, rs0Var.f16256a)));
                }

                @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
                public final void onStart() throws IllegalAccessException {
/* 1 */             super.onStart();
/* 4 */             rs0 rs0Var = rs0.f16254y;
/* 7 */             rs0Var.f16257b = true;
/* 18 */            rs0Var.f16272q.m9527D("helpshiftSessionStarted", new HashMap());
                }

                @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
                public final void onStop() {
/* 1 */             super.onStop();
/* 4 */             rs0 rs0Var = rs0.f16254y;
/* 7 */             rs0Var.f16257b = false;
/* 18 */            rs0Var.f16272q.m9527D("helpshiftSessionEnded", new HashMap());
                }
            }
