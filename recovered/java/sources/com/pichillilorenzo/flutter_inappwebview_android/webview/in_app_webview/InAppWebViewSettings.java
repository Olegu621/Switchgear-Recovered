            package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

            import android.os.Build;
            import android.webkit.WebSettings;
            import com.appsflyer.attribution.RequestError;
            import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
            import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
            import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import okio.Utf8;
            import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
            import p000.AbstractC1993o9;
            import p000.AbstractC2062p9;
            import p000.AbstractC2099q9;
            import p000.AbstractC2247u9;
            import p000.C1823k9;
            import p000.b73;
            import p000.p63;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 1813 */  public class InAppWebViewSettings implements ISettings<InAppWebViewInterface> {
                public static final String LOG_TAG = "InAppWebViewSettings";
                public Boolean algorithmicDarkeningAllowed;
                public Boolean allowBackgroundAudioPlaying;
                public Boolean allowContentAccess;
                public Boolean allowFileAccess;
                public Boolean allowFileAccessFromFileURLs;
                public Boolean allowUniversalAccessFromFileURLs;
                public String appCachePath;
                public String applicationNameForUserAgent;
                public Boolean blockNetworkImage;
                public Boolean blockNetworkLoads;
                public Boolean builtInZoomControls;
                public Boolean cacheEnabled;
                public Integer cacheMode;

                @Deprecated
                public Boolean clearCache;

                @Deprecated
                public Boolean clearSessionCache;
                public List<Map<String, Map<String, Object>>> contentBlockers;
                public String cursiveFontFamily;
                public Boolean databaseEnabled;
                public Integer defaultFixedFontSize;
                public Integer defaultFontSize;
                public String defaultTextEncodingName;
                public byte[] defaultVideoPoster;
                public Boolean disableContextMenu;
                public Boolean disableDefaultErrorPage;
                public Boolean disableHorizontalScroll;
                public Boolean disableVerticalScroll;
                public Integer disabledActionModeMenuItems;
                public Boolean displayZoomControls;
                public Boolean domStorageEnabled;
                public Boolean enterpriseAuthenticationAppLinkPolicyEnabled;
                public String fantasyFontFamily;
                public String fixedFontFamily;
                public Integer forceDark;
                public Integer forceDarkStrategy;
                public Boolean geolocationEnabled;
                public Boolean hardwareAcceleration;
                public Boolean horizontalScrollBarEnabled;
                public String horizontalScrollbarThumbColor;
                public String horizontalScrollbarTrackColor;
                public Boolean incognito;
                public Integer initialScale;
                public Boolean interceptOnlyAsyncAjaxRequests;
                public Boolean javaScriptCanOpenWindowsAutomatically;
                public Boolean javaScriptEnabled;
                public WebSettings.LayoutAlgorithm layoutAlgorithm;
                public Boolean loadWithOverviewMode;
                public Boolean loadsImagesAutomatically;
                public Boolean mediaPlaybackRequiresUserGesture;
                public Integer minimumFontSize;
                public Integer minimumLogicalFontSize;
                public Integer mixedContentMode;
                public Boolean needInitialFocus;
                public Boolean networkAvailable;
                public Boolean offscreenPreRaster;
                public Integer overScrollMode;
                public Integer preferredContentMode;
                public String regexToCancelSubFramesLoading;
                public Map<String, Object> rendererPriorityPolicy;
                public Set<String> requestedWithHeaderOriginAllowList;
                public List<String> resourceCustomSchemes;
                public Boolean safeBrowsingEnabled;
                public String sansSerifFontFamily;
                public Boolean saveFormData;
                public Integer scrollBarDefaultDelayBeforeFade;
                public Integer scrollBarFadeDuration;
                public Integer scrollBarStyle;
                public Boolean scrollbarFadingEnabled;
                public String serifFontFamily;
                public String standardFontFamily;
                public Boolean supportMultipleWindows;
                public Boolean supportZoom;
                public Integer textZoom;
                public Boolean thirdPartyCookiesEnabled;
                public Boolean transparentBackground;
                public Boolean useHybridComposition;
                public Boolean useOnDownloadStart;
                public Boolean useOnLoadResource;
                public Boolean useOnRenderProcessGone;
                public Boolean useShouldInterceptAjaxRequest;
                public Boolean useShouldInterceptFetchRequest;
                public Boolean useShouldInterceptRequest;
                public Boolean useShouldOverrideUrlLoading;
                public Boolean useWideViewPort;
                public String userAgent;
                public Boolean verticalScrollBarEnabled;
                public Integer verticalScrollbarPosition;
                public String verticalScrollbarThumbColor;
                public String verticalScrollbarTrackColor;
                public Map<String, Object> webViewAssetLoader;

                /* JADX INFO: renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings$1 */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static /* synthetic */ class C07061 {
                    static final /* synthetic */ int[] $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm;

                    static {
/* 6 */                 int[] iArr = new int[WebSettings.LayoutAlgorithm.values().length];
/* 8 */                 $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm = iArr;
                        try {
/* 17 */                    iArr[WebSettings.LayoutAlgorithm.NORMAL.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 28 */                    $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 39 */                    $SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[WebSettings.LayoutAlgorithm.NARROW_COLUMNS.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                    }
                }

                public InAppWebViewSettings() {
/* 4 */             Boolean bool = Boolean.FALSE;
/* 6 */             this.useShouldOverrideUrlLoading = bool;
/* 8 */             this.useOnLoadResource = bool;
/* 10 */            this.useOnDownloadStart = bool;
/* 12 */            this.clearCache = bool;
/* 16 */            this.userAgent = HttpUrl.FRAGMENT_ENCODE_SET;
/* 18 */            this.applicationNameForUserAgent = HttpUrl.FRAGMENT_ENCODE_SET;
/* 20 */            Boolean bool2 = Boolean.TRUE;
/* 22 */            this.javaScriptEnabled = bool2;
/* 24 */            this.javaScriptCanOpenWindowsAutomatically = bool;
/* 26 */            this.mediaPlaybackRequiresUserGesture = bool2;
/* 34 */            this.minimumFontSize = 8;
/* 36 */            this.verticalScrollBarEnabled = bool2;
/* 38 */            this.horizontalScrollBarEnabled = bool2;
/* 45 */            this.resourceCustomSchemes = new ArrayList();
/* 52 */            this.contentBlockers = new ArrayList();
/* 64 */            this.preferredContentMode = Integer.valueOf(PreferredContentModeOptionType.RECOMMENDED.toValue());
/* 66 */            this.useShouldInterceptAjaxRequest = bool;
/* 68 */            this.interceptOnlyAsyncAjaxRequests = bool2;
/* 70 */            this.useShouldInterceptFetchRequest = bool;
/* 72 */            this.incognito = bool;
/* 74 */            this.cacheEnabled = bool2;
/* 76 */            this.transparentBackground = bool;
/* 78 */            this.disableVerticalScroll = bool;
/* 80 */            this.disableHorizontalScroll = bool;
/* 82 */            this.disableContextMenu = bool;
/* 84 */            this.supportZoom = bool2;
/* 86 */            this.allowFileAccessFromFileURLs = bool;
/* 88 */            this.allowUniversalAccessFromFileURLs = bool;
/* 90 */            this.allowBackgroundAudioPlaying = bool;
/* 98 */            this.textZoom = 100;
/* 100 */           this.clearSessionCache = bool;
/* 102 */           this.builtInZoomControls = bool2;
/* 104 */           this.displayZoomControls = bool;
/* 106 */           this.databaseEnabled = bool;
/* 108 */           this.domStorageEnabled = bool2;
/* 110 */           this.useWideViewPort = bool2;
/* 112 */           this.safeBrowsingEnabled = bool2;
/* 114 */           this.allowContentAccess = bool2;
/* 116 */           this.allowFileAccess = bool2;
/* 118 */           this.blockNetworkImage = bool;
/* 120 */           this.blockNetworkLoads = bool;
/* 127 */           this.cacheMode = -1;
/* 131 */           this.cursiveFontFamily = "cursive";
/* 139 */           this.defaultFixedFontSize = 16;
/* 141 */           this.defaultFontSize = 16;
/* 145 */           this.defaultTextEncodingName = "UTF-8";
/* 149 */           this.fantasyFontFamily = "fantasy";
/* 153 */           this.fixedFontFamily = "monospace";
/* 160 */           this.forceDark = 0;
/* 167 */           this.forceDarkStrategy = 2;
/* 169 */           this.geolocationEnabled = bool2;
/* 171 */           this.loadWithOverviewMode = bool2;
/* 173 */           this.loadsImagesAutomatically = bool2;
/* 175 */           this.minimumLogicalFontSize = 8;
/* 177 */           this.initialScale = 0;
/* 179 */           this.needInitialFocus = bool2;
/* 181 */           this.offscreenPreRaster = bool;
/* 185 */           this.sansSerifFontFamily = "sans-serif";
/* 187 */           this.serifFontFamily = "sans-serif";
/* 189 */           this.standardFontFamily = "sans-serif";
/* 191 */           this.saveFormData = bool2;
/* 193 */           this.thirdPartyCookiesEnabled = bool2;
/* 195 */           this.hardwareAcceleration = bool2;
/* 197 */           this.supportMultipleWindows = bool;
/* 204 */           this.overScrollMode = 1;
/* 207 */           this.networkAvailable = null;
/* 209 */           this.scrollBarStyle = 0;
/* 211 */           this.verticalScrollbarPosition = 0;
/* 213 */           this.scrollBarDefaultDelayBeforeFade = null;
/* 215 */           this.scrollbarFadingEnabled = bool2;
/* 217 */           this.scrollBarFadeDuration = null;
/* 219 */           this.rendererPriorityPolicy = null;
/* 221 */           this.useShouldInterceptRequest = bool;
/* 223 */           this.useOnRenderProcessGone = bool;
/* 225 */           this.disableDefaultErrorPage = bool;
/* 227 */           this.useHybridComposition = bool2;
/* 229 */           this.algorithmicDarkeningAllowed = bool;
/* 231 */           this.enterpriseAuthenticationAppLinkPolicyEnabled = bool2;
                }

                private String getLayoutAlgorithm() {
/* 1 */             WebSettings.LayoutAlgorithm layoutAlgorithm = this.layoutAlgorithm;
/* 3 */             if (layoutAlgorithm == null) {
/* 32 */                return null;
                    }
/* 11 */            int i = C07061.$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm[layoutAlgorithm.ordinal()];
/* 14 */            if (i == 1) {
/* 29 */                return "NORMAL";
                    }
/* 17 */            if (i == 2) {
/* 26 */                return "TEXT_AUTOSIZING";
                    }
/* 20 */            if (i != 3) {
/* 32 */                return null;
                    }
/* 23 */            return "NARROW_COLUMNS";
                }

                private void setLayoutAlgorithm(String str) {
/* 1 */             if (str != null) {
                        switch (str) {
                            case "NARROW_COLUMNS":
/* 50 */                        this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NARROW_COLUMNS;
                            case "NORMAL":
/* 54 */                        this.layoutAlgorithm = WebSettings.LayoutAlgorithm.NORMAL;
                            case "TEXT_AUTOSIZING":
/* 58 */                        this.layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING;
                                break;
                        }
                    }
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> getRealSettings(InAppWebViewInterface inAppWebViewInterface) {
                    int forceDark;
                    boolean safeBrowsingEnabled;
/* 1 */             Map<String, Object> map = toMap();
/* 7 */             if (inAppWebViewInterface instanceof InAppWebView) {
/* 9 */                 InAppWebView inAppWebView = (InAppWebView) inAppWebViewInterface;
/* 11 */                WebSettings settings = inAppWebView.getSettings();
/* 21 */                map.put("userAgent", settings.getUserAgentString());
/* 34 */                map.put("javaScriptEnabled", Boolean.valueOf(settings.getJavaScriptEnabled()));
/* 47 */                map.put("javaScriptCanOpenWindowsAutomatically", Boolean.valueOf(settings.getJavaScriptCanOpenWindowsAutomatically()));
/* 60 */                map.put("mediaPlaybackRequiresUserGesture", Boolean.valueOf(settings.getMediaPlaybackRequiresUserGesture()));
/* 73 */                map.put("minimumFontSize", Integer.valueOf(settings.getMinimumFontSize()));
/* 86 */                map.put("verticalScrollBarEnabled", Boolean.valueOf(inAppWebView.isVerticalScrollBarEnabled()));
/* 99 */                map.put("horizontalScrollBarEnabled", Boolean.valueOf(inAppWebView.isHorizontalScrollBarEnabled()));
/* 112 */               map.put("textZoom", Integer.valueOf(settings.getTextZoom()));
/* 125 */               map.put("builtInZoomControls", Boolean.valueOf(settings.getBuiltInZoomControls()));
/* 138 */               map.put("supportZoom", Boolean.valueOf(settings.supportZoom()));
/* 151 */               map.put("displayZoomControls", Boolean.valueOf(settings.getDisplayZoomControls()));
/* 164 */               map.put("databaseEnabled", Boolean.valueOf(settings.getDatabaseEnabled()));
/* 177 */               map.put("domStorageEnabled", Boolean.valueOf(settings.getDomStorageEnabled()));
/* 190 */               map.put("useWideViewPort", Boolean.valueOf(settings.getUseWideViewPort()));
/* 203 */               if (xe2.m9786x("SAFE_BROWSING_ENABLE")) {
/* 205 */                   C1823k9 c1823k9 = b73.f2301b;
/* 211 */                   if (c1823k9.mo6026a()) {
/* 213 */                       safeBrowsingEnabled = AbstractC2099q9.m7737b(settings);
                            } else {
/* 222 */                       if (!c1823k9.mo97b()) {
/* 248 */                           throw b73.m1295a();
                                }
/* 232 */                       safeBrowsingEnabled = ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).getSafeBrowsingEnabled();
                            }
/* 240 */                   map.put("safeBrowsingEnabled", Boolean.valueOf(safeBrowsingEnabled));
                        } else if (Build.VERSION.SDK_INT >= 26) {
/* 261 */                   map.put("safeBrowsingEnabled", Boolean.valueOf(settings.getSafeBrowsingEnabled()));
                        }
/* 264 */               int i = Build.VERSION.SDK_INT;
/* 276 */               map.put("mixedContentMode", Integer.valueOf(settings.getMixedContentMode()));
/* 289 */               map.put("allowContentAccess", Boolean.valueOf(settings.getAllowContentAccess()));
/* 302 */               map.put("allowFileAccess", Boolean.valueOf(settings.getAllowFileAccess()));
/* 315 */               map.put("allowFileAccessFromFileURLs", Boolean.valueOf(settings.getAllowFileAccessFromFileURLs()));
/* 328 */               map.put("allowUniversalAccessFromFileURLs", Boolean.valueOf(settings.getAllowUniversalAccessFromFileURLs()));
/* 341 */               map.put("blockNetworkImage", Boolean.valueOf(settings.getBlockNetworkImage()));
/* 354 */               map.put("blockNetworkLoads", Boolean.valueOf(settings.getBlockNetworkLoads()));
/* 367 */               map.put("cacheMode", Integer.valueOf(settings.getCacheMode()));
/* 376 */               map.put("cursiveFontFamily", settings.getCursiveFontFamily());
/* 389 */               map.put("defaultFixedFontSize", Integer.valueOf(settings.getDefaultFixedFontSize()));
/* 402 */               map.put("defaultFontSize", Integer.valueOf(settings.getDefaultFontSize()));
/* 411 */               map.put("defaultTextEncodingName", settings.getDefaultTextEncodingName());
/* 422 */               if (xe2.m9786x("DISABLED_ACTION_MODE_MENU_ITEMS")) {
/* 426 */                   b73.f2302c.getClass();
/* 437 */                   map.put("disabledActionModeMenuItems", Integer.valueOf(AbstractC2062p9.m7359f(settings)));
                        }
/* 448 */               map.put("disabledActionModeMenuItems", Integer.valueOf(settings.getDisabledActionModeMenuItems()));
/* 457 */               map.put("fantasyFontFamily", settings.getFantasyFontFamily());
/* 466 */               map.put("fixedFontFamily", settings.getFixedFontFamily());
/* 479 */               if (xe2.m9786x("FORCE_DARK")) {
/* 481 */                   C1823k9 c1823k10 = b73.f2291G;
/* 487 */                   if (c1823k10.mo6026a()) {
/* 489 */                       forceDark = AbstractC2247u9.m8974a(settings);
                            } else {
/* 498 */                       if (!c1823k10.mo97b()) {
/* 524 */                           throw b73.m1295a();
                                }
/* 508 */                       forceDark = ((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).getForceDark();
                            }
/* 516 */                   map.put("forceDark", Integer.valueOf(forceDark));
                        } else if (i >= 29) {
/* 535 */                   map.put("forceDark", Integer.valueOf(settings.getForceDark()));
                        }
/* 544 */               if (xe2.m9786x("FORCE_DARK_STRATEGY")) {
/* 552 */                   if (!b73.f2292H.mo97b()) {
/* 580 */                       throw b73.m1295a();
                            }
/* 572 */                   map.put("forceDarkStrategy", Integer.valueOf(((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).getForceDark()));
                        }
/* 591 */               map.put("layoutAlgorithm", settings.getLayoutAlgorithm().name());
/* 604 */               map.put("loadWithOverviewMode", Boolean.valueOf(settings.getLoadWithOverviewMode()));
/* 617 */               map.put("loadsImagesAutomatically", Boolean.valueOf(settings.getLoadsImagesAutomatically()));
/* 630 */               map.put("minimumLogicalFontSize", Integer.valueOf(settings.getMinimumLogicalFontSize()));
/* 641 */               if (xe2.m9786x("OFF_SCREEN_PRERASTER")) {
/* 645 */                   b73.f2300a.getClass();
/* 656 */                   map.put("offscreenPreRaster", Boolean.valueOf(AbstractC1993o9.m7120g(settings)));
                        } else {
/* 668 */                   map.put("offscreenPreRaster", Boolean.valueOf(settings.getOffscreenPreRaster()));
                        }
/* 677 */               map.put("sansSerifFontFamily", settings.getSansSerifFontFamily());
/* 686 */               map.put("serifFontFamily", settings.getSerifFontFamily());
/* 695 */               map.put("standardFontFamily", settings.getStandardFontFamily());
/* 708 */               map.put("saveFormData", Boolean.valueOf(settings.getSaveFormData()));
/* 721 */               map.put("supportMultipleWindows", Boolean.valueOf(settings.supportMultipleWindows()));
/* 734 */               map.put("overScrollMode", Integer.valueOf(inAppWebView.getOverScrollMode()));
/* 747 */               map.put("scrollBarStyle", Integer.valueOf(inAppWebView.getScrollBarStyle()));
/* 760 */               map.put("verticalScrollbarPosition", Integer.valueOf(inAppWebView.getVerticalScrollbarPosition()));
/* 773 */               map.put("scrollBarDefaultDelayBeforeFade", Integer.valueOf(inAppWebView.getScrollBarDefaultDelayBeforeFade()));
/* 786 */               map.put("scrollbarFadingEnabled", Boolean.valueOf(inAppWebView.isScrollbarFadingEnabled()));
/* 799 */               map.put("scrollBarFadeDuration", Integer.valueOf(inAppWebView.getScrollBarFadeDuration()));
/* 802 */               if (i >= 26) {
/* 806 */                   HashMap map2 = new HashMap();
/* 819 */                   map2.put("rendererRequestedPriority", Integer.valueOf(inAppWebView.getRendererRequestedPriority()));
/* 832 */                   map2.put("waivedWhenNotVisible", Boolean.valueOf(inAppWebView.getRendererPriorityWaivedWhenNotVisible()));
/* 837 */                   map.put("rendererPriorityPolicy", map2);
                        }
/* 846 */               if (xe2.m9786x("ALGORITHMIC_DARKENING") && i >= 29) {
/* 856 */                   if (!b73.f2288D.mo97b()) {
/* 884 */                       throw b73.m1295a();
                            }
/* 876 */                   map.put("algorithmicDarkeningAllowed", Boolean.valueOf(((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).isAlgorithmicDarkeningAllowed()));
                        }
/* 891 */               if (xe2.m9786x("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")) {
/* 899 */                   if (!b73.f2297M.mo97b()) {
/* 927 */                       throw b73.m1295a();
                            }
/* 919 */                   map.put("enterpriseAuthenticationAppLinkPolicyEnabled", Boolean.valueOf(((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).getEnterpriseAuthenticationAppLinkPolicyEnabled()));
                        }
/* 934 */               if (xe2.m9786x("REQUESTED_WITH_HEADER_ALLOW_LIST")) {
/* 944 */                   if (!b73.f2299O.mo97b()) {
/* 971 */                       throw b73.m1295a();
                            }
/* 963 */                   map.put("requestedWithHeaderOriginAllowList", new ArrayList(((WebSettingsBoundaryInterface) p63.m7342a(settings).f7853b).getRequestedWithHeaderOriginAllowList()));
/* 966 */                   return map;
                        }
                    }
/* 972 */           return map;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                /* JADX INFO: renamed from: parse, reason: avoid collision after fix types in other method */
                public ISettings<InAppWebViewInterface> parse2(Map<String, Object> map) {
/* 13 */            for (Map.Entry<String, Object> entry : map.entrySet()) {
/* 21 */                String key = entry.getKey();
/* 27 */                Object value = entry.getValue();
/* 31 */                if (value != null) {
/* 34 */                    key.getClass();
/* 41 */                    byte b = -1;
                            switch (key.hashCode()) {
                                case -2116596967:
/* 1264 */                          if (key.equals("disableHorizontalScroll")) {
/* 1267 */                              b = 0;
                                    }
                                    break;
                                case -2095822429:
/* 1253 */                          if (key.equals("scrollBarDefaultDelayBeforeFade")) {
/* 1256 */                              b = 1;
                                    }
                                    break;
                                case -2020146208:
/* 1242 */                          if (key.equals("useWideViewPort")) {
/* 1245 */                              b = 2;
                                    }
                                    break;
                                case -2014672109:
/* 1231 */                          if (key.equals("allowFileAccessFromFileURLs")) {
/* 1234 */                              b = 3;
                                    }
                                    break;
                                case -1931277743:
/* 1220 */                          if (key.equals("defaultFontSize")) {
/* 1223 */                              b = 4;
                                    }
                                    break;
                                case -1851090878:
/* 1209 */                          if (key.equals("supportZoom")) {
/* 1212 */                              b = 5;
                                    }
                                    break;
                                case -1845480382:
/* 1198 */                          if (key.equals("scrollbarFadingEnabled")) {
/* 1201 */                              b = 6;
                                    }
                                    break;
                                case -1834028884:
/* 1187 */                          if (key.equals("defaultTextEncodingName")) {
/* 1190 */                              b = 7;
                                    }
                                    break;
                                case -1746033750:
/* 1173 */                          if (key.equals("needInitialFocus")) {
/* 1177 */                              b = 8;
                                    }
                                    break;
                                case -1712086669:
/* 1159 */                          if (key.equals("useShouldOverrideUrlLoading")) {
/* 1163 */                              b = 9;
                                    }
                                    break;
                                case -1673892229:
/* 1145 */                          if (key.equals("preferredContentMode")) {
/* 1149 */                              b = 10;
                                    }
                                    break;
                                case -1657552268:
/* 1131 */                          if (key.equals("allowContentAccess")) {
/* 1135 */                              b = 11;
                                    }
                                    break;
                                case -1626497241:
/* 1117 */                          if (key.equals("fixedFontFamily")) {
/* 1121 */                              b = 12;
                                    }
                                    break;
                                case -1615103092:
/* 1103 */                          if (key.equals("builtInZoomControls")) {
/* 1107 */                              b = 13;
                                    }
                                    break;
                                case -1607633676:
/* 1089 */                          if (key.equals("javaScriptEnabled")) {
/* 1093 */                              b = 14;
                                    }
                                    break;
                                case -1578962296:
/* 1075 */                          if (key.equals("hardwareAcceleration")) {
/* 1079 */                              b = 15;
                                    }
                                    break;
                                case -1578507205:
/* 1061 */                          if (key.equals("networkAvailable")) {
/* 1065 */                              b = 16;
                                    }
                                    break;
                                case -1574470051:
/* 1047 */                          if (key.equals("useShouldInterceptFetchRequest")) {
/* 1051 */                              b = 17;
                                    }
                                    break;
                                case -1480607106:
/* 1033 */                          if (key.equals("loadsImagesAutomatically")) {
/* 1037 */                              b = 18;
                                    }
                                    break;
                                case -1455624881:
/* 1019 */                          if (key.equals("resourceCustomSchemes")) {
/* 1023 */                              b = 19;
                                    }
                                    break;
                                case -1443655540:
/* 1005 */                          if (key.equals("disabledActionModeMenuItems")) {
/* 1009 */                              b = 20;
                                    }
                                    break;
                                case -1423657812:
/* 991 */                           if (key.equals("incognito")) {
/* 995 */                               b = 21;
                                    }
                                    break;
                                case -1410791825:
/* 977 */                           if (key.equals("allowBackgroundAudioPlaying")) {
/* 981 */                               b = 22;
                                    }
                                    break;
                                case -1349570230:
/* 963 */                           if (key.equals("webViewAssetLoader")) {
/* 967 */                               b = 23;
                                    }
                                    break;
                                case -1321236988:
/* 949 */                           if (key.equals("overScrollMode")) {
/* 953 */                               b = 24;
                                    }
                                    break;
                                case -1146673624:
/* 935 */                           if (key.equals("domStorageEnabled")) {
/* 939 */                               b = 25;
                                    }
                                    break;
                                case -1143245914:
/* 921 */                           if (key.equals("disableContextMenu")) {
/* 925 */                               b = 26;
                                    }
                                    break;
                                case -1038715033:
/* 907 */                           if (key.equals("useShouldInterceptAjaxRequest")) {
/* 911 */                               b = 27;
                                    }
                                    break;
                                case -1003454816:
/* 893 */                           if (key.equals("textZoom")) {
/* 897 */                               b = 28;
                                    }
                                    break;
                                case -868328270:
/* 879 */                           if (key.equals("interceptOnlyAsyncAjaxRequests")) {
/* 883 */                               b = 29;
                                    }
                                    break;
                                case -800676066:
/* 865 */                           if (key.equals("minimumFontSize")) {
/* 869 */                               b = 30;
                                    }
                                    break;
                                case -767637403:
/* 851 */                           if (key.equals("layoutAlgorithm")) {
/* 855 */                               b = 31;
                                    }
                                    break;
                                case -759238347:
/* 837 */                           if (key.equals("clearCache")) {
/* 841 */                               b = 32;
                                    }
                                    break;
                                case -742944736:
/* 823 */                           if (key.equals("transparentBackground")) {
/* 827 */                               b = 33;
                                    }
                                    break;
                                case -741649011:
/* 809 */                           if (key.equals("enterpriseAuthenticationAppLinkPolicyEnabled")) {
/* 813 */                               b = 34;
                                    }
                                    break;
                                case -728016272:
/* 795 */                           if (key.equals("allowUniversalAccessFromFileURLs")) {
/* 799 */                               b = 35;
                                    }
                                    break;
                                case -710246074:
/* 781 */                           if (key.equals("databaseEnabled")) {
/* 785 */                               b = 36;
                                    }
                                    break;
                                case -706772569:
/* 767 */                           if (key.equals("useShouldInterceptRequest")) {
/* 771 */                               b = 37;
                                    }
                                    break;
                                case -553792443:
/* 753 */                           if (key.equals("cacheMode")) {
/* 757 */                               b = 38;
                                    }
                                    break;
                                case -443422049:
/* 739 */                           if (key.equals("horizontalScrollBarEnabled")) {
/* 743 */                               b = 39;
                                    }
                                    break;
                                case -435719349:
/* 725 */                           if (key.equals("scrollBarStyle")) {
/* 729 */                               b = 40;
                                    }
                                    break;
                                case -421090202:
/* 711 */                           if (key.equals("initialScale")) {
/* 715 */                               b = 41;
                                    }
                                    break;
                                case -321425255:
/* 697 */                           if (key.equals("verticalScrollbarPosition")) {
/* 701 */                               b = 42;
                                    }
                                    break;
                                case -229178645:
/* 683 */                           if (key.equals("disableVerticalScroll")) {
/* 687 */                               b = 43;
                                    }
                                    break;
                                case -227577491:
/* 669 */                           if (key.equals("javaScriptCanOpenWindowsAutomatically")) {
/* 673 */                               b = 44;
                                    }
                                    break;
                                case -225496870:
/* 655 */                           if (key.equals("horizontalScrollbarTrackColor")) {
/* 659 */                               b = 45;
                                    }
                                    break;
                                case -225165915:
/* 641 */                           if (key.equals("offscreenPreRaster")) {
/* 645 */                               b = 46;
                                    }
                                    break;
                                case -216514471:
/* 627 */                           if (key.equals("fantasyFontFamily")) {
/* 631 */                               b = 47;
                                    }
                                    break;
                                case -158057575:
/* 613 */                           if (key.equals("rendererPriorityPolicy")) {
/* 617 */                               b = 48;
                                    }
                                    break;
                                case -98561827:
/* 599 */                           if (key.equals("sansSerifFontFamily")) {
/* 603 */                               b = 49;
                                    }
                                    break;
                                case 57717170:
/* 585 */                           if (key.equals("regexToCancelSubFramesLoading")) {
/* 589 */                               b = 50;
                                    }
                                    break;
                                case 100868168:
/* 571 */                           if (key.equals("verticalScrollbarTrackColor")) {
/* 575 */                               b = 51;
                                    }
                                    break;
                                case 174479508:
/* 557 */                           if (key.equals("useOnDownloadStart")) {
/* 561 */                               b = 52;
                                    }
                                    break;
                                case 229242772:
/* 543 */                           if (key.equals("forceDarkStrategy")) {
/* 547 */                               b = 53;
                                    }
                                    break;
                                case 257886264:
/* 529 */                           if (key.equals("cursiveFontFamily")) {
/* 533 */                               b = 54;
                                    }
                                    break;
                                case 273267153:
/* 515 */                           if (key.equals("mediaPlaybackRequiresUserGesture")) {
/* 519 */                               b = 55;
                                    }
                                    break;
                                case 296040698:
/* 501 */                           if (key.equals("blockNetworkImage")) {
/* 505 */                               b = 56;
                                    }
                                    break;
                                case 298870764:
/* 487 */                           if (key.equals("blockNetworkLoads")) {
/* 491 */                               b = 57;
                                    }
                                    break;
                                case 311430650:
/* 473 */                           if (key.equals("userAgent")) {
/* 477 */                               b = 58;
                                    }
                                    break;
                                case 387230482:
/* 459 */                           if (key.equals("useOnRenderProcessGone")) {
/* 463 */                               b = 59;
                                    }
                                    break;
                                case 393481210:
/* 445 */                           if (key.equals("useOnLoadResource")) {
/* 449 */                               b = 60;
                                    }
                                    break;
                                case 397237599:
/* 431 */                           if (key.equals("cacheEnabled")) {
/* 435 */                               b = 61;
                                    }
                                    break;
                                case 408799019:
/* 417 */                           if (key.equals("saveFormData")) {
/* 421 */                               b = 62;
                                    }
                                    break;
                                case 477312960:
/* 403 */                           if (key.equals("requestedWithHeaderOriginAllowList")) {
/* 407 */                               b = Utf8.REPLACEMENT_BYTE;
                                    }
                                    break;
                                case 487904071:
/* 389 */                           if (key.equals("useHybridComposition")) {
/* 393 */                               b = 64;
                                    }
                                    break;
                                case 590869196:
/* 375 */                           if (key.equals("applicationNameForUserAgent")) {
/* 379 */                               b = 65;
                                    }
                                    break;
                                case 760962753:
/* 361 */                           if (key.equals("mixedContentMode")) {
/* 365 */                               b = 66;
                                    }
                                    break;
                                case 849171798:
/* 347 */                           if (key.equals("scrollBarFadeDuration")) {
/* 351 */                               b = 67;
                                    }
                                    break;
                                case 1138246185:
/* 333 */                           if (key.equals("allowFileAccess")) {
/* 337 */                               b = 68;
                                    }
                                    break;
                                case 1156608422:
/* 319 */                           if (key.equals("appCachePath")) {
/* 323 */                               b = 69;
                                    }
                                    break;
                                case 1193086767:
/* 305 */                           if (key.equals("horizontalScrollbarThumbColor")) {
/* 309 */                               b = 70;
                                    }
                                    break;
                                case 1301942064:
/* 291 */                           if (key.equals("standardFontFamily")) {
/* 295 */                               b = 71;
                                    }
                                    break;
                                case 1320461707:
/* 277 */                           if (key.equals("displayZoomControls")) {
/* 281 */                               b = 72;
                                    }
                                    break;
                                case 1344414299:
/* 263 */                           if (key.equals("geolocationEnabled")) {
/* 267 */                               b = 73;
                                    }
                                    break;
                                case 1409728424:
/* 249 */                           if (key.equals("loadWithOverviewMode")) {
/* 253 */                               b = 74;
                                    }
                                    break;
                                case 1474890029:
/* 235 */                           if (key.equals("safeBrowsingEnabled")) {
/* 239 */                               b = 75;
                                    }
                                    break;
                                case 1496887792:
/* 221 */                           if (key.equals("serifFontFamily")) {
/* 225 */                               b = 76;
                                    }
                                    break;
                                case 1519451805:
/* 207 */                           if (key.equals("verticalScrollbarThumbColor")) {
/* 211 */                               b = 77;
                                    }
                                    break;
                                case 1527546113:
/* 193 */                           if (key.equals("forceDark")) {
/* 197 */                               b = 78;
                                    }
                                    break;
                                case 1583791742:
/* 179 */                           if (key.equals("disableDefaultErrorPage")) {
/* 183 */                               b = 79;
                                    }
                                    break;
                                case 1759079762:
/* 165 */                           if (key.equals("contentBlockers")) {
/* 169 */                               b = 80;
                                    }
                                    break;
                                case 1774215812:
/* 151 */                           if (key.equals("supportMultipleWindows")) {
/* 155 */                               b = 81;
                                    }
                                    break;
                                case 1793491907:
/* 137 */                           if (key.equals("defaultFixedFontSize")) {
/* 141 */                               b = 82;
                                    }
                                    break;
                                case 1812525393:
/* 123 */                           if (key.equals("thirdPartyCookiesEnabled")) {
/* 127 */                               b = 83;
                                    }
                                    break;
                                case 1956631083:
/* 109 */                           if (key.equals("minimumLogicalFontSize")) {
/* 113 */                               b = 84;
                                    }
                                    break;
                                case 2011947505:
/* 95 */                            if (key.equals("verticalScrollBarEnabled")) {
/* 99 */                                b = 85;
                                    }
                                    break;
                                case 2038327673:
/* 81 */                            if (key.equals("clearSessionCache")) {
/* 85 */                                b = 86;
                                    }
                                    break;
                                case 2056553639:
/* 67 */                            if (key.equals("defaultVideoPoster")) {
/* 71 */                                b = 87;
                                    }
                                    break;
                                case 2086547246:
/* 53 */                            if (key.equals("algorithmicDarkeningAllowed")) {
/* 57 */                                b = 88;
                                    }
                                    break;
                            }
                            switch (b) {
                                case 0:
/* 1809 */                          this.disableHorizontalScroll = (Boolean) value;
                                    break;
                                case 1:
/* 1803 */                          this.scrollBarDefaultDelayBeforeFade = (Integer) value;
                                    break;
                                case 2:
/* 1797 */                          this.useWideViewPort = (Boolean) value;
                                    break;
                                case 3:
/* 1791 */                          this.allowFileAccessFromFileURLs = (Boolean) value;
                                    break;
                                case 4:
/* 1785 */                          this.defaultFontSize = (Integer) value;
                                    break;
                                case 5:
/* 1779 */                          this.supportZoom = (Boolean) value;
                                    break;
                                case 6:
/* 1773 */                          this.scrollbarFadingEnabled = (Boolean) value;
                                    break;
                                case 7:
/* 1767 */                          this.defaultTextEncodingName = (String) value;
                                    break;
                                case 8:
/* 1761 */                          this.needInitialFocus = (Boolean) value;
                                    break;
                                case 9:
/* 1755 */                          this.useShouldOverrideUrlLoading = (Boolean) value;
                                    break;
                                case 10:
/* 1749 */                          this.preferredContentMode = (Integer) value;
                                    break;
                                case 11:
/* 1743 */                          this.allowContentAccess = (Boolean) value;
                                    break;
                                case 12:
/* 1737 */                          this.fixedFontFamily = (String) value;
                                    break;
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 1731 */                          this.builtInZoomControls = (Boolean) value;
                                    break;
                                case 14:
/* 1725 */                          this.javaScriptEnabled = (Boolean) value;
                                    break;
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 1719 */                          this.hardwareAcceleration = (Boolean) value;
                                    break;
                                case 16:
/* 1713 */                          this.networkAvailable = (Boolean) value;
                                    break;
                                case 17:
/* 1707 */                          this.useShouldInterceptFetchRequest = (Boolean) value;
                                    break;
                                case 18:
/* 1701 */                          this.loadsImagesAutomatically = (Boolean) value;
                                    break;
                                case 19:
/* 1695 */                          this.resourceCustomSchemes = (List) value;
                                    break;
                                case 20:
/* 1689 */                          this.disabledActionModeMenuItems = (Integer) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_21 /* 21 */:
/* 1683 */                          this.incognito = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_22 /* 22 */:
/* 1677 */                          this.allowBackgroundAudioPlaying = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_23 /* 23 */:
/* 1671 */                          this.webViewAssetLoader = (Map) value;
                                    break;
                                case 24:
/* 1665 */                          this.overScrollMode = (Integer) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_25 /* 25 */:
/* 1659 */                          this.domStorageEnabled = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_26 /* 26 */:
/* 1653 */                          this.disableContextMenu = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_27 /* 27 */:
/* 1647 */                          this.useShouldInterceptAjaxRequest = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_28 /* 28 */:
/* 1641 */                          this.textZoom = (Integer) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_29 /* 29 */:
/* 1635 */                          this.interceptOnlyAsyncAjaxRequests = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_30 /* 30 */:
/* 1629 */                          this.minimumFontSize = (Integer) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_31 /* 31 */:
/* 1622 */                          setLayoutAlgorithm((String) value);
                                    break;
                                case 32:
/* 1616 */                          this.clearCache = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_33 /* 33 */:
/* 1610 */                          this.transparentBackground = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_34 /* 34 */:
/* 1604 */                          this.enterpriseAuthenticationAppLinkPolicyEnabled = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_35 /* 35 */:
/* 1598 */                          this.allowUniversalAccessFromFileURLs = (Boolean) value;
                                    break;
                                case io.flutter.Build.API_LEVELS.API_36 /* 36 */:
/* 1592 */                          this.databaseEnabled = (Boolean) value;
                                    break;
                                case 37:
/* 1586 */                          this.useShouldInterceptRequest = (Boolean) value;
                                    break;
                                case 38:
/* 1580 */                          this.cacheMode = (Integer) value;
                                    break;
                                case 39:
/* 1574 */                          this.horizontalScrollBarEnabled = (Boolean) value;
                                    break;
                                case RequestError.NETWORK_FAILURE /* 40 */:
/* 1568 */                          this.scrollBarStyle = (Integer) value;
                                    break;
                                case RequestError.NO_DEV_KEY /* 41 */:
/* 1562 */                          this.initialScale = (Integer) value;
                                    break;
                                case 42:
/* 1556 */                          this.verticalScrollbarPosition = (Integer) value;
                                    break;
                                case 43:
/* 1550 */                          this.disableVerticalScroll = (Boolean) value;
                                    break;
                                case 44:
/* 1544 */                          this.javaScriptCanOpenWindowsAutomatically = (Boolean) value;
                                    break;
                                case 45:
/* 1538 */                          this.horizontalScrollbarTrackColor = (String) value;
                                    break;
                                case 46:
/* 1532 */                          this.offscreenPreRaster = (Boolean) value;
                                    break;
                                case 47:
/* 1526 */                          this.fantasyFontFamily = (String) value;
                                    break;
                                case 48:
/* 1520 */                          this.rendererPriorityPolicy = (Map) value;
                                    break;
                                case 49:
/* 1514 */                          this.sansSerifFontFamily = (String) value;
                                    break;
                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
/* 1508 */                          this.regexToCancelSubFramesLoading = (String) value;
                                    break;
                                case 51:
/* 1502 */                          this.verticalScrollbarTrackColor = (String) value;
                                    break;
                                case 52:
/* 1496 */                          this.useOnDownloadStart = (Boolean) value;
                                    break;
                                case 53:
/* 1490 */                          this.forceDarkStrategy = (Integer) value;
                                    break;
                                case 54:
/* 1484 */                          this.cursiveFontFamily = (String) value;
                                    break;
                                case 55:
/* 1478 */                          this.mediaPlaybackRequiresUserGesture = (Boolean) value;
                                    break;
                                case 56:
/* 1472 */                          this.blockNetworkImage = (Boolean) value;
                                    break;
                                case 57:
/* 1466 */                          this.blockNetworkLoads = (Boolean) value;
                                    break;
                                case 58:
/* 1460 */                          this.userAgent = (String) value;
                                    break;
                                case 59:
/* 1454 */                          this.useOnRenderProcessGone = (Boolean) value;
                                    break;
                                case 60:
/* 1448 */                          this.useOnLoadResource = (Boolean) value;
                                    break;
                                case 61:
/* 1442 */                          this.cacheEnabled = (Boolean) value;
                                    break;
                                case 62:
/* 1436 */                          this.saveFormData = (Boolean) value;
                                    break;
                                case 63:
/* 1430 */                          this.requestedWithHeaderOriginAllowList = new HashSet((List) value);
                                    break;
                                case 64:
/* 1419 */                          this.useHybridComposition = (Boolean) value;
                                    break;
                                case 65:
/* 1413 */                          this.applicationNameForUserAgent = (String) value;
                                    break;
                                case 66:
/* 1407 */                          this.mixedContentMode = (Integer) value;
                                    break;
                                case 67:
/* 1401 */                          this.scrollBarFadeDuration = (Integer) value;
                                    break;
                                case 68:
/* 1395 */                          this.allowFileAccess = (Boolean) value;
                                    break;
                                case 69:
/* 1389 */                          this.appCachePath = (String) value;
                                    break;
                                case 70:
/* 1383 */                          this.horizontalScrollbarThumbColor = (String) value;
                                    break;
                                case 71:
/* 1377 */                          this.standardFontFamily = (String) value;
                                    break;
                                case 72:
/* 1371 */                          this.displayZoomControls = (Boolean) value;
                                    break;
                                case 73:
/* 1365 */                          this.geolocationEnabled = (Boolean) value;
                                    break;
                                case 74:
/* 1359 */                          this.loadWithOverviewMode = (Boolean) value;
                                    break;
                                case 75:
/* 1353 */                          this.safeBrowsingEnabled = (Boolean) value;
                                    break;
                                case 76:
/* 1347 */                          this.serifFontFamily = (String) value;
                                    break;
                                case 77:
/* 1341 */                          this.verticalScrollbarThumbColor = (String) value;
                                    break;
                                case 78:
/* 1335 */                          this.forceDark = (Integer) value;
                                    break;
                                case 79:
/* 1329 */                          this.disableDefaultErrorPage = (Boolean) value;
                                    break;
                                case 80:
/* 1323 */                          this.contentBlockers = (List) value;
                                    break;
                                case 81:
/* 1317 */                          this.supportMultipleWindows = (Boolean) value;
                                    break;
                                case 82:
/* 1311 */                          this.defaultFixedFontSize = (Integer) value;
                                    break;
                                case 83:
/* 1305 */                          this.thirdPartyCookiesEnabled = (Boolean) value;
                                    break;
                                case 84:
/* 1299 */                          this.minimumLogicalFontSize = (Integer) value;
                                    break;
                                case 85:
/* 1293 */                          this.verticalScrollBarEnabled = (Boolean) value;
                                    break;
                                case 86:
/* 1287 */                          this.clearSessionCache = (Boolean) value;
                                    break;
                                case 87:
/* 1281 */                          this.defaultVideoPoster = (byte[]) value;
                                    break;
                                case 88:
/* 1275 */                          this.algorithmicDarkeningAllowed = (Boolean) value;
                                    break;
                            }
                        }
                    }
/* 1813 */          return this;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("useShouldOverrideUrlLoading", this.useShouldOverrideUrlLoading);
/* 17 */            map.put("useOnLoadResource", this.useOnLoadResource);
/* 24 */            map.put("useOnDownloadStart", this.useOnDownloadStart);
/* 31 */            map.put("clearCache", this.clearCache);
/* 38 */            map.put("userAgent", this.userAgent);
/* 45 */            map.put("applicationNameForUserAgent", this.applicationNameForUserAgent);
/* 52 */            map.put("javaScriptEnabled", this.javaScriptEnabled);
/* 59 */            map.put("javaScriptCanOpenWindowsAutomatically", this.javaScriptCanOpenWindowsAutomatically);
/* 66 */            map.put("mediaPlaybackRequiresUserGesture", this.mediaPlaybackRequiresUserGesture);
/* 73 */            map.put("minimumFontSize", this.minimumFontSize);
/* 80 */            map.put("verticalScrollBarEnabled", this.verticalScrollBarEnabled);
/* 87 */            map.put("horizontalScrollBarEnabled", this.horizontalScrollBarEnabled);
/* 94 */            map.put("resourceCustomSchemes", this.resourceCustomSchemes);
/* 101 */           map.put("contentBlockers", this.contentBlockers);
/* 108 */           map.put("preferredContentMode", this.preferredContentMode);
/* 115 */           map.put("useShouldInterceptAjaxRequest", this.useShouldInterceptAjaxRequest);
/* 122 */           map.put("interceptOnlyAsyncAjaxRequests", this.interceptOnlyAsyncAjaxRequests);
/* 129 */           map.put("useShouldInterceptFetchRequest", this.useShouldInterceptFetchRequest);
/* 136 */           map.put("incognito", this.incognito);
/* 143 */           map.put("cacheEnabled", this.cacheEnabled);
/* 150 */           map.put("transparentBackground", this.transparentBackground);
/* 157 */           map.put("disableVerticalScroll", this.disableVerticalScroll);
/* 164 */           map.put("disableHorizontalScroll", this.disableHorizontalScroll);
/* 171 */           map.put("disableContextMenu", this.disableContextMenu);
/* 178 */           map.put("textZoom", this.textZoom);
/* 185 */           map.put("clearSessionCache", this.clearSessionCache);
/* 192 */           map.put("builtInZoomControls", this.builtInZoomControls);
/* 199 */           map.put("displayZoomControls", this.displayZoomControls);
/* 206 */           map.put("supportZoom", this.supportZoom);
/* 213 */           map.put("databaseEnabled", this.databaseEnabled);
/* 220 */           map.put("domStorageEnabled", this.domStorageEnabled);
/* 227 */           map.put("useWideViewPort", this.useWideViewPort);
/* 234 */           map.put("safeBrowsingEnabled", this.safeBrowsingEnabled);
/* 241 */           map.put("mixedContentMode", this.mixedContentMode);
/* 248 */           map.put("allowContentAccess", this.allowContentAccess);
/* 255 */           map.put("allowFileAccess", this.allowFileAccess);
/* 262 */           map.put("allowFileAccessFromFileURLs", this.allowFileAccessFromFileURLs);
/* 269 */           map.put("allowUniversalAccessFromFileURLs", this.allowUniversalAccessFromFileURLs);
/* 276 */           map.put("appCachePath", this.appCachePath);
/* 283 */           map.put("blockNetworkImage", this.blockNetworkImage);
/* 290 */           map.put("blockNetworkLoads", this.blockNetworkLoads);
/* 297 */           map.put("cacheMode", this.cacheMode);
/* 304 */           map.put("cursiveFontFamily", this.cursiveFontFamily);
/* 311 */           map.put("defaultFixedFontSize", this.defaultFixedFontSize);
/* 318 */           map.put("defaultFontSize", this.defaultFontSize);
/* 325 */           map.put("defaultTextEncodingName", this.defaultTextEncodingName);
/* 332 */           map.put("disabledActionModeMenuItems", this.disabledActionModeMenuItems);
/* 339 */           map.put("fantasyFontFamily", this.fantasyFontFamily);
/* 346 */           map.put("fixedFontFamily", this.fixedFontFamily);
/* 353 */           map.put("forceDark", this.forceDark);
/* 360 */           map.put("forceDarkStrategy", this.forceDarkStrategy);
/* 367 */           map.put("geolocationEnabled", this.geolocationEnabled);
/* 376 */           map.put("layoutAlgorithm", getLayoutAlgorithm());
/* 383 */           map.put("loadWithOverviewMode", this.loadWithOverviewMode);
/* 390 */           map.put("loadsImagesAutomatically", this.loadsImagesAutomatically);
/* 397 */           map.put("minimumLogicalFontSize", this.minimumLogicalFontSize);
/* 404 */           map.put("initialScale", this.initialScale);
/* 411 */           map.put("needInitialFocus", this.needInitialFocus);
/* 418 */           map.put("offscreenPreRaster", this.offscreenPreRaster);
/* 425 */           map.put("sansSerifFontFamily", this.sansSerifFontFamily);
/* 432 */           map.put("serifFontFamily", this.serifFontFamily);
/* 439 */           map.put("standardFontFamily", this.standardFontFamily);
/* 446 */           map.put("saveFormData", this.saveFormData);
/* 453 */           map.put("thirdPartyCookiesEnabled", this.thirdPartyCookiesEnabled);
/* 460 */           map.put("hardwareAcceleration", this.hardwareAcceleration);
/* 467 */           map.put("supportMultipleWindows", this.supportMultipleWindows);
/* 474 */           map.put("regexToCancelSubFramesLoading", this.regexToCancelSubFramesLoading);
/* 481 */           map.put("overScrollMode", this.overScrollMode);
/* 488 */           map.put("networkAvailable", this.networkAvailable);
/* 495 */           map.put("scrollBarStyle", this.scrollBarStyle);
/* 502 */           map.put("verticalScrollbarPosition", this.verticalScrollbarPosition);
/* 509 */           map.put("scrollBarDefaultDelayBeforeFade", this.scrollBarDefaultDelayBeforeFade);
/* 516 */           map.put("scrollbarFadingEnabled", this.scrollbarFadingEnabled);
/* 523 */           map.put("scrollBarFadeDuration", this.scrollBarFadeDuration);
/* 530 */           map.put("rendererPriorityPolicy", this.rendererPriorityPolicy);
/* 537 */           map.put("useShouldInterceptRequest", this.useShouldInterceptRequest);
/* 544 */           map.put("useOnRenderProcessGone", this.useOnRenderProcessGone);
/* 551 */           map.put("disableDefaultErrorPage", this.disableDefaultErrorPage);
/* 558 */           map.put("useHybridComposition", this.useHybridComposition);
/* 565 */           map.put("verticalScrollbarThumbColor", this.verticalScrollbarThumbColor);
/* 572 */           map.put("verticalScrollbarTrackColor", this.verticalScrollbarTrackColor);
/* 579 */           map.put("horizontalScrollbarThumbColor", this.horizontalScrollbarThumbColor);
/* 586 */           map.put("horizontalScrollbarTrackColor", this.horizontalScrollbarTrackColor);
/* 593 */           map.put("algorithmicDarkeningAllowed", this.algorithmicDarkeningAllowed);
/* 600 */           map.put("enterpriseAuthenticationAppLinkPolicyEnabled", this.enterpriseAuthenticationAppLinkPolicyEnabled);
/* 607 */           map.put("allowBackgroundAudioPlaying", this.allowBackgroundAudioPlaying);
/* 614 */           map.put("defaultVideoPoster", this.defaultVideoPoster);
/* 632 */           map.put("requestedWithHeaderOriginAllowList", this.requestedWithHeaderOriginAllowList != null ? new ArrayList(this.requestedWithHeaderOriginAllowList) : null);
/* 635 */           return map;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
/* 1814 */      public /* bridge */ /* synthetic */ ISettings<InAppWebViewInterface> parse(Map map) {
/* 1815 */          return parse2((Map<String, Object>) map);
                }
            }
