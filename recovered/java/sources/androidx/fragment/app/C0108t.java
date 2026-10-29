            package androidx.fragment.app;

            import androidx.activity.result.ActivityResult;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Map;
            import p000.InterfaceC0202c3;
            import p000.InterfaceC1876l3;
            import p000.so0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.t */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0108t implements InterfaceC0202c3, so0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f1472a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f1473b;

                public /* synthetic */ C0108t(Object obj, int i) {
/* 1 */             this.f1472a = i;
/* 3 */             this.f1473b = obj;
                }

                @Override // p000.so0
                public Object apply(Object obj) {
/* 5 */             Fragment fragment = (Fragment) this.f1473b;
/* 7 */             Object obj2 = fragment.mHost;
                    return obj2 instanceof InterfaceC1876l3 ? ((InterfaceC1876l3) obj2).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
                }

                @Override // p000.InterfaceC0202c3
                /* JADX INFO: renamed from: c */
                public void mo198c(Object obj) {
/* 1 */             int i = this.f1472a;
/* 3 */             Object obj2 = this.f1473b;
                    switch (i) {
                        case 0:
/* 150 */                   Map map = (Map) obj;
/* 152 */                   AbstractC0111w abstractC0111w = (AbstractC0111w) obj2;
/* 165 */                   String[] strArr = (String[]) map.keySet().toArray(new String[0]);
/* 173 */                   ArrayList arrayList = new ArrayList(map.values());
/* 180 */                   int[] iArr = new int[arrayList.size()];
/* 187 */                   for (int i2 = 0; i2 < arrayList.size(); i2++) {
/* 204 */                       iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
                            }
/* 215 */                   FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) abstractC0111w.f1480E.pollFirst();
/* 217 */                   if (fragmentManager$LaunchedFragmentInfo == null) {
/* 233 */                       AbstractC1245n0.m4889q("FragmentManager", "No permissions were requested for " + this);
                            } else {
/* 237 */                       String str = fragmentManager$LaunchedFragmentInfo.f1357a;
/* 239 */                       int i3 = fragmentManager$LaunchedFragmentInfo.f1358b;
/* 243 */                       Fragment fragmentM748c = abstractC0111w.f1493c.m748c(str);
/* 247 */                       if (fragmentM748c == null) {
/* 263 */                           AbstractC1245n0.m4889q("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                                } else {
/* 267 */                           fragmentM748c.onRequestPermissionsResult(i3, strArr, iArr);
                                }
                            }
                            break;
                        case 1:
/* 80 */                    ActivityResult activityResult = (ActivityResult) obj;
/* 82 */                    AbstractC0111w abstractC0111w2 = (AbstractC0111w) obj2;
/* 90 */                    FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) abstractC0111w2.f1480E.pollLast();
/* 92 */                    if (fragmentManager$LaunchedFragmentInfo2 == null) {
/* 108 */                       AbstractC1245n0.m4889q("FragmentManager", "No Activities were started for result for " + this);
                            } else {
/* 112 */                       String str2 = fragmentManager$LaunchedFragmentInfo2.f1357a;
/* 114 */                       int i4 = fragmentManager$LaunchedFragmentInfo2.f1358b;
/* 118 */                       Fragment fragmentM748c2 = abstractC0111w2.f1493c.m748c(str2);
/* 122 */                       if (fragmentM748c2 == null) {
/* 138 */                           AbstractC1245n0.m4889q("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                                } else {
/* 146 */                           fragmentM748c2.onActivityResult(i4, activityResult.f351a, activityResult.f352b);
                                }
                            }
                            break;
                        default:
/* 10 */                    ActivityResult activityResult2 = (ActivityResult) obj;
/* 12 */                    AbstractC0111w abstractC0111w3 = (AbstractC0111w) obj2;
/* 20 */                    FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) abstractC0111w3.f1480E.pollFirst();
/* 22 */                    if (fragmentManager$LaunchedFragmentInfo3 == null) {
/* 38 */                        AbstractC1245n0.m4889q("FragmentManager", "No IntentSenders were started for " + this);
                            } else {
/* 42 */                        String str3 = fragmentManager$LaunchedFragmentInfo3.f1357a;
/* 44 */                        int i5 = fragmentManager$LaunchedFragmentInfo3.f1358b;
/* 48 */                        Fragment fragmentM748c3 = abstractC0111w3.f1493c.m748c(str3);
/* 52 */                        if (fragmentM748c3 == null) {
/* 68 */                            AbstractC1245n0.m4889q("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                                } else {
/* 76 */                            fragmentM748c3.onActivityResult(i5, activityResult2.f351a, activityResult2.f352b);
                                }
                            }
                            break;
                    }
                }
            }
