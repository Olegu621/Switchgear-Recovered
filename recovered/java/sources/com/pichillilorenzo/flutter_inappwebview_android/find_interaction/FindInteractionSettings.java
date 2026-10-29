            package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 4 */     public class FindInteractionSettings implements ISettings<FindInteractionController> {
                public static final String LOG_TAG = "FindInteractionSettings";

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public /* bridge */ /* synthetic */ ISettings<FindInteractionController> parse(Map map) {
/* 1 */             return parse2((Map<String, Object>) map);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             return new HashMap();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
/* 5 */         public ISettings<FindInteractionController> parse2(Map<String, Object> map) {
/* 6 */             return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 7 */         public Map<String, Object> getRealSettings(FindInteractionController findInteractionController) {
/* 8 */             return toMap();
                }
            }
