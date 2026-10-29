.class public Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings<",
        "Lcom/pichillilorenzo/flutter_inappwebview_android/webview/InAppWebViewInterface;",
        ">;"
    }
.end annotation


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "InAppWebViewSettings"


# instance fields
.field public algorithmicDarkeningAllowed:Ljava/lang/Boolean;

.field public allowBackgroundAudioPlaying:Ljava/lang/Boolean;

.field public allowContentAccess:Ljava/lang/Boolean;

.field public allowFileAccess:Ljava/lang/Boolean;

.field public allowFileAccessFromFileURLs:Ljava/lang/Boolean;

.field public allowUniversalAccessFromFileURLs:Ljava/lang/Boolean;

.field public appCachePath:Ljava/lang/String;

.field public applicationNameForUserAgent:Ljava/lang/String;

.field public blockNetworkImage:Ljava/lang/Boolean;

.field public blockNetworkLoads:Ljava/lang/Boolean;

.field public builtInZoomControls:Ljava/lang/Boolean;

.field public cacheEnabled:Ljava/lang/Boolean;

.field public cacheMode:Ljava/lang/Integer;

.field public clearCache:Ljava/lang/Boolean;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public clearSessionCache:Ljava/lang/Boolean;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public contentBlockers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;>;"
        }
    .end annotation
.end field

.field public cursiveFontFamily:Ljava/lang/String;

.field public databaseEnabled:Ljava/lang/Boolean;

.field public defaultFixedFontSize:Ljava/lang/Integer;

.field public defaultFontSize:Ljava/lang/Integer;

.field public defaultTextEncodingName:Ljava/lang/String;

.field public defaultVideoPoster:[B

.field public disableContextMenu:Ljava/lang/Boolean;

.field public disableDefaultErrorPage:Ljava/lang/Boolean;

.field public disableHorizontalScroll:Ljava/lang/Boolean;

.field public disableVerticalScroll:Ljava/lang/Boolean;

.field public disabledActionModeMenuItems:Ljava/lang/Integer;

.field public displayZoomControls:Ljava/lang/Boolean;

.field public domStorageEnabled:Ljava/lang/Boolean;

.field public enterpriseAuthenticationAppLinkPolicyEnabled:Ljava/lang/Boolean;

.field public fantasyFontFamily:Ljava/lang/String;

.field public fixedFontFamily:Ljava/lang/String;

.field public forceDark:Ljava/lang/Integer;

.field public forceDarkStrategy:Ljava/lang/Integer;

.field public geolocationEnabled:Ljava/lang/Boolean;

.field public hardwareAcceleration:Ljava/lang/Boolean;

.field public horizontalScrollBarEnabled:Ljava/lang/Boolean;

.field public horizontalScrollbarThumbColor:Ljava/lang/String;

.field public horizontalScrollbarTrackColor:Ljava/lang/String;

.field public incognito:Ljava/lang/Boolean;

.field public initialScale:Ljava/lang/Integer;

.field public interceptOnlyAsyncAjaxRequests:Ljava/lang/Boolean;

.field public javaScriptCanOpenWindowsAutomatically:Ljava/lang/Boolean;

.field public javaScriptEnabled:Ljava/lang/Boolean;

.field public layoutAlgorithm:Landroid/webkit/WebSettings$LayoutAlgorithm;

.field public loadWithOverviewMode:Ljava/lang/Boolean;

.field public loadsImagesAutomatically:Ljava/lang/Boolean;

.field public mediaPlaybackRequiresUserGesture:Ljava/lang/Boolean;

.field public minimumFontSize:Ljava/lang/Integer;

.field public minimumLogicalFontSize:Ljava/lang/Integer;

.field public mixedContentMode:Ljava/lang/Integer;

.field public needInitialFocus:Ljava/lang/Boolean;

.field public networkAvailable:Ljava/lang/Boolean;

.field public offscreenPreRaster:Ljava/lang/Boolean;

.field public overScrollMode:Ljava/lang/Integer;

.field public preferredContentMode:Ljava/lang/Integer;

.field public regexToCancelSubFramesLoading:Ljava/lang/String;

.field public rendererPriorityPolicy:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public requestedWithHeaderOriginAllowList:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public resourceCustomSchemes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public safeBrowsingEnabled:Ljava/lang/Boolean;

.field public sansSerifFontFamily:Ljava/lang/String;

.field public saveFormData:Ljava/lang/Boolean;

.field public scrollBarDefaultDelayBeforeFade:Ljava/lang/Integer;

.field public scrollBarFadeDuration:Ljava/lang/Integer;

.field public scrollBarStyle:Ljava/lang/Integer;

.field public scrollbarFadingEnabled:Ljava/lang/Boolean;

.field public serifFontFamily:Ljava/lang/String;

.field public standardFontFamily:Ljava/lang/String;

.field public supportMultipleWindows:Ljava/lang/Boolean;

.field public supportZoom:Ljava/lang/Boolean;

.field public textZoom:Ljava/lang/Integer;

.field public thirdPartyCookiesEnabled:Ljava/lang/Boolean;

.field public transparentBackground:Ljava/lang/Boolean;

.field public useHybridComposition:Ljava/lang/Boolean;

.field public useOnDownloadStart:Ljava/lang/Boolean;

.field public useOnLoadResource:Ljava/lang/Boolean;

.field public useOnRenderProcessGone:Ljava/lang/Boolean;

.field public useShouldInterceptAjaxRequest:Ljava/lang/Boolean;

.field public useShouldInterceptFetchRequest:Ljava/lang/Boolean;

.field public useShouldInterceptRequest:Ljava/lang/Boolean;

.field public useShouldOverrideUrlLoading:Ljava/lang/Boolean;

.field public useWideViewPort:Ljava/lang/Boolean;

.field public userAgent:Ljava/lang/String;

.field public verticalScrollBarEnabled:Ljava/lang/Boolean;

.field public verticalScrollbarPosition:Ljava/lang/Integer;

.field public verticalScrollbarThumbColor:Ljava/lang/String;

.field public verticalScrollbarTrackColor:Ljava/lang/String;

.field public webViewAssetLoader:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldOverrideUrlLoading:Ljava/lang/Boolean;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnLoadResource:Ljava/lang/Boolean;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnDownloadStart:Ljava/lang/Boolean;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->clearCache:Ljava/lang/Boolean;

    .line 13
    .line 14
    const-string v1, ""

    .line 15
    .line 16
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->userAgent:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->applicationNameForUserAgent:Ljava/lang/String;

    .line 19
    .line 20
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->javaScriptEnabled:Ljava/lang/Boolean;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->javaScriptCanOpenWindowsAutomatically:Ljava/lang/Boolean;

    .line 25
    .line 26
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->mediaPlaybackRequiresUserGesture:Ljava/lang/Boolean;

    .line 27
    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->minimumFontSize:Ljava/lang/Integer;

    .line 35
    .line 36
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollBarEnabled:Ljava/lang/Boolean;

    .line 37
    .line 38
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->horizontalScrollBarEnabled:Ljava/lang/Boolean;

    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->resourceCustomSchemes:Ljava/util/List;

    .line 46
    .line 47
    new-instance v3, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->contentBlockers:Ljava/util/List;

    .line 53
    .line 54
    sget-object v3, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PreferredContentModeOptionType;->RECOMMENDED:Lcom/pichillilorenzo/flutter_inappwebview_android/types/PreferredContentModeOptionType;

    .line 55
    .line 56
    invoke-virtual {v3}, Lcom/pichillilorenzo/flutter_inappwebview_android/types/PreferredContentModeOptionType;->toValue()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->preferredContentMode:Ljava/lang/Integer;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptAjaxRequest:Ljava/lang/Boolean;

    .line 67
    .line 68
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->interceptOnlyAsyncAjaxRequests:Ljava/lang/Boolean;

    .line 69
    .line 70
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptFetchRequest:Ljava/lang/Boolean;

    .line 71
    .line 72
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->incognito:Ljava/lang/Boolean;

    .line 73
    .line 74
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cacheEnabled:Ljava/lang/Boolean;

    .line 75
    .line 76
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->transparentBackground:Ljava/lang/Boolean;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableVerticalScroll:Ljava/lang/Boolean;

    .line 79
    .line 80
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableHorizontalScroll:Ljava/lang/Boolean;

    .line 81
    .line 82
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableContextMenu:Ljava/lang/Boolean;

    .line 83
    .line 84
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->supportZoom:Ljava/lang/Boolean;

    .line 85
    .line 86
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowFileAccessFromFileURLs:Ljava/lang/Boolean;

    .line 87
    .line 88
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowUniversalAccessFromFileURLs:Ljava/lang/Boolean;

    .line 89
    .line 90
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowBackgroundAudioPlaying:Ljava/lang/Boolean;

    .line 91
    .line 92
    const/16 v3, 0x64

    .line 93
    .line 94
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->textZoom:Ljava/lang/Integer;

    .line 99
    .line 100
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->clearSessionCache:Ljava/lang/Boolean;

    .line 101
    .line 102
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->builtInZoomControls:Ljava/lang/Boolean;

    .line 103
    .line 104
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->displayZoomControls:Ljava/lang/Boolean;

    .line 105
    .line 106
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->databaseEnabled:Ljava/lang/Boolean;

    .line 107
    .line 108
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->domStorageEnabled:Ljava/lang/Boolean;

    .line 109
    .line 110
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useWideViewPort:Ljava/lang/Boolean;

    .line 111
    .line 112
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->safeBrowsingEnabled:Ljava/lang/Boolean;

    .line 113
    .line 114
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowContentAccess:Ljava/lang/Boolean;

    .line 115
    .line 116
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowFileAccess:Ljava/lang/Boolean;

    .line 117
    .line 118
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->blockNetworkImage:Ljava/lang/Boolean;

    .line 119
    .line 120
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->blockNetworkLoads:Ljava/lang/Boolean;

    .line 121
    .line 122
    const/4 v3, -0x1

    .line 123
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cacheMode:Ljava/lang/Integer;

    .line 128
    .line 129
    const-string v3, "cursive"

    .line 130
    .line 131
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cursiveFontFamily:Ljava/lang/String;

    .line 132
    .line 133
    const/16 v3, 0x10

    .line 134
    .line 135
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultFixedFontSize:Ljava/lang/Integer;

    .line 140
    .line 141
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultFontSize:Ljava/lang/Integer;

    .line 142
    .line 143
    const-string v3, "UTF-8"

    .line 144
    .line 145
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultTextEncodingName:Ljava/lang/String;

    .line 146
    .line 147
    const-string v3, "fantasy"

    .line 148
    .line 149
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->fantasyFontFamily:Ljava/lang/String;

    .line 150
    .line 151
    const-string v3, "monospace"

    .line 152
    .line 153
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->fixedFontFamily:Ljava/lang/String;

    .line 154
    .line 155
    const/4 v3, 0x0

    .line 156
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->forceDark:Ljava/lang/Integer;

    .line 161
    .line 162
    const/4 v4, 0x2

    .line 163
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    iput-object v4, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->forceDarkStrategy:Ljava/lang/Integer;

    .line 168
    .line 169
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->geolocationEnabled:Ljava/lang/Boolean;

    .line 170
    .line 171
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->loadWithOverviewMode:Ljava/lang/Boolean;

    .line 172
    .line 173
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->loadsImagesAutomatically:Ljava/lang/Boolean;

    .line 174
    .line 175
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->minimumLogicalFontSize:Ljava/lang/Integer;

    .line 176
    .line 177
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->initialScale:Ljava/lang/Integer;

    .line 178
    .line 179
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->needInitialFocus:Ljava/lang/Boolean;

    .line 180
    .line 181
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->offscreenPreRaster:Ljava/lang/Boolean;

    .line 182
    .line 183
    const-string v2, "sans-serif"

    .line 184
    .line 185
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->sansSerifFontFamily:Ljava/lang/String;

    .line 186
    .line 187
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->serifFontFamily:Ljava/lang/String;

    .line 188
    .line 189
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->standardFontFamily:Ljava/lang/String;

    .line 190
    .line 191
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->saveFormData:Ljava/lang/Boolean;

    .line 192
    .line 193
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->thirdPartyCookiesEnabled:Ljava/lang/Boolean;

    .line 194
    .line 195
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->hardwareAcceleration:Ljava/lang/Boolean;

    .line 196
    .line 197
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->supportMultipleWindows:Ljava/lang/Boolean;

    .line 198
    .line 199
    const/4 v2, 0x1

    .line 200
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->overScrollMode:Ljava/lang/Integer;

    .line 205
    .line 206
    const/4 v2, 0x0

    .line 207
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->networkAvailable:Ljava/lang/Boolean;

    .line 208
    .line 209
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarStyle:Ljava/lang/Integer;

    .line 210
    .line 211
    iput-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollbarPosition:Ljava/lang/Integer;

    .line 212
    .line 213
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarDefaultDelayBeforeFade:Ljava/lang/Integer;

    .line 214
    .line 215
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollbarFadingEnabled:Ljava/lang/Boolean;

    .line 216
    .line 217
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarFadeDuration:Ljava/lang/Integer;

    .line 218
    .line 219
    iput-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->rendererPriorityPolicy:Ljava/util/Map;

    .line 220
    .line 221
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptRequest:Ljava/lang/Boolean;

    .line 222
    .line 223
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnRenderProcessGone:Ljava/lang/Boolean;

    .line 224
    .line 225
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableDefaultErrorPage:Ljava/lang/Boolean;

    .line 226
    .line 227
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useHybridComposition:Ljava/lang/Boolean;

    .line 228
    .line 229
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->algorithmicDarkeningAllowed:Ljava/lang/Boolean;

    .line 230
    .line 231
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->enterpriseAuthenticationAppLinkPolicyEnabled:Ljava/lang/Boolean;

    .line 232
    .line 233
    return-void
.end method

.method private getLayoutAlgorithm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->layoutAlgorithm:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 2
    .line 3
    if-eqz p0, :cond_3

    .line 4
    .line 5
    sget-object v0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings$1;->$SwitchMap$android$webkit$WebSettings$LayoutAlgorithm:[I

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    aget p0, v0, p0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    if-eq p0, v0, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    if-eq p0, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x3

    .line 20
    if-eq p0, v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p0, "NARROW_COLUMNS"

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    const-string p0, "TEXT_AUTOSIZING"

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    const-string p0, "NORMAL"

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method private setLayoutAlgorithm(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, -0x1

    .line 8
    sparse-switch v0, :sswitch_data_0

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :sswitch_0
    const-string v0, "TEXT_AUTOSIZING"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x2

    .line 22
    goto :goto_0

    .line 23
    :sswitch_1
    const-string v0, "NARROW_COLUMNS"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x1

    .line 33
    goto :goto_0

    .line 34
    :sswitch_2
    const-string v0, "NORMAL"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 v1, 0x0

    .line 44
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :pswitch_0
    sget-object p1, Landroid/webkit/WebSettings$LayoutAlgorithm;->NARROW_COLUMNS:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->layoutAlgorithm:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 51
    .line 52
    :pswitch_1
    sget-object p1, Landroid/webkit/WebSettings$LayoutAlgorithm;->NORMAL:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->layoutAlgorithm:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 55
    .line 56
    :pswitch_2
    sget-object p1, Landroid/webkit/WebSettings$LayoutAlgorithm;->TEXT_AUTOSIZING:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 57
    .line 58
    iput-object p1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->layoutAlgorithm:Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 59
    .line 60
    :cond_3
    :goto_1
    return-void

    .line 61
    :sswitch_data_0
    .sparse-switch
        -0x76664f19 -> :sswitch_2
        0x3ee2bbd9 -> :sswitch_1
        0x5d17953f -> :sswitch_0
    .end sparse-switch

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public getRealSettings(Lcom/pichillilorenzo/flutter_inappwebview_android/webview/InAppWebViewInterface;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/webview/InAppWebViewInterface;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->toMap()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of v0, p1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView;

    .line 6
    .line 7
    if-eqz v0, :cond_12

    .line 8
    .line 9
    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "userAgent"

    .line 20
    .line 21
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getJavaScriptEnabled()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const-string v2, "javaScriptEnabled"

    .line 33
    .line 34
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getJavaScriptCanOpenWindowsAutomatically()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "javaScriptCanOpenWindowsAutomatically"

    .line 46
    .line 47
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getMediaPlaybackRequiresUserGesture()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    const-string v2, "mediaPlaybackRequiresUserGesture"

    .line 59
    .line 60
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getMinimumFontSize()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const-string v2, "minimumFontSize"

    .line 72
    .line 73
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->isVerticalScrollBarEnabled()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "verticalScrollBarEnabled"

    .line 85
    .line 86
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/view/View;->isHorizontalScrollBarEnabled()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v2, "horizontalScrollBarEnabled"

    .line 98
    .line 99
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getTextZoom()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    const-string v2, "textZoom"

    .line 111
    .line 112
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getBuiltInZoomControls()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const-string v2, "builtInZoomControls"

    .line 124
    .line 125
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->supportZoom()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const-string v2, "supportZoom"

    .line 137
    .line 138
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getDisplayZoomControls()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const-string v2, "displayZoomControls"

    .line 150
    .line 151
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getDatabaseEnabled()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    const-string v2, "databaseEnabled"

    .line 163
    .line 164
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getDomStorageEnabled()Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    const-string v2, "domStorageEnabled"

    .line 176
    .line 177
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUseWideViewPort()Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    const-string v2, "useWideViewPort"

    .line 189
    .line 190
    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    const-string v1, "SAFE_BROWSING_ENABLE"

    .line 194
    .line 195
    invoke-static {v1}, Lxe2;->x(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    const/16 v2, 0x1a

    .line 200
    .line 201
    const-string v3, "safeBrowsingEnabled"

    .line 202
    .line 203
    if-eqz v1, :cond_2

    .line 204
    .line 205
    sget-object v1, Lb73;->b:Lk9;

    .line 206
    .line 207
    invoke-virtual {v1}, Lk9;->a()Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eqz v4, :cond_0

    .line 212
    .line 213
    invoke-static {v0}, Lq9;->b(Landroid/webkit/WebSettings;)Z

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    goto :goto_0

    .line 218
    :cond_0
    invoke-virtual {v1}, Ll9;->b()Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_1

    .line 223
    .line 224
    invoke-static {v0}, Lp63;->a(Landroid/webkit/WebSettings;)Ler0;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    iget-object v1, v1, Ler0;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v1, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 231
    .line 232
    invoke-interface {v1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->getSafeBrowsingEnabled()Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    invoke-interface {p0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_1
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    throw p0

    .line 249
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 250
    .line 251
    if-lt v1, v2, :cond_3

    .line 252
    .line 253
    invoke-static {v0}, Lwt0;->A(Landroid/webkit/WebSettings;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-interface {p0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    :cond_3
    :goto_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 265
    .line 266
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getMixedContentMode()I

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const-string v4, "mixedContentMode"

    .line 275
    .line 276
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getAllowContentAccess()Z

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    const-string v4, "allowContentAccess"

    .line 288
    .line 289
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getAllowFileAccess()Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    const-string v4, "allowFileAccess"

    .line 301
    .line 302
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getAllowFileAccessFromFileURLs()Z

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    const-string v4, "allowFileAccessFromFileURLs"

    .line 314
    .line 315
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getAllowUniversalAccessFromFileURLs()Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    const-string v4, "allowUniversalAccessFromFileURLs"

    .line 327
    .line 328
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getBlockNetworkImage()Z

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    const-string v4, "blockNetworkImage"

    .line 340
    .line 341
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getBlockNetworkLoads()Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    const-string v4, "blockNetworkLoads"

    .line 353
    .line 354
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getCacheMode()I

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    const-string v4, "cacheMode"

    .line 366
    .line 367
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getCursiveFontFamily()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    const-string v4, "cursiveFontFamily"

    .line 375
    .line 376
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getDefaultFixedFontSize()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    const-string v4, "defaultFixedFontSize"

    .line 388
    .line 389
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getDefaultFontSize()I

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    const-string v4, "defaultFontSize"

    .line 401
    .line 402
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getDefaultTextEncodingName()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    const-string v4, "defaultTextEncodingName"

    .line 410
    .line 411
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    const-string v3, "DISABLED_ACTION_MODE_MENU_ITEMS"

    .line 415
    .line 416
    invoke-static {v3}, Lxe2;->x(Ljava/lang/String;)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    const-string v4, "disabledActionModeMenuItems"

    .line 421
    .line 422
    if-eqz v3, :cond_4

    .line 423
    .line 424
    sget-object v3, Lb73;->c:Lk9;

    .line 425
    .line 426
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 427
    .line 428
    .line 429
    invoke-static {v0}, Lp9;->f(Landroid/webkit/WebSettings;)I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    :cond_4
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getDisabledActionModeMenuItems()I

    .line 441
    .line 442
    .line 443
    move-result v3

    .line 444
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getFantasyFontFamily()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    const-string v4, "fantasyFontFamily"

    .line 456
    .line 457
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getFixedFontFamily()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    const-string v4, "fixedFontFamily"

    .line 465
    .line 466
    invoke-interface {p0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    const-string v3, "FORCE_DARK"

    .line 470
    .line 471
    invoke-static {v3}, Lxe2;->x(Ljava/lang/String;)Z

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    const/16 v4, 0x1d

    .line 476
    .line 477
    const-string v5, "forceDark"

    .line 478
    .line 479
    if-eqz v3, :cond_7

    .line 480
    .line 481
    sget-object v3, Lb73;->G:Lk9;

    .line 482
    .line 483
    invoke-virtual {v3}, Lk9;->a()Z

    .line 484
    .line 485
    .line 486
    move-result v6

    .line 487
    if-eqz v6, :cond_5

    .line 488
    .line 489
    invoke-static {v0}, Lu9;->a(Landroid/webkit/WebSettings;)I

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    goto :goto_2

    .line 494
    :cond_5
    invoke-virtual {v3}, Ll9;->b()Z

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    if-eqz v3, :cond_6

    .line 499
    .line 500
    invoke-static {v0}, Lp63;->a(Landroid/webkit/WebSettings;)Ler0;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    iget-object v3, v3, Ler0;->b:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v3, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 507
    .line 508
    invoke-interface {v3}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->getForceDark()I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    goto :goto_3

    .line 520
    :cond_6
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    throw p0

    .line 525
    :cond_7
    if-lt v1, v4, :cond_8

    .line 526
    .line 527
    invoke-static {v0}, Lrw0;->b(Landroid/webkit/WebSettings;)I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    :cond_8
    :goto_3
    const-string v3, "FORCE_DARK_STRATEGY"

    .line 539
    .line 540
    invoke-static {v3}, Lxe2;->x(Ljava/lang/String;)Z

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    if-eqz v3, :cond_a

    .line 545
    .line 546
    sget-object v3, Lb73;->H:Lk9;

    .line 547
    .line 548
    invoke-virtual {v3}, Ll9;->b()Z

    .line 549
    .line 550
    .line 551
    move-result v3

    .line 552
    if-eqz v3, :cond_9

    .line 553
    .line 554
    invoke-static {v0}, Lp63;->a(Landroid/webkit/WebSettings;)Ler0;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    iget-object v3, v3, Ler0;->b:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v3, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 561
    .line 562
    invoke-interface {v3}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->getForceDark()I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 567
    .line 568
    .line 569
    move-result-object v3

    .line 570
    const-string v5, "forceDarkStrategy"

    .line 571
    .line 572
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    goto :goto_4

    .line 576
    :cond_9
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 577
    .line 578
    .line 579
    move-result-object p0

    .line 580
    throw p0

    .line 581
    :cond_a
    :goto_4
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getLayoutAlgorithm()Landroid/webkit/WebSettings$LayoutAlgorithm;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    const-string v5, "layoutAlgorithm"

    .line 590
    .line 591
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getLoadWithOverviewMode()Z

    .line 595
    .line 596
    .line 597
    move-result v3

    .line 598
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 599
    .line 600
    .line 601
    move-result-object v3

    .line 602
    const-string v5, "loadWithOverviewMode"

    .line 603
    .line 604
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getLoadsImagesAutomatically()Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 612
    .line 613
    .line 614
    move-result-object v3

    .line 615
    const-string v5, "loadsImagesAutomatically"

    .line 616
    .line 617
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getMinimumLogicalFontSize()I

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    const-string v5, "minimumLogicalFontSize"

    .line 629
    .line 630
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    const-string v3, "OFF_SCREEN_PRERASTER"

    .line 634
    .line 635
    invoke-static {v3}, Lxe2;->x(Ljava/lang/String;)Z

    .line 636
    .line 637
    .line 638
    move-result v3

    .line 639
    const-string v5, "offscreenPreRaster"

    .line 640
    .line 641
    if-eqz v3, :cond_b

    .line 642
    .line 643
    sget-object v3, Lb73;->a:Lk9;

    .line 644
    .line 645
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    invoke-static {v0}, Lo9;->g(Landroid/webkit/WebSettings;)Z

    .line 649
    .line 650
    .line 651
    move-result v3

    .line 652
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 653
    .line 654
    .line 655
    move-result-object v3

    .line 656
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    goto :goto_5

    .line 660
    :cond_b
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getOffscreenPreRaster()Z

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    :goto_5
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getSansSerifFontFamily()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v3

    .line 675
    const-string v5, "sansSerifFontFamily"

    .line 676
    .line 677
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getSerifFontFamily()Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    const-string v5, "serifFontFamily"

    .line 685
    .line 686
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getStandardFontFamily()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v3

    .line 693
    const-string v5, "standardFontFamily"

    .line 694
    .line 695
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->getSaveFormData()Z

    .line 699
    .line 700
    .line 701
    move-result v3

    .line 702
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    const-string v5, "saveFormData"

    .line 707
    .line 708
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    invoke-virtual {v0}, Landroid/webkit/WebSettings;->supportMultipleWindows()Z

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    const-string v5, "supportMultipleWindows"

    .line 720
    .line 721
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    invoke-virtual {p1}, Landroid/view/View;->getOverScrollMode()I

    .line 725
    .line 726
    .line 727
    move-result v3

    .line 728
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    const-string v5, "overScrollMode"

    .line 733
    .line 734
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    invoke-virtual {p1}, Landroid/view/View;->getScrollBarStyle()I

    .line 738
    .line 739
    .line 740
    move-result v3

    .line 741
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    const-string v5, "scrollBarStyle"

    .line 746
    .line 747
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    invoke-virtual {p1}, Landroid/view/View;->getVerticalScrollbarPosition()I

    .line 751
    .line 752
    .line 753
    move-result v3

    .line 754
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    const-string v5, "verticalScrollbarPosition"

    .line 759
    .line 760
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    invoke-virtual {p1}, Landroid/view/View;->getScrollBarDefaultDelayBeforeFade()I

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    const-string v5, "scrollBarDefaultDelayBeforeFade"

    .line 772
    .line 773
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 774
    .line 775
    .line 776
    invoke-virtual {p1}, Landroid/view/View;->isScrollbarFadingEnabled()Z

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    const-string v5, "scrollbarFadingEnabled"

    .line 785
    .line 786
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    invoke-virtual {p1}, Landroid/view/View;->getScrollBarFadeDuration()I

    .line 790
    .line 791
    .line 792
    move-result v3

    .line 793
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    const-string v5, "scrollBarFadeDuration"

    .line 798
    .line 799
    invoke-interface {p0, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    if-lt v1, v2, :cond_c

    .line 803
    .line 804
    new-instance v2, Ljava/util/HashMap;

    .line 805
    .line 806
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 807
    .line 808
    .line 809
    invoke-static {p1}, Lwt0;->a(Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView;)I

    .line 810
    .line 811
    .line 812
    move-result v3

    .line 813
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 814
    .line 815
    .line 816
    move-result-object v3

    .line 817
    const-string v5, "rendererRequestedPriority"

    .line 818
    .line 819
    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    invoke-static {p1}, Lwt0;->B(Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebView;)Z

    .line 823
    .line 824
    .line 825
    move-result p1

    .line 826
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 827
    .line 828
    .line 829
    move-result-object p1

    .line 830
    const-string v3, "waivedWhenNotVisible"

    .line 831
    .line 832
    invoke-virtual {v2, v3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    const-string p1, "rendererPriorityPolicy"

    .line 836
    .line 837
    invoke-interface {p0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    :cond_c
    const-string p1, "ALGORITHMIC_DARKENING"

    .line 841
    .line 842
    invoke-static {p1}, Lxe2;->x(Ljava/lang/String;)Z

    .line 843
    .line 844
    .line 845
    move-result p1

    .line 846
    if-eqz p1, :cond_e

    .line 847
    .line 848
    if-lt v1, v4, :cond_e

    .line 849
    .line 850
    sget-object p1, Lb73;->D:Lz63;

    .line 851
    .line 852
    invoke-virtual {p1}, Lz63;->b()Z

    .line 853
    .line 854
    .line 855
    move-result p1

    .line 856
    if-eqz p1, :cond_d

    .line 857
    .line 858
    invoke-static {v0}, Lp63;->a(Landroid/webkit/WebSettings;)Ler0;

    .line 859
    .line 860
    .line 861
    move-result-object p1

    .line 862
    iget-object p1, p1, Ler0;->b:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast p1, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 865
    .line 866
    invoke-interface {p1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->isAlgorithmicDarkeningAllowed()Z

    .line 867
    .line 868
    .line 869
    move-result p1

    .line 870
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 871
    .line 872
    .line 873
    move-result-object p1

    .line 874
    const-string v1, "algorithmicDarkeningAllowed"

    .line 875
    .line 876
    invoke-interface {p0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    goto :goto_6

    .line 880
    :cond_d
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 881
    .line 882
    .line 883
    move-result-object p0

    .line 884
    throw p0

    .line 885
    :cond_e
    :goto_6
    const-string p1, "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"

    .line 886
    .line 887
    invoke-static {p1}, Lxe2;->x(Ljava/lang/String;)Z

    .line 888
    .line 889
    .line 890
    move-result p1

    .line 891
    if-eqz p1, :cond_10

    .line 892
    .line 893
    sget-object p1, Lb73;->M:Lk9;

    .line 894
    .line 895
    invoke-virtual {p1}, Ll9;->b()Z

    .line 896
    .line 897
    .line 898
    move-result p1

    .line 899
    if-eqz p1, :cond_f

    .line 900
    .line 901
    invoke-static {v0}, Lp63;->a(Landroid/webkit/WebSettings;)Ler0;

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    iget-object p1, p1, Ler0;->b:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast p1, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 908
    .line 909
    invoke-interface {p1}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->getEnterpriseAuthenticationAppLinkPolicyEnabled()Z

    .line 910
    .line 911
    .line 912
    move-result p1

    .line 913
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 914
    .line 915
    .line 916
    move-result-object p1

    .line 917
    const-string v1, "enterpriseAuthenticationAppLinkPolicyEnabled"

    .line 918
    .line 919
    invoke-interface {p0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 920
    .line 921
    .line 922
    goto :goto_7

    .line 923
    :cond_f
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 924
    .line 925
    .line 926
    move-result-object p0

    .line 927
    throw p0

    .line 928
    :cond_10
    :goto_7
    const-string p1, "REQUESTED_WITH_HEADER_ALLOW_LIST"

    .line 929
    .line 930
    invoke-static {p1}, Lxe2;->x(Ljava/lang/String;)Z

    .line 931
    .line 932
    .line 933
    move-result p1

    .line 934
    if-eqz p1, :cond_12

    .line 935
    .line 936
    new-instance p1, Ljava/util/ArrayList;

    .line 937
    .line 938
    sget-object v1, Lb73;->O:Lk9;

    .line 939
    .line 940
    invoke-virtual {v1}, Ll9;->b()Z

    .line 941
    .line 942
    .line 943
    move-result v1

    .line 944
    if-eqz v1, :cond_11

    .line 945
    .line 946
    invoke-static {v0}, Lp63;->a(Landroid/webkit/WebSettings;)Ler0;

    .line 947
    .line 948
    .line 949
    move-result-object v0

    .line 950
    iget-object v0, v0, Ler0;->b:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v0, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;

    .line 953
    .line 954
    invoke-interface {v0}, Lorg/chromium/support_lib_boundary/WebSettingsBoundaryInterface;->getRequestedWithHeaderOriginAllowList()Ljava/util/Set;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 959
    .line 960
    .line 961
    const-string v0, "requestedWithHeaderOriginAllowList"

    .line 962
    .line 963
    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 964
    .line 965
    .line 966
    return-object p0

    .line 967
    :cond_11
    invoke-static {}, Lb73;->a()Ljava/lang/UnsupportedOperationException;

    .line 968
    .line 969
    .line 970
    move-result-object p0

    .line 971
    throw p0

    .line 972
    :cond_12
    return-object p0
.end method

.method public bridge synthetic getRealSettings(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 973
    check-cast p1, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/InAppWebViewInterface;

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->getRealSettings(Lcom/pichillilorenzo/flutter_inappwebview_android/webview/InAppWebViewInterface;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings;
    .locals 0

    .line 1815
    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;

    move-result-object p0

    return-object p0
.end method

.method public parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_5a

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    const/4 v3, -0x1

    .line 42
    sparse-switch v2, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    goto/16 :goto_1

    .line 46
    .line 47
    :sswitch_0
    const-string v2, "algorithmicDarkeningAllowed"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    goto/16 :goto_1

    .line 56
    .line 57
    :cond_1
    const/16 v3, 0x58

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :sswitch_1
    const-string v2, "defaultVideoPoster"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-nez v1, :cond_2

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_2
    const/16 v3, 0x57

    .line 72
    .line 73
    goto/16 :goto_1

    .line 74
    .line 75
    :sswitch_2
    const-string v2, "clearSessionCache"

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_3

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :cond_3
    const/16 v3, 0x56

    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :sswitch_3
    const-string v2, "verticalScrollBarEnabled"

    .line 90
    .line 91
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    goto/16 :goto_1

    .line 98
    .line 99
    :cond_4
    const/16 v3, 0x55

    .line 100
    .line 101
    goto/16 :goto_1

    .line 102
    .line 103
    :sswitch_4
    const-string v2, "minimumLogicalFontSize"

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_5

    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :cond_5
    const/16 v3, 0x54

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :sswitch_5
    const-string v2, "thirdPartyCookiesEnabled"

    .line 118
    .line 119
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    if-nez v1, :cond_6

    .line 124
    .line 125
    goto/16 :goto_1

    .line 126
    .line 127
    :cond_6
    const/16 v3, 0x53

    .line 128
    .line 129
    goto/16 :goto_1

    .line 130
    .line 131
    :sswitch_6
    const-string v2, "defaultFixedFontSize"

    .line 132
    .line 133
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_7

    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :cond_7
    const/16 v3, 0x52

    .line 142
    .line 143
    goto/16 :goto_1

    .line 144
    .line 145
    :sswitch_7
    const-string v2, "supportMultipleWindows"

    .line 146
    .line 147
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-nez v1, :cond_8

    .line 152
    .line 153
    goto/16 :goto_1

    .line 154
    .line 155
    :cond_8
    const/16 v3, 0x51

    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    :sswitch_8
    const-string v2, "contentBlockers"

    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-nez v1, :cond_9

    .line 166
    .line 167
    goto/16 :goto_1

    .line 168
    .line 169
    :cond_9
    const/16 v3, 0x50

    .line 170
    .line 171
    goto/16 :goto_1

    .line 172
    .line 173
    :sswitch_9
    const-string v2, "disableDefaultErrorPage"

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-nez v1, :cond_a

    .line 180
    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    :cond_a
    const/16 v3, 0x4f

    .line 184
    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :sswitch_a
    const-string v2, "forceDark"

    .line 188
    .line 189
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_b

    .line 194
    .line 195
    goto/16 :goto_1

    .line 196
    .line 197
    :cond_b
    const/16 v3, 0x4e

    .line 198
    .line 199
    goto/16 :goto_1

    .line 200
    .line 201
    :sswitch_b
    const-string v2, "verticalScrollbarThumbColor"

    .line 202
    .line 203
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-nez v1, :cond_c

    .line 208
    .line 209
    goto/16 :goto_1

    .line 210
    .line 211
    :cond_c
    const/16 v3, 0x4d

    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :sswitch_c
    const-string v2, "serifFontFamily"

    .line 216
    .line 217
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-nez v1, :cond_d

    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :cond_d
    const/16 v3, 0x4c

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :sswitch_d
    const-string v2, "safeBrowsingEnabled"

    .line 230
    .line 231
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-nez v1, :cond_e

    .line 236
    .line 237
    goto/16 :goto_1

    .line 238
    .line 239
    :cond_e
    const/16 v3, 0x4b

    .line 240
    .line 241
    goto/16 :goto_1

    .line 242
    .line 243
    :sswitch_e
    const-string v2, "loadWithOverviewMode"

    .line 244
    .line 245
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v1

    .line 249
    if-nez v1, :cond_f

    .line 250
    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :cond_f
    const/16 v3, 0x4a

    .line 254
    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :sswitch_f
    const-string v2, "geolocationEnabled"

    .line 258
    .line 259
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v1

    .line 263
    if-nez v1, :cond_10

    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_10
    const/16 v3, 0x49

    .line 268
    .line 269
    goto/16 :goto_1

    .line 270
    .line 271
    :sswitch_10
    const-string v2, "displayZoomControls"

    .line 272
    .line 273
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    if-nez v1, :cond_11

    .line 278
    .line 279
    goto/16 :goto_1

    .line 280
    .line 281
    :cond_11
    const/16 v3, 0x48

    .line 282
    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :sswitch_11
    const-string v2, "standardFontFamily"

    .line 286
    .line 287
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-nez v1, :cond_12

    .line 292
    .line 293
    goto/16 :goto_1

    .line 294
    .line 295
    :cond_12
    const/16 v3, 0x47

    .line 296
    .line 297
    goto/16 :goto_1

    .line 298
    .line 299
    :sswitch_12
    const-string v2, "horizontalScrollbarThumbColor"

    .line 300
    .line 301
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-nez v1, :cond_13

    .line 306
    .line 307
    goto/16 :goto_1

    .line 308
    .line 309
    :cond_13
    const/16 v3, 0x46

    .line 310
    .line 311
    goto/16 :goto_1

    .line 312
    .line 313
    :sswitch_13
    const-string v2, "appCachePath"

    .line 314
    .line 315
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    if-nez v1, :cond_14

    .line 320
    .line 321
    goto/16 :goto_1

    .line 322
    .line 323
    :cond_14
    const/16 v3, 0x45

    .line 324
    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :sswitch_14
    const-string v2, "allowFileAccess"

    .line 328
    .line 329
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    if-nez v1, :cond_15

    .line 334
    .line 335
    goto/16 :goto_1

    .line 336
    .line 337
    :cond_15
    const/16 v3, 0x44

    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :sswitch_15
    const-string v2, "scrollBarFadeDuration"

    .line 342
    .line 343
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-nez v1, :cond_16

    .line 348
    .line 349
    goto/16 :goto_1

    .line 350
    .line 351
    :cond_16
    const/16 v3, 0x43

    .line 352
    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :sswitch_16
    const-string v2, "mixedContentMode"

    .line 356
    .line 357
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v1

    .line 361
    if-nez v1, :cond_17

    .line 362
    .line 363
    goto/16 :goto_1

    .line 364
    .line 365
    :cond_17
    const/16 v3, 0x42

    .line 366
    .line 367
    goto/16 :goto_1

    .line 368
    .line 369
    :sswitch_17
    const-string v2, "applicationNameForUserAgent"

    .line 370
    .line 371
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v1

    .line 375
    if-nez v1, :cond_18

    .line 376
    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    :cond_18
    const/16 v3, 0x41

    .line 380
    .line 381
    goto/16 :goto_1

    .line 382
    .line 383
    :sswitch_18
    const-string v2, "useHybridComposition"

    .line 384
    .line 385
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-nez v1, :cond_19

    .line 390
    .line 391
    goto/16 :goto_1

    .line 392
    .line 393
    :cond_19
    const/16 v3, 0x40

    .line 394
    .line 395
    goto/16 :goto_1

    .line 396
    .line 397
    :sswitch_19
    const-string v2, "requestedWithHeaderOriginAllowList"

    .line 398
    .line 399
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    if-nez v1, :cond_1a

    .line 404
    .line 405
    goto/16 :goto_1

    .line 406
    .line 407
    :cond_1a
    const/16 v3, 0x3f

    .line 408
    .line 409
    goto/16 :goto_1

    .line 410
    .line 411
    :sswitch_1a
    const-string v2, "saveFormData"

    .line 412
    .line 413
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v1

    .line 417
    if-nez v1, :cond_1b

    .line 418
    .line 419
    goto/16 :goto_1

    .line 420
    .line 421
    :cond_1b
    const/16 v3, 0x3e

    .line 422
    .line 423
    goto/16 :goto_1

    .line 424
    .line 425
    :sswitch_1b
    const-string v2, "cacheEnabled"

    .line 426
    .line 427
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-nez v1, :cond_1c

    .line 432
    .line 433
    goto/16 :goto_1

    .line 434
    .line 435
    :cond_1c
    const/16 v3, 0x3d

    .line 436
    .line 437
    goto/16 :goto_1

    .line 438
    .line 439
    :sswitch_1c
    const-string v2, "useOnLoadResource"

    .line 440
    .line 441
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v1

    .line 445
    if-nez v1, :cond_1d

    .line 446
    .line 447
    goto/16 :goto_1

    .line 448
    .line 449
    :cond_1d
    const/16 v3, 0x3c

    .line 450
    .line 451
    goto/16 :goto_1

    .line 452
    .line 453
    :sswitch_1d
    const-string v2, "useOnRenderProcessGone"

    .line 454
    .line 455
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-nez v1, :cond_1e

    .line 460
    .line 461
    goto/16 :goto_1

    .line 462
    .line 463
    :cond_1e
    const/16 v3, 0x3b

    .line 464
    .line 465
    goto/16 :goto_1

    .line 466
    .line 467
    :sswitch_1e
    const-string v2, "userAgent"

    .line 468
    .line 469
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    if-nez v1, :cond_1f

    .line 474
    .line 475
    goto/16 :goto_1

    .line 476
    .line 477
    :cond_1f
    const/16 v3, 0x3a

    .line 478
    .line 479
    goto/16 :goto_1

    .line 480
    .line 481
    :sswitch_1f
    const-string v2, "blockNetworkLoads"

    .line 482
    .line 483
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 484
    .line 485
    .line 486
    move-result v1

    .line 487
    if-nez v1, :cond_20

    .line 488
    .line 489
    goto/16 :goto_1

    .line 490
    .line 491
    :cond_20
    const/16 v3, 0x39

    .line 492
    .line 493
    goto/16 :goto_1

    .line 494
    .line 495
    :sswitch_20
    const-string v2, "blockNetworkImage"

    .line 496
    .line 497
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-nez v1, :cond_21

    .line 502
    .line 503
    goto/16 :goto_1

    .line 504
    .line 505
    :cond_21
    const/16 v3, 0x38

    .line 506
    .line 507
    goto/16 :goto_1

    .line 508
    .line 509
    :sswitch_21
    const-string v2, "mediaPlaybackRequiresUserGesture"

    .line 510
    .line 511
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    if-nez v1, :cond_22

    .line 516
    .line 517
    goto/16 :goto_1

    .line 518
    .line 519
    :cond_22
    const/16 v3, 0x37

    .line 520
    .line 521
    goto/16 :goto_1

    .line 522
    .line 523
    :sswitch_22
    const-string v2, "cursiveFontFamily"

    .line 524
    .line 525
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v1

    .line 529
    if-nez v1, :cond_23

    .line 530
    .line 531
    goto/16 :goto_1

    .line 532
    .line 533
    :cond_23
    const/16 v3, 0x36

    .line 534
    .line 535
    goto/16 :goto_1

    .line 536
    .line 537
    :sswitch_23
    const-string v2, "forceDarkStrategy"

    .line 538
    .line 539
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v1

    .line 543
    if-nez v1, :cond_24

    .line 544
    .line 545
    goto/16 :goto_1

    .line 546
    .line 547
    :cond_24
    const/16 v3, 0x35

    .line 548
    .line 549
    goto/16 :goto_1

    .line 550
    .line 551
    :sswitch_24
    const-string v2, "useOnDownloadStart"

    .line 552
    .line 553
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    if-nez v1, :cond_25

    .line 558
    .line 559
    goto/16 :goto_1

    .line 560
    .line 561
    :cond_25
    const/16 v3, 0x34

    .line 562
    .line 563
    goto/16 :goto_1

    .line 564
    .line 565
    :sswitch_25
    const-string v2, "verticalScrollbarTrackColor"

    .line 566
    .line 567
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    if-nez v1, :cond_26

    .line 572
    .line 573
    goto/16 :goto_1

    .line 574
    .line 575
    :cond_26
    const/16 v3, 0x33

    .line 576
    .line 577
    goto/16 :goto_1

    .line 578
    .line 579
    :sswitch_26
    const-string v2, "regexToCancelSubFramesLoading"

    .line 580
    .line 581
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-nez v1, :cond_27

    .line 586
    .line 587
    goto/16 :goto_1

    .line 588
    .line 589
    :cond_27
    const/16 v3, 0x32

    .line 590
    .line 591
    goto/16 :goto_1

    .line 592
    .line 593
    :sswitch_27
    const-string v2, "sansSerifFontFamily"

    .line 594
    .line 595
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    if-nez v1, :cond_28

    .line 600
    .line 601
    goto/16 :goto_1

    .line 602
    .line 603
    :cond_28
    const/16 v3, 0x31

    .line 604
    .line 605
    goto/16 :goto_1

    .line 606
    .line 607
    :sswitch_28
    const-string v2, "rendererPriorityPolicy"

    .line 608
    .line 609
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    move-result v1

    .line 613
    if-nez v1, :cond_29

    .line 614
    .line 615
    goto/16 :goto_1

    .line 616
    .line 617
    :cond_29
    const/16 v3, 0x30

    .line 618
    .line 619
    goto/16 :goto_1

    .line 620
    .line 621
    :sswitch_29
    const-string v2, "fantasyFontFamily"

    .line 622
    .line 623
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    if-nez v1, :cond_2a

    .line 628
    .line 629
    goto/16 :goto_1

    .line 630
    .line 631
    :cond_2a
    const/16 v3, 0x2f

    .line 632
    .line 633
    goto/16 :goto_1

    .line 634
    .line 635
    :sswitch_2a
    const-string v2, "offscreenPreRaster"

    .line 636
    .line 637
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    if-nez v1, :cond_2b

    .line 642
    .line 643
    goto/16 :goto_1

    .line 644
    .line 645
    :cond_2b
    const/16 v3, 0x2e

    .line 646
    .line 647
    goto/16 :goto_1

    .line 648
    .line 649
    :sswitch_2b
    const-string v2, "horizontalScrollbarTrackColor"

    .line 650
    .line 651
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    if-nez v1, :cond_2c

    .line 656
    .line 657
    goto/16 :goto_1

    .line 658
    .line 659
    :cond_2c
    const/16 v3, 0x2d

    .line 660
    .line 661
    goto/16 :goto_1

    .line 662
    .line 663
    :sswitch_2c
    const-string v2, "javaScriptCanOpenWindowsAutomatically"

    .line 664
    .line 665
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    if-nez v1, :cond_2d

    .line 670
    .line 671
    goto/16 :goto_1

    .line 672
    .line 673
    :cond_2d
    const/16 v3, 0x2c

    .line 674
    .line 675
    goto/16 :goto_1

    .line 676
    .line 677
    :sswitch_2d
    const-string v2, "disableVerticalScroll"

    .line 678
    .line 679
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    if-nez v1, :cond_2e

    .line 684
    .line 685
    goto/16 :goto_1

    .line 686
    .line 687
    :cond_2e
    const/16 v3, 0x2b

    .line 688
    .line 689
    goto/16 :goto_1

    .line 690
    .line 691
    :sswitch_2e
    const-string v2, "verticalScrollbarPosition"

    .line 692
    .line 693
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    move-result v1

    .line 697
    if-nez v1, :cond_2f

    .line 698
    .line 699
    goto/16 :goto_1

    .line 700
    .line 701
    :cond_2f
    const/16 v3, 0x2a

    .line 702
    .line 703
    goto/16 :goto_1

    .line 704
    .line 705
    :sswitch_2f
    const-string v2, "initialScale"

    .line 706
    .line 707
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v1

    .line 711
    if-nez v1, :cond_30

    .line 712
    .line 713
    goto/16 :goto_1

    .line 714
    .line 715
    :cond_30
    const/16 v3, 0x29

    .line 716
    .line 717
    goto/16 :goto_1

    .line 718
    .line 719
    :sswitch_30
    const-string v2, "scrollBarStyle"

    .line 720
    .line 721
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    move-result v1

    .line 725
    if-nez v1, :cond_31

    .line 726
    .line 727
    goto/16 :goto_1

    .line 728
    .line 729
    :cond_31
    const/16 v3, 0x28

    .line 730
    .line 731
    goto/16 :goto_1

    .line 732
    .line 733
    :sswitch_31
    const-string v2, "horizontalScrollBarEnabled"

    .line 734
    .line 735
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    if-nez v1, :cond_32

    .line 740
    .line 741
    goto/16 :goto_1

    .line 742
    .line 743
    :cond_32
    const/16 v3, 0x27

    .line 744
    .line 745
    goto/16 :goto_1

    .line 746
    .line 747
    :sswitch_32
    const-string v2, "cacheMode"

    .line 748
    .line 749
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v1

    .line 753
    if-nez v1, :cond_33

    .line 754
    .line 755
    goto/16 :goto_1

    .line 756
    .line 757
    :cond_33
    const/16 v3, 0x26

    .line 758
    .line 759
    goto/16 :goto_1

    .line 760
    .line 761
    :sswitch_33
    const-string v2, "useShouldInterceptRequest"

    .line 762
    .line 763
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 764
    .line 765
    .line 766
    move-result v1

    .line 767
    if-nez v1, :cond_34

    .line 768
    .line 769
    goto/16 :goto_1

    .line 770
    .line 771
    :cond_34
    const/16 v3, 0x25

    .line 772
    .line 773
    goto/16 :goto_1

    .line 774
    .line 775
    :sswitch_34
    const-string v2, "databaseEnabled"

    .line 776
    .line 777
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-result v1

    .line 781
    if-nez v1, :cond_35

    .line 782
    .line 783
    goto/16 :goto_1

    .line 784
    .line 785
    :cond_35
    const/16 v3, 0x24

    .line 786
    .line 787
    goto/16 :goto_1

    .line 788
    .line 789
    :sswitch_35
    const-string v2, "allowUniversalAccessFromFileURLs"

    .line 790
    .line 791
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v1

    .line 795
    if-nez v1, :cond_36

    .line 796
    .line 797
    goto/16 :goto_1

    .line 798
    .line 799
    :cond_36
    const/16 v3, 0x23

    .line 800
    .line 801
    goto/16 :goto_1

    .line 802
    .line 803
    :sswitch_36
    const-string v2, "enterpriseAuthenticationAppLinkPolicyEnabled"

    .line 804
    .line 805
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    move-result v1

    .line 809
    if-nez v1, :cond_37

    .line 810
    .line 811
    goto/16 :goto_1

    .line 812
    .line 813
    :cond_37
    const/16 v3, 0x22

    .line 814
    .line 815
    goto/16 :goto_1

    .line 816
    .line 817
    :sswitch_37
    const-string v2, "transparentBackground"

    .line 818
    .line 819
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 820
    .line 821
    .line 822
    move-result v1

    .line 823
    if-nez v1, :cond_38

    .line 824
    .line 825
    goto/16 :goto_1

    .line 826
    .line 827
    :cond_38
    const/16 v3, 0x21

    .line 828
    .line 829
    goto/16 :goto_1

    .line 830
    .line 831
    :sswitch_38
    const-string v2, "clearCache"

    .line 832
    .line 833
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v1

    .line 837
    if-nez v1, :cond_39

    .line 838
    .line 839
    goto/16 :goto_1

    .line 840
    .line 841
    :cond_39
    const/16 v3, 0x20

    .line 842
    .line 843
    goto/16 :goto_1

    .line 844
    .line 845
    :sswitch_39
    const-string v2, "layoutAlgorithm"

    .line 846
    .line 847
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v1

    .line 851
    if-nez v1, :cond_3a

    .line 852
    .line 853
    goto/16 :goto_1

    .line 854
    .line 855
    :cond_3a
    const/16 v3, 0x1f

    .line 856
    .line 857
    goto/16 :goto_1

    .line 858
    .line 859
    :sswitch_3a
    const-string v2, "minimumFontSize"

    .line 860
    .line 861
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 862
    .line 863
    .line 864
    move-result v1

    .line 865
    if-nez v1, :cond_3b

    .line 866
    .line 867
    goto/16 :goto_1

    .line 868
    .line 869
    :cond_3b
    const/16 v3, 0x1e

    .line 870
    .line 871
    goto/16 :goto_1

    .line 872
    .line 873
    :sswitch_3b
    const-string v2, "interceptOnlyAsyncAjaxRequests"

    .line 874
    .line 875
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 876
    .line 877
    .line 878
    move-result v1

    .line 879
    if-nez v1, :cond_3c

    .line 880
    .line 881
    goto/16 :goto_1

    .line 882
    .line 883
    :cond_3c
    const/16 v3, 0x1d

    .line 884
    .line 885
    goto/16 :goto_1

    .line 886
    .line 887
    :sswitch_3c
    const-string v2, "textZoom"

    .line 888
    .line 889
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 890
    .line 891
    .line 892
    move-result v1

    .line 893
    if-nez v1, :cond_3d

    .line 894
    .line 895
    goto/16 :goto_1

    .line 896
    .line 897
    :cond_3d
    const/16 v3, 0x1c

    .line 898
    .line 899
    goto/16 :goto_1

    .line 900
    .line 901
    :sswitch_3d
    const-string v2, "useShouldInterceptAjaxRequest"

    .line 902
    .line 903
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    if-nez v1, :cond_3e

    .line 908
    .line 909
    goto/16 :goto_1

    .line 910
    .line 911
    :cond_3e
    const/16 v3, 0x1b

    .line 912
    .line 913
    goto/16 :goto_1

    .line 914
    .line 915
    :sswitch_3e
    const-string v2, "disableContextMenu"

    .line 916
    .line 917
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    move-result v1

    .line 921
    if-nez v1, :cond_3f

    .line 922
    .line 923
    goto/16 :goto_1

    .line 924
    .line 925
    :cond_3f
    const/16 v3, 0x1a

    .line 926
    .line 927
    goto/16 :goto_1

    .line 928
    .line 929
    :sswitch_3f
    const-string v2, "domStorageEnabled"

    .line 930
    .line 931
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    move-result v1

    .line 935
    if-nez v1, :cond_40

    .line 936
    .line 937
    goto/16 :goto_1

    .line 938
    .line 939
    :cond_40
    const/16 v3, 0x19

    .line 940
    .line 941
    goto/16 :goto_1

    .line 942
    .line 943
    :sswitch_40
    const-string v2, "overScrollMode"

    .line 944
    .line 945
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result v1

    .line 949
    if-nez v1, :cond_41

    .line 950
    .line 951
    goto/16 :goto_1

    .line 952
    .line 953
    :cond_41
    const/16 v3, 0x18

    .line 954
    .line 955
    goto/16 :goto_1

    .line 956
    .line 957
    :sswitch_41
    const-string v2, "webViewAssetLoader"

    .line 958
    .line 959
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 960
    .line 961
    .line 962
    move-result v1

    .line 963
    if-nez v1, :cond_42

    .line 964
    .line 965
    goto/16 :goto_1

    .line 966
    .line 967
    :cond_42
    const/16 v3, 0x17

    .line 968
    .line 969
    goto/16 :goto_1

    .line 970
    .line 971
    :sswitch_42
    const-string v2, "allowBackgroundAudioPlaying"

    .line 972
    .line 973
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-result v1

    .line 977
    if-nez v1, :cond_43

    .line 978
    .line 979
    goto/16 :goto_1

    .line 980
    .line 981
    :cond_43
    const/16 v3, 0x16

    .line 982
    .line 983
    goto/16 :goto_1

    .line 984
    .line 985
    :sswitch_43
    const-string v2, "incognito"

    .line 986
    .line 987
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 988
    .line 989
    .line 990
    move-result v1

    .line 991
    if-nez v1, :cond_44

    .line 992
    .line 993
    goto/16 :goto_1

    .line 994
    .line 995
    :cond_44
    const/16 v3, 0x15

    .line 996
    .line 997
    goto/16 :goto_1

    .line 998
    .line 999
    :sswitch_44
    const-string v2, "disabledActionModeMenuItems"

    .line 1000
    .line 1001
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1002
    .line 1003
    .line 1004
    move-result v1

    .line 1005
    if-nez v1, :cond_45

    .line 1006
    .line 1007
    goto/16 :goto_1

    .line 1008
    .line 1009
    :cond_45
    const/16 v3, 0x14

    .line 1010
    .line 1011
    goto/16 :goto_1

    .line 1012
    .line 1013
    :sswitch_45
    const-string v2, "resourceCustomSchemes"

    .line 1014
    .line 1015
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1016
    .line 1017
    .line 1018
    move-result v1

    .line 1019
    if-nez v1, :cond_46

    .line 1020
    .line 1021
    goto/16 :goto_1

    .line 1022
    .line 1023
    :cond_46
    const/16 v3, 0x13

    .line 1024
    .line 1025
    goto/16 :goto_1

    .line 1026
    .line 1027
    :sswitch_46
    const-string v2, "loadsImagesAutomatically"

    .line 1028
    .line 1029
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1030
    .line 1031
    .line 1032
    move-result v1

    .line 1033
    if-nez v1, :cond_47

    .line 1034
    .line 1035
    goto/16 :goto_1

    .line 1036
    .line 1037
    :cond_47
    const/16 v3, 0x12

    .line 1038
    .line 1039
    goto/16 :goto_1

    .line 1040
    .line 1041
    :sswitch_47
    const-string v2, "useShouldInterceptFetchRequest"

    .line 1042
    .line 1043
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1044
    .line 1045
    .line 1046
    move-result v1

    .line 1047
    if-nez v1, :cond_48

    .line 1048
    .line 1049
    goto/16 :goto_1

    .line 1050
    .line 1051
    :cond_48
    const/16 v3, 0x11

    .line 1052
    .line 1053
    goto/16 :goto_1

    .line 1054
    .line 1055
    :sswitch_48
    const-string v2, "networkAvailable"

    .line 1056
    .line 1057
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v1

    .line 1061
    if-nez v1, :cond_49

    .line 1062
    .line 1063
    goto/16 :goto_1

    .line 1064
    .line 1065
    :cond_49
    const/16 v3, 0x10

    .line 1066
    .line 1067
    goto/16 :goto_1

    .line 1068
    .line 1069
    :sswitch_49
    const-string v2, "hardwareAcceleration"

    .line 1070
    .line 1071
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v1

    .line 1075
    if-nez v1, :cond_4a

    .line 1076
    .line 1077
    goto/16 :goto_1

    .line 1078
    .line 1079
    :cond_4a
    const/16 v3, 0xf

    .line 1080
    .line 1081
    goto/16 :goto_1

    .line 1082
    .line 1083
    :sswitch_4a
    const-string v2, "javaScriptEnabled"

    .line 1084
    .line 1085
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1086
    .line 1087
    .line 1088
    move-result v1

    .line 1089
    if-nez v1, :cond_4b

    .line 1090
    .line 1091
    goto/16 :goto_1

    .line 1092
    .line 1093
    :cond_4b
    const/16 v3, 0xe

    .line 1094
    .line 1095
    goto/16 :goto_1

    .line 1096
    .line 1097
    :sswitch_4b
    const-string v2, "builtInZoomControls"

    .line 1098
    .line 1099
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v1

    .line 1103
    if-nez v1, :cond_4c

    .line 1104
    .line 1105
    goto/16 :goto_1

    .line 1106
    .line 1107
    :cond_4c
    const/16 v3, 0xd

    .line 1108
    .line 1109
    goto/16 :goto_1

    .line 1110
    .line 1111
    :sswitch_4c
    const-string v2, "fixedFontFamily"

    .line 1112
    .line 1113
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    move-result v1

    .line 1117
    if-nez v1, :cond_4d

    .line 1118
    .line 1119
    goto/16 :goto_1

    .line 1120
    .line 1121
    :cond_4d
    const/16 v3, 0xc

    .line 1122
    .line 1123
    goto/16 :goto_1

    .line 1124
    .line 1125
    :sswitch_4d
    const-string v2, "allowContentAccess"

    .line 1126
    .line 1127
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1128
    .line 1129
    .line 1130
    move-result v1

    .line 1131
    if-nez v1, :cond_4e

    .line 1132
    .line 1133
    goto/16 :goto_1

    .line 1134
    .line 1135
    :cond_4e
    const/16 v3, 0xb

    .line 1136
    .line 1137
    goto/16 :goto_1

    .line 1138
    .line 1139
    :sswitch_4e
    const-string v2, "preferredContentMode"

    .line 1140
    .line 1141
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v1

    .line 1145
    if-nez v1, :cond_4f

    .line 1146
    .line 1147
    goto/16 :goto_1

    .line 1148
    .line 1149
    :cond_4f
    const/16 v3, 0xa

    .line 1150
    .line 1151
    goto/16 :goto_1

    .line 1152
    .line 1153
    :sswitch_4f
    const-string v2, "useShouldOverrideUrlLoading"

    .line 1154
    .line 1155
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v1

    .line 1159
    if-nez v1, :cond_50

    .line 1160
    .line 1161
    goto/16 :goto_1

    .line 1162
    .line 1163
    :cond_50
    const/16 v3, 0x9

    .line 1164
    .line 1165
    goto/16 :goto_1

    .line 1166
    .line 1167
    :sswitch_50
    const-string v2, "needInitialFocus"

    .line 1168
    .line 1169
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v1

    .line 1173
    if-nez v1, :cond_51

    .line 1174
    .line 1175
    goto/16 :goto_1

    .line 1176
    .line 1177
    :cond_51
    const/16 v3, 0x8

    .line 1178
    .line 1179
    goto/16 :goto_1

    .line 1180
    .line 1181
    :sswitch_51
    const-string v2, "defaultTextEncodingName"

    .line 1182
    .line 1183
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v1

    .line 1187
    if-nez v1, :cond_52

    .line 1188
    .line 1189
    goto :goto_1

    .line 1190
    :cond_52
    const/4 v3, 0x7

    .line 1191
    goto :goto_1

    .line 1192
    :sswitch_52
    const-string v2, "scrollbarFadingEnabled"

    .line 1193
    .line 1194
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1195
    .line 1196
    .line 1197
    move-result v1

    .line 1198
    if-nez v1, :cond_53

    .line 1199
    .line 1200
    goto :goto_1

    .line 1201
    :cond_53
    const/4 v3, 0x6

    .line 1202
    goto :goto_1

    .line 1203
    :sswitch_53
    const-string v2, "supportZoom"

    .line 1204
    .line 1205
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1206
    .line 1207
    .line 1208
    move-result v1

    .line 1209
    if-nez v1, :cond_54

    .line 1210
    .line 1211
    goto :goto_1

    .line 1212
    :cond_54
    const/4 v3, 0x5

    .line 1213
    goto :goto_1

    .line 1214
    :sswitch_54
    const-string v2, "defaultFontSize"

    .line 1215
    .line 1216
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v1

    .line 1220
    if-nez v1, :cond_55

    .line 1221
    .line 1222
    goto :goto_1

    .line 1223
    :cond_55
    const/4 v3, 0x4

    .line 1224
    goto :goto_1

    .line 1225
    :sswitch_55
    const-string v2, "allowFileAccessFromFileURLs"

    .line 1226
    .line 1227
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v1

    .line 1231
    if-nez v1, :cond_56

    .line 1232
    .line 1233
    goto :goto_1

    .line 1234
    :cond_56
    const/4 v3, 0x3

    .line 1235
    goto :goto_1

    .line 1236
    :sswitch_56
    const-string v2, "useWideViewPort"

    .line 1237
    .line 1238
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1239
    .line 1240
    .line 1241
    move-result v1

    .line 1242
    if-nez v1, :cond_57

    .line 1243
    .line 1244
    goto :goto_1

    .line 1245
    :cond_57
    const/4 v3, 0x2

    .line 1246
    goto :goto_1

    .line 1247
    :sswitch_57
    const-string v2, "scrollBarDefaultDelayBeforeFade"

    .line 1248
    .line 1249
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v1

    .line 1253
    if-nez v1, :cond_58

    .line 1254
    .line 1255
    goto :goto_1

    .line 1256
    :cond_58
    const/4 v3, 0x1

    .line 1257
    goto :goto_1

    .line 1258
    :sswitch_58
    const-string v2, "disableHorizontalScroll"

    .line 1259
    .line 1260
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v1

    .line 1264
    if-nez v1, :cond_59

    .line 1265
    .line 1266
    goto :goto_1

    .line 1267
    :cond_59
    const/4 v3, 0x0

    .line 1268
    :goto_1
    packed-switch v3, :pswitch_data_0

    .line 1269
    .line 1270
    .line 1271
    goto/16 :goto_0

    .line 1272
    .line 1273
    :pswitch_0
    check-cast v0, Ljava/lang/Boolean;

    .line 1274
    .line 1275
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->algorithmicDarkeningAllowed:Ljava/lang/Boolean;

    .line 1276
    .line 1277
    goto/16 :goto_0

    .line 1278
    .line 1279
    :pswitch_1
    check-cast v0, [B

    .line 1280
    .line 1281
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultVideoPoster:[B

    .line 1282
    .line 1283
    goto/16 :goto_0

    .line 1284
    .line 1285
    :pswitch_2
    check-cast v0, Ljava/lang/Boolean;

    .line 1286
    .line 1287
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->clearSessionCache:Ljava/lang/Boolean;

    .line 1288
    .line 1289
    goto/16 :goto_0

    .line 1290
    .line 1291
    :pswitch_3
    check-cast v0, Ljava/lang/Boolean;

    .line 1292
    .line 1293
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollBarEnabled:Ljava/lang/Boolean;

    .line 1294
    .line 1295
    goto/16 :goto_0

    .line 1296
    .line 1297
    :pswitch_4
    check-cast v0, Ljava/lang/Integer;

    .line 1298
    .line 1299
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->minimumLogicalFontSize:Ljava/lang/Integer;

    .line 1300
    .line 1301
    goto/16 :goto_0

    .line 1302
    .line 1303
    :pswitch_5
    check-cast v0, Ljava/lang/Boolean;

    .line 1304
    .line 1305
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->thirdPartyCookiesEnabled:Ljava/lang/Boolean;

    .line 1306
    .line 1307
    goto/16 :goto_0

    .line 1308
    .line 1309
    :pswitch_6
    check-cast v0, Ljava/lang/Integer;

    .line 1310
    .line 1311
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultFixedFontSize:Ljava/lang/Integer;

    .line 1312
    .line 1313
    goto/16 :goto_0

    .line 1314
    .line 1315
    :pswitch_7
    check-cast v0, Ljava/lang/Boolean;

    .line 1316
    .line 1317
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->supportMultipleWindows:Ljava/lang/Boolean;

    .line 1318
    .line 1319
    goto/16 :goto_0

    .line 1320
    .line 1321
    :pswitch_8
    check-cast v0, Ljava/util/List;

    .line 1322
    .line 1323
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->contentBlockers:Ljava/util/List;

    .line 1324
    .line 1325
    goto/16 :goto_0

    .line 1326
    .line 1327
    :pswitch_9
    check-cast v0, Ljava/lang/Boolean;

    .line 1328
    .line 1329
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableDefaultErrorPage:Ljava/lang/Boolean;

    .line 1330
    .line 1331
    goto/16 :goto_0

    .line 1332
    .line 1333
    :pswitch_a
    check-cast v0, Ljava/lang/Integer;

    .line 1334
    .line 1335
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->forceDark:Ljava/lang/Integer;

    .line 1336
    .line 1337
    goto/16 :goto_0

    .line 1338
    .line 1339
    :pswitch_b
    check-cast v0, Ljava/lang/String;

    .line 1340
    .line 1341
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollbarThumbColor:Ljava/lang/String;

    .line 1342
    .line 1343
    goto/16 :goto_0

    .line 1344
    .line 1345
    :pswitch_c
    check-cast v0, Ljava/lang/String;

    .line 1346
    .line 1347
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->serifFontFamily:Ljava/lang/String;

    .line 1348
    .line 1349
    goto/16 :goto_0

    .line 1350
    .line 1351
    :pswitch_d
    check-cast v0, Ljava/lang/Boolean;

    .line 1352
    .line 1353
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->safeBrowsingEnabled:Ljava/lang/Boolean;

    .line 1354
    .line 1355
    goto/16 :goto_0

    .line 1356
    .line 1357
    :pswitch_e
    check-cast v0, Ljava/lang/Boolean;

    .line 1358
    .line 1359
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->loadWithOverviewMode:Ljava/lang/Boolean;

    .line 1360
    .line 1361
    goto/16 :goto_0

    .line 1362
    .line 1363
    :pswitch_f
    check-cast v0, Ljava/lang/Boolean;

    .line 1364
    .line 1365
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->geolocationEnabled:Ljava/lang/Boolean;

    .line 1366
    .line 1367
    goto/16 :goto_0

    .line 1368
    .line 1369
    :pswitch_10
    check-cast v0, Ljava/lang/Boolean;

    .line 1370
    .line 1371
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->displayZoomControls:Ljava/lang/Boolean;

    .line 1372
    .line 1373
    goto/16 :goto_0

    .line 1374
    .line 1375
    :pswitch_11
    check-cast v0, Ljava/lang/String;

    .line 1376
    .line 1377
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->standardFontFamily:Ljava/lang/String;

    .line 1378
    .line 1379
    goto/16 :goto_0

    .line 1380
    .line 1381
    :pswitch_12
    check-cast v0, Ljava/lang/String;

    .line 1382
    .line 1383
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->horizontalScrollbarThumbColor:Ljava/lang/String;

    .line 1384
    .line 1385
    goto/16 :goto_0

    .line 1386
    .line 1387
    :pswitch_13
    check-cast v0, Ljava/lang/String;

    .line 1388
    .line 1389
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->appCachePath:Ljava/lang/String;

    .line 1390
    .line 1391
    goto/16 :goto_0

    .line 1392
    .line 1393
    :pswitch_14
    check-cast v0, Ljava/lang/Boolean;

    .line 1394
    .line 1395
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowFileAccess:Ljava/lang/Boolean;

    .line 1396
    .line 1397
    goto/16 :goto_0

    .line 1398
    .line 1399
    :pswitch_15
    check-cast v0, Ljava/lang/Integer;

    .line 1400
    .line 1401
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarFadeDuration:Ljava/lang/Integer;

    .line 1402
    .line 1403
    goto/16 :goto_0

    .line 1404
    .line 1405
    :pswitch_16
    check-cast v0, Ljava/lang/Integer;

    .line 1406
    .line 1407
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->mixedContentMode:Ljava/lang/Integer;

    .line 1408
    .line 1409
    goto/16 :goto_0

    .line 1410
    .line 1411
    :pswitch_17
    check-cast v0, Ljava/lang/String;

    .line 1412
    .line 1413
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->applicationNameForUserAgent:Ljava/lang/String;

    .line 1414
    .line 1415
    goto/16 :goto_0

    .line 1416
    .line 1417
    :pswitch_18
    check-cast v0, Ljava/lang/Boolean;

    .line 1418
    .line 1419
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useHybridComposition:Ljava/lang/Boolean;

    .line 1420
    .line 1421
    goto/16 :goto_0

    .line 1422
    .line 1423
    :pswitch_19
    new-instance v1, Ljava/util/HashSet;

    .line 1424
    .line 1425
    check-cast v0, Ljava/util/List;

    .line 1426
    .line 1427
    invoke-direct {v1, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 1428
    .line 1429
    .line 1430
    iput-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->requestedWithHeaderOriginAllowList:Ljava/util/Set;

    .line 1431
    .line 1432
    goto/16 :goto_0

    .line 1433
    .line 1434
    :pswitch_1a
    check-cast v0, Ljava/lang/Boolean;

    .line 1435
    .line 1436
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->saveFormData:Ljava/lang/Boolean;

    .line 1437
    .line 1438
    goto/16 :goto_0

    .line 1439
    .line 1440
    :pswitch_1b
    check-cast v0, Ljava/lang/Boolean;

    .line 1441
    .line 1442
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cacheEnabled:Ljava/lang/Boolean;

    .line 1443
    .line 1444
    goto/16 :goto_0

    .line 1445
    .line 1446
    :pswitch_1c
    check-cast v0, Ljava/lang/Boolean;

    .line 1447
    .line 1448
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnLoadResource:Ljava/lang/Boolean;

    .line 1449
    .line 1450
    goto/16 :goto_0

    .line 1451
    .line 1452
    :pswitch_1d
    check-cast v0, Ljava/lang/Boolean;

    .line 1453
    .line 1454
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnRenderProcessGone:Ljava/lang/Boolean;

    .line 1455
    .line 1456
    goto/16 :goto_0

    .line 1457
    .line 1458
    :pswitch_1e
    check-cast v0, Ljava/lang/String;

    .line 1459
    .line 1460
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->userAgent:Ljava/lang/String;

    .line 1461
    .line 1462
    goto/16 :goto_0

    .line 1463
    .line 1464
    :pswitch_1f
    check-cast v0, Ljava/lang/Boolean;

    .line 1465
    .line 1466
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->blockNetworkLoads:Ljava/lang/Boolean;

    .line 1467
    .line 1468
    goto/16 :goto_0

    .line 1469
    .line 1470
    :pswitch_20
    check-cast v0, Ljava/lang/Boolean;

    .line 1471
    .line 1472
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->blockNetworkImage:Ljava/lang/Boolean;

    .line 1473
    .line 1474
    goto/16 :goto_0

    .line 1475
    .line 1476
    :pswitch_21
    check-cast v0, Ljava/lang/Boolean;

    .line 1477
    .line 1478
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->mediaPlaybackRequiresUserGesture:Ljava/lang/Boolean;

    .line 1479
    .line 1480
    goto/16 :goto_0

    .line 1481
    .line 1482
    :pswitch_22
    check-cast v0, Ljava/lang/String;

    .line 1483
    .line 1484
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cursiveFontFamily:Ljava/lang/String;

    .line 1485
    .line 1486
    goto/16 :goto_0

    .line 1487
    .line 1488
    :pswitch_23
    check-cast v0, Ljava/lang/Integer;

    .line 1489
    .line 1490
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->forceDarkStrategy:Ljava/lang/Integer;

    .line 1491
    .line 1492
    goto/16 :goto_0

    .line 1493
    .line 1494
    :pswitch_24
    check-cast v0, Ljava/lang/Boolean;

    .line 1495
    .line 1496
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnDownloadStart:Ljava/lang/Boolean;

    .line 1497
    .line 1498
    goto/16 :goto_0

    .line 1499
    .line 1500
    :pswitch_25
    check-cast v0, Ljava/lang/String;

    .line 1501
    .line 1502
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollbarTrackColor:Ljava/lang/String;

    .line 1503
    .line 1504
    goto/16 :goto_0

    .line 1505
    .line 1506
    :pswitch_26
    check-cast v0, Ljava/lang/String;

    .line 1507
    .line 1508
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->regexToCancelSubFramesLoading:Ljava/lang/String;

    .line 1509
    .line 1510
    goto/16 :goto_0

    .line 1511
    .line 1512
    :pswitch_27
    check-cast v0, Ljava/lang/String;

    .line 1513
    .line 1514
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->sansSerifFontFamily:Ljava/lang/String;

    .line 1515
    .line 1516
    goto/16 :goto_0

    .line 1517
    .line 1518
    :pswitch_28
    check-cast v0, Ljava/util/Map;

    .line 1519
    .line 1520
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->rendererPriorityPolicy:Ljava/util/Map;

    .line 1521
    .line 1522
    goto/16 :goto_0

    .line 1523
    .line 1524
    :pswitch_29
    check-cast v0, Ljava/lang/String;

    .line 1525
    .line 1526
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->fantasyFontFamily:Ljava/lang/String;

    .line 1527
    .line 1528
    goto/16 :goto_0

    .line 1529
    .line 1530
    :pswitch_2a
    check-cast v0, Ljava/lang/Boolean;

    .line 1531
    .line 1532
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->offscreenPreRaster:Ljava/lang/Boolean;

    .line 1533
    .line 1534
    goto/16 :goto_0

    .line 1535
    .line 1536
    :pswitch_2b
    check-cast v0, Ljava/lang/String;

    .line 1537
    .line 1538
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->horizontalScrollbarTrackColor:Ljava/lang/String;

    .line 1539
    .line 1540
    goto/16 :goto_0

    .line 1541
    .line 1542
    :pswitch_2c
    check-cast v0, Ljava/lang/Boolean;

    .line 1543
    .line 1544
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->javaScriptCanOpenWindowsAutomatically:Ljava/lang/Boolean;

    .line 1545
    .line 1546
    goto/16 :goto_0

    .line 1547
    .line 1548
    :pswitch_2d
    check-cast v0, Ljava/lang/Boolean;

    .line 1549
    .line 1550
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableVerticalScroll:Ljava/lang/Boolean;

    .line 1551
    .line 1552
    goto/16 :goto_0

    .line 1553
    .line 1554
    :pswitch_2e
    check-cast v0, Ljava/lang/Integer;

    .line 1555
    .line 1556
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollbarPosition:Ljava/lang/Integer;

    .line 1557
    .line 1558
    goto/16 :goto_0

    .line 1559
    .line 1560
    :pswitch_2f
    check-cast v0, Ljava/lang/Integer;

    .line 1561
    .line 1562
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->initialScale:Ljava/lang/Integer;

    .line 1563
    .line 1564
    goto/16 :goto_0

    .line 1565
    .line 1566
    :pswitch_30
    check-cast v0, Ljava/lang/Integer;

    .line 1567
    .line 1568
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarStyle:Ljava/lang/Integer;

    .line 1569
    .line 1570
    goto/16 :goto_0

    .line 1571
    .line 1572
    :pswitch_31
    check-cast v0, Ljava/lang/Boolean;

    .line 1573
    .line 1574
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->horizontalScrollBarEnabled:Ljava/lang/Boolean;

    .line 1575
    .line 1576
    goto/16 :goto_0

    .line 1577
    .line 1578
    :pswitch_32
    check-cast v0, Ljava/lang/Integer;

    .line 1579
    .line 1580
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cacheMode:Ljava/lang/Integer;

    .line 1581
    .line 1582
    goto/16 :goto_0

    .line 1583
    .line 1584
    :pswitch_33
    check-cast v0, Ljava/lang/Boolean;

    .line 1585
    .line 1586
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptRequest:Ljava/lang/Boolean;

    .line 1587
    .line 1588
    goto/16 :goto_0

    .line 1589
    .line 1590
    :pswitch_34
    check-cast v0, Ljava/lang/Boolean;

    .line 1591
    .line 1592
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->databaseEnabled:Ljava/lang/Boolean;

    .line 1593
    .line 1594
    goto/16 :goto_0

    .line 1595
    .line 1596
    :pswitch_35
    check-cast v0, Ljava/lang/Boolean;

    .line 1597
    .line 1598
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowUniversalAccessFromFileURLs:Ljava/lang/Boolean;

    .line 1599
    .line 1600
    goto/16 :goto_0

    .line 1601
    .line 1602
    :pswitch_36
    check-cast v0, Ljava/lang/Boolean;

    .line 1603
    .line 1604
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->enterpriseAuthenticationAppLinkPolicyEnabled:Ljava/lang/Boolean;

    .line 1605
    .line 1606
    goto/16 :goto_0

    .line 1607
    .line 1608
    :pswitch_37
    check-cast v0, Ljava/lang/Boolean;

    .line 1609
    .line 1610
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->transparentBackground:Ljava/lang/Boolean;

    .line 1611
    .line 1612
    goto/16 :goto_0

    .line 1613
    .line 1614
    :pswitch_38
    check-cast v0, Ljava/lang/Boolean;

    .line 1615
    .line 1616
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->clearCache:Ljava/lang/Boolean;

    .line 1617
    .line 1618
    goto/16 :goto_0

    .line 1619
    .line 1620
    :pswitch_39
    check-cast v0, Ljava/lang/String;

    .line 1621
    .line 1622
    invoke-direct {p0, v0}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->setLayoutAlgorithm(Ljava/lang/String;)V

    .line 1623
    .line 1624
    .line 1625
    goto/16 :goto_0

    .line 1626
    .line 1627
    :pswitch_3a
    check-cast v0, Ljava/lang/Integer;

    .line 1628
    .line 1629
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->minimumFontSize:Ljava/lang/Integer;

    .line 1630
    .line 1631
    goto/16 :goto_0

    .line 1632
    .line 1633
    :pswitch_3b
    check-cast v0, Ljava/lang/Boolean;

    .line 1634
    .line 1635
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->interceptOnlyAsyncAjaxRequests:Ljava/lang/Boolean;

    .line 1636
    .line 1637
    goto/16 :goto_0

    .line 1638
    .line 1639
    :pswitch_3c
    check-cast v0, Ljava/lang/Integer;

    .line 1640
    .line 1641
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->textZoom:Ljava/lang/Integer;

    .line 1642
    .line 1643
    goto/16 :goto_0

    .line 1644
    .line 1645
    :pswitch_3d
    check-cast v0, Ljava/lang/Boolean;

    .line 1646
    .line 1647
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptAjaxRequest:Ljava/lang/Boolean;

    .line 1648
    .line 1649
    goto/16 :goto_0

    .line 1650
    .line 1651
    :pswitch_3e
    check-cast v0, Ljava/lang/Boolean;

    .line 1652
    .line 1653
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableContextMenu:Ljava/lang/Boolean;

    .line 1654
    .line 1655
    goto/16 :goto_0

    .line 1656
    .line 1657
    :pswitch_3f
    check-cast v0, Ljava/lang/Boolean;

    .line 1658
    .line 1659
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->domStorageEnabled:Ljava/lang/Boolean;

    .line 1660
    .line 1661
    goto/16 :goto_0

    .line 1662
    .line 1663
    :pswitch_40
    check-cast v0, Ljava/lang/Integer;

    .line 1664
    .line 1665
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->overScrollMode:Ljava/lang/Integer;

    .line 1666
    .line 1667
    goto/16 :goto_0

    .line 1668
    .line 1669
    :pswitch_41
    check-cast v0, Ljava/util/Map;

    .line 1670
    .line 1671
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->webViewAssetLoader:Ljava/util/Map;

    .line 1672
    .line 1673
    goto/16 :goto_0

    .line 1674
    .line 1675
    :pswitch_42
    check-cast v0, Ljava/lang/Boolean;

    .line 1676
    .line 1677
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowBackgroundAudioPlaying:Ljava/lang/Boolean;

    .line 1678
    .line 1679
    goto/16 :goto_0

    .line 1680
    .line 1681
    :pswitch_43
    check-cast v0, Ljava/lang/Boolean;

    .line 1682
    .line 1683
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->incognito:Ljava/lang/Boolean;

    .line 1684
    .line 1685
    goto/16 :goto_0

    .line 1686
    .line 1687
    :pswitch_44
    check-cast v0, Ljava/lang/Integer;

    .line 1688
    .line 1689
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disabledActionModeMenuItems:Ljava/lang/Integer;

    .line 1690
    .line 1691
    goto/16 :goto_0

    .line 1692
    .line 1693
    :pswitch_45
    check-cast v0, Ljava/util/List;

    .line 1694
    .line 1695
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->resourceCustomSchemes:Ljava/util/List;

    .line 1696
    .line 1697
    goto/16 :goto_0

    .line 1698
    .line 1699
    :pswitch_46
    check-cast v0, Ljava/lang/Boolean;

    .line 1700
    .line 1701
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->loadsImagesAutomatically:Ljava/lang/Boolean;

    .line 1702
    .line 1703
    goto/16 :goto_0

    .line 1704
    .line 1705
    :pswitch_47
    check-cast v0, Ljava/lang/Boolean;

    .line 1706
    .line 1707
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptFetchRequest:Ljava/lang/Boolean;

    .line 1708
    .line 1709
    goto/16 :goto_0

    .line 1710
    .line 1711
    :pswitch_48
    check-cast v0, Ljava/lang/Boolean;

    .line 1712
    .line 1713
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->networkAvailable:Ljava/lang/Boolean;

    .line 1714
    .line 1715
    goto/16 :goto_0

    .line 1716
    .line 1717
    :pswitch_49
    check-cast v0, Ljava/lang/Boolean;

    .line 1718
    .line 1719
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->hardwareAcceleration:Ljava/lang/Boolean;

    .line 1720
    .line 1721
    goto/16 :goto_0

    .line 1722
    .line 1723
    :pswitch_4a
    check-cast v0, Ljava/lang/Boolean;

    .line 1724
    .line 1725
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->javaScriptEnabled:Ljava/lang/Boolean;

    .line 1726
    .line 1727
    goto/16 :goto_0

    .line 1728
    .line 1729
    :pswitch_4b
    check-cast v0, Ljava/lang/Boolean;

    .line 1730
    .line 1731
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->builtInZoomControls:Ljava/lang/Boolean;

    .line 1732
    .line 1733
    goto/16 :goto_0

    .line 1734
    .line 1735
    :pswitch_4c
    check-cast v0, Ljava/lang/String;

    .line 1736
    .line 1737
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->fixedFontFamily:Ljava/lang/String;

    .line 1738
    .line 1739
    goto/16 :goto_0

    .line 1740
    .line 1741
    :pswitch_4d
    check-cast v0, Ljava/lang/Boolean;

    .line 1742
    .line 1743
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowContentAccess:Ljava/lang/Boolean;

    .line 1744
    .line 1745
    goto/16 :goto_0

    .line 1746
    .line 1747
    :pswitch_4e
    check-cast v0, Ljava/lang/Integer;

    .line 1748
    .line 1749
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->preferredContentMode:Ljava/lang/Integer;

    .line 1750
    .line 1751
    goto/16 :goto_0

    .line 1752
    .line 1753
    :pswitch_4f
    check-cast v0, Ljava/lang/Boolean;

    .line 1754
    .line 1755
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldOverrideUrlLoading:Ljava/lang/Boolean;

    .line 1756
    .line 1757
    goto/16 :goto_0

    .line 1758
    .line 1759
    :pswitch_50
    check-cast v0, Ljava/lang/Boolean;

    .line 1760
    .line 1761
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->needInitialFocus:Ljava/lang/Boolean;

    .line 1762
    .line 1763
    goto/16 :goto_0

    .line 1764
    .line 1765
    :pswitch_51
    check-cast v0, Ljava/lang/String;

    .line 1766
    .line 1767
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultTextEncodingName:Ljava/lang/String;

    .line 1768
    .line 1769
    goto/16 :goto_0

    .line 1770
    .line 1771
    :pswitch_52
    check-cast v0, Ljava/lang/Boolean;

    .line 1772
    .line 1773
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollbarFadingEnabled:Ljava/lang/Boolean;

    .line 1774
    .line 1775
    goto/16 :goto_0

    .line 1776
    .line 1777
    :pswitch_53
    check-cast v0, Ljava/lang/Boolean;

    .line 1778
    .line 1779
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->supportZoom:Ljava/lang/Boolean;

    .line 1780
    .line 1781
    goto/16 :goto_0

    .line 1782
    .line 1783
    :pswitch_54
    check-cast v0, Ljava/lang/Integer;

    .line 1784
    .line 1785
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultFontSize:Ljava/lang/Integer;

    .line 1786
    .line 1787
    goto/16 :goto_0

    .line 1788
    .line 1789
    :pswitch_55
    check-cast v0, Ljava/lang/Boolean;

    .line 1790
    .line 1791
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowFileAccessFromFileURLs:Ljava/lang/Boolean;

    .line 1792
    .line 1793
    goto/16 :goto_0

    .line 1794
    .line 1795
    :pswitch_56
    check-cast v0, Ljava/lang/Boolean;

    .line 1796
    .line 1797
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useWideViewPort:Ljava/lang/Boolean;

    .line 1798
    .line 1799
    goto/16 :goto_0

    .line 1800
    .line 1801
    :pswitch_57
    check-cast v0, Ljava/lang/Integer;

    .line 1802
    .line 1803
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarDefaultDelayBeforeFade:Ljava/lang/Integer;

    .line 1804
    .line 1805
    goto/16 :goto_0

    .line 1806
    .line 1807
    :pswitch_58
    check-cast v0, Ljava/lang/Boolean;

    .line 1808
    .line 1809
    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableHorizontalScroll:Ljava/lang/Boolean;

    .line 1810
    .line 1811
    goto/16 :goto_0

    .line 1812
    .line 1813
    :cond_5a
    return-object p0

    .line 1814
    nop

    .line 1815
    :sswitch_data_0
    .sparse-switch
        -0x7e28b4e7 -> :sswitch_58
        -0x7cebb65d -> :sswitch_57
        -0x7868fc20 -> :sswitch_56
        -0x781574ed -> :sswitch_55
        -0x731cf5af -> :sswitch_54
        -0x6e5567be -> :sswitch_53
        -0x6dffcbbe -> :sswitch_52
        -0x6d510f54 -> :sswitch_51
        -0x68125c56 -> :sswitch_50
        -0x660c5e8d -> :sswitch_4f
        -0x63c59185 -> :sswitch_4e
        -0x62cc3d8c -> :sswitch_4d
        -0x60f260d9 -> :sswitch_4c
        -0x60448474 -> :sswitch_4b
        -0x5fd28b0c -> :sswitch_4a
        -0x5e1d0d78 -> :sswitch_49
        -0x5e161bc5 -> :sswitch_48
        -0x5dd881a3 -> :sswitch_47
        -0x58404582 -> :sswitch_46
        -0x56c312b1 -> :sswitch_45
        -0x560c6f74 -> :sswitch_44
        -0x54db4b54 -> :sswitch_43
        -0x5416f991 -> :sswitch_42
        -0x5070ceb6 -> :sswitch_41
        -0x4ec079fc -> :sswitch_40
        -0x4458d9d8 -> :sswitch_3f
        -0x44248c5a -> :sswitch_3e
        -0x3de98899 -> :sswitch_3d
        -0x3bcf8160 -> :sswitch_3c
        -0x33c1a34e -> :sswitch_3b
        -0x2fb958e2 -> :sswitch_3a
        -0x2dc1379b -> :sswitch_39
        -0x2d410ecb -> :sswitch_38
        -0x2c486fe0 -> :sswitch_37
        -0x2c34aa73 -> :sswitch_36
        -0x2b64a590 -> :sswitch_35
        -0x2a557eba -> :sswitch_34
        -0x2a207e59 -> :sswitch_33
        -0x210233bb -> :sswitch_32
        -0x1a6e1561 -> :sswitch_31
        -0x19f88cb5 -> :sswitch_30
        -0x1919539a -> :sswitch_2f
        -0x13288f67 -> :sswitch_2e
        -0xda8fd15 -> :sswitch_2d
        -0xd908e93 -> :sswitch_2c
        -0xd70cf26 -> :sswitch_2b
        -0xd6bc25b -> :sswitch_2a
        -0xce7bfa7 -> :sswitch_29
        -0x96bc467 -> :sswitch_28
        -0x5dfef23 -> :sswitch_27
        0x370b1b2 -> :sswitch_26
        0x6032048 -> :sswitch_25
        0xa665894 -> :sswitch_24
        0xda9f794 -> :sswitch_23
        0xf5f0838 -> :sswitch_22
        0x1049b9d1 -> :sswitch_21
        0x11a538fa -> :sswitch_20
        0x11d067ec -> :sswitch_1f
        0x12900dfa -> :sswitch_1e
        0x1714ab12 -> :sswitch_1d
        0x17740bfa -> :sswitch_1c
        0x17ad5d5f -> :sswitch_1b
        0x185dc72b -> :sswitch_1a
        0x1c7337c0 -> :sswitch_19
        0x1d14d347 -> :sswitch_18
        0x2337f2cc -> :sswitch_17
        0x2d5b5ec1 -> :sswitch_16
        0x329d5556 -> :sswitch_15
        0x43d84229 -> :sswitch_14
        0x44f071a6 -> :sswitch_13
        0x471d0f2f -> :sswitch_12
        0x4d9a0f30 -> :sswitch_11
        0x4eb4a58b -> :sswitch_10
        0x5022225b -> :sswitch_f
        0x5406bfa8 -> :sswitch_e
        0x57e9092d -> :sswitch_d
        0x5938b1f0 -> :sswitch_c
        0x5a90fe9d -> :sswitch_b
        0x5b0c8101 -> :sswitch_a
        0x5e66be7e -> :sswitch_9
        0x68d96d52 -> :sswitch_8
        0x69c06284 -> :sswitch_7
        0x6ae683c3 -> :sswitch_6
        0x6c08f151 -> :sswitch_5
        0x749fd22b -> :sswitch_4
        0x77ebe1f1 -> :sswitch_3
        0x797e6979 -> :sswitch_2
        0x7a9484a7 -> :sswitch_1
        0x7c5e2f2e -> :sswitch_0
    .end sparse-switch

    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldOverrideUrlLoading:Ljava/lang/Boolean;

    .line 7
    .line 8
    const-string v2, "useShouldOverrideUrlLoading"

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnLoadResource:Ljava/lang/Boolean;

    .line 14
    .line 15
    const-string v2, "useOnLoadResource"

    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnDownloadStart:Ljava/lang/Boolean;

    .line 21
    .line 22
    const-string v2, "useOnDownloadStart"

    .line 23
    .line 24
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->clearCache:Ljava/lang/Boolean;

    .line 28
    .line 29
    const-string v2, "clearCache"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->userAgent:Ljava/lang/String;

    .line 35
    .line 36
    const-string v2, "userAgent"

    .line 37
    .line 38
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->applicationNameForUserAgent:Ljava/lang/String;

    .line 42
    .line 43
    const-string v2, "applicationNameForUserAgent"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->javaScriptEnabled:Ljava/lang/Boolean;

    .line 49
    .line 50
    const-string v2, "javaScriptEnabled"

    .line 51
    .line 52
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->javaScriptCanOpenWindowsAutomatically:Ljava/lang/Boolean;

    .line 56
    .line 57
    const-string v2, "javaScriptCanOpenWindowsAutomatically"

    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->mediaPlaybackRequiresUserGesture:Ljava/lang/Boolean;

    .line 63
    .line 64
    const-string v2, "mediaPlaybackRequiresUserGesture"

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->minimumFontSize:Ljava/lang/Integer;

    .line 70
    .line 71
    const-string v2, "minimumFontSize"

    .line 72
    .line 73
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollBarEnabled:Ljava/lang/Boolean;

    .line 77
    .line 78
    const-string v2, "verticalScrollBarEnabled"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->horizontalScrollBarEnabled:Ljava/lang/Boolean;

    .line 84
    .line 85
    const-string v2, "horizontalScrollBarEnabled"

    .line 86
    .line 87
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->resourceCustomSchemes:Ljava/util/List;

    .line 91
    .line 92
    const-string v2, "resourceCustomSchemes"

    .line 93
    .line 94
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->contentBlockers:Ljava/util/List;

    .line 98
    .line 99
    const-string v2, "contentBlockers"

    .line 100
    .line 101
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->preferredContentMode:Ljava/lang/Integer;

    .line 105
    .line 106
    const-string v2, "preferredContentMode"

    .line 107
    .line 108
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptAjaxRequest:Ljava/lang/Boolean;

    .line 112
    .line 113
    const-string v2, "useShouldInterceptAjaxRequest"

    .line 114
    .line 115
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->interceptOnlyAsyncAjaxRequests:Ljava/lang/Boolean;

    .line 119
    .line 120
    const-string v2, "interceptOnlyAsyncAjaxRequests"

    .line 121
    .line 122
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptFetchRequest:Ljava/lang/Boolean;

    .line 126
    .line 127
    const-string v2, "useShouldInterceptFetchRequest"

    .line 128
    .line 129
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->incognito:Ljava/lang/Boolean;

    .line 133
    .line 134
    const-string v2, "incognito"

    .line 135
    .line 136
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cacheEnabled:Ljava/lang/Boolean;

    .line 140
    .line 141
    const-string v2, "cacheEnabled"

    .line 142
    .line 143
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->transparentBackground:Ljava/lang/Boolean;

    .line 147
    .line 148
    const-string v2, "transparentBackground"

    .line 149
    .line 150
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableVerticalScroll:Ljava/lang/Boolean;

    .line 154
    .line 155
    const-string v2, "disableVerticalScroll"

    .line 156
    .line 157
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableHorizontalScroll:Ljava/lang/Boolean;

    .line 161
    .line 162
    const-string v2, "disableHorizontalScroll"

    .line 163
    .line 164
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableContextMenu:Ljava/lang/Boolean;

    .line 168
    .line 169
    const-string v2, "disableContextMenu"

    .line 170
    .line 171
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->textZoom:Ljava/lang/Integer;

    .line 175
    .line 176
    const-string v2, "textZoom"

    .line 177
    .line 178
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->clearSessionCache:Ljava/lang/Boolean;

    .line 182
    .line 183
    const-string v2, "clearSessionCache"

    .line 184
    .line 185
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->builtInZoomControls:Ljava/lang/Boolean;

    .line 189
    .line 190
    const-string v2, "builtInZoomControls"

    .line 191
    .line 192
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->displayZoomControls:Ljava/lang/Boolean;

    .line 196
    .line 197
    const-string v2, "displayZoomControls"

    .line 198
    .line 199
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->supportZoom:Ljava/lang/Boolean;

    .line 203
    .line 204
    const-string v2, "supportZoom"

    .line 205
    .line 206
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->databaseEnabled:Ljava/lang/Boolean;

    .line 210
    .line 211
    const-string v2, "databaseEnabled"

    .line 212
    .line 213
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->domStorageEnabled:Ljava/lang/Boolean;

    .line 217
    .line 218
    const-string v2, "domStorageEnabled"

    .line 219
    .line 220
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useWideViewPort:Ljava/lang/Boolean;

    .line 224
    .line 225
    const-string v2, "useWideViewPort"

    .line 226
    .line 227
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->safeBrowsingEnabled:Ljava/lang/Boolean;

    .line 231
    .line 232
    const-string v2, "safeBrowsingEnabled"

    .line 233
    .line 234
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->mixedContentMode:Ljava/lang/Integer;

    .line 238
    .line 239
    const-string v2, "mixedContentMode"

    .line 240
    .line 241
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowContentAccess:Ljava/lang/Boolean;

    .line 245
    .line 246
    const-string v2, "allowContentAccess"

    .line 247
    .line 248
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowFileAccess:Ljava/lang/Boolean;

    .line 252
    .line 253
    const-string v2, "allowFileAccess"

    .line 254
    .line 255
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowFileAccessFromFileURLs:Ljava/lang/Boolean;

    .line 259
    .line 260
    const-string v2, "allowFileAccessFromFileURLs"

    .line 261
    .line 262
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowUniversalAccessFromFileURLs:Ljava/lang/Boolean;

    .line 266
    .line 267
    const-string v2, "allowUniversalAccessFromFileURLs"

    .line 268
    .line 269
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->appCachePath:Ljava/lang/String;

    .line 273
    .line 274
    const-string v2, "appCachePath"

    .line 275
    .line 276
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->blockNetworkImage:Ljava/lang/Boolean;

    .line 280
    .line 281
    const-string v2, "blockNetworkImage"

    .line 282
    .line 283
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->blockNetworkLoads:Ljava/lang/Boolean;

    .line 287
    .line 288
    const-string v2, "blockNetworkLoads"

    .line 289
    .line 290
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cacheMode:Ljava/lang/Integer;

    .line 294
    .line 295
    const-string v2, "cacheMode"

    .line 296
    .line 297
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->cursiveFontFamily:Ljava/lang/String;

    .line 301
    .line 302
    const-string v2, "cursiveFontFamily"

    .line 303
    .line 304
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultFixedFontSize:Ljava/lang/Integer;

    .line 308
    .line 309
    const-string v2, "defaultFixedFontSize"

    .line 310
    .line 311
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultFontSize:Ljava/lang/Integer;

    .line 315
    .line 316
    const-string v2, "defaultFontSize"

    .line 317
    .line 318
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultTextEncodingName:Ljava/lang/String;

    .line 322
    .line 323
    const-string v2, "defaultTextEncodingName"

    .line 324
    .line 325
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disabledActionModeMenuItems:Ljava/lang/Integer;

    .line 329
    .line 330
    const-string v2, "disabledActionModeMenuItems"

    .line 331
    .line 332
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->fantasyFontFamily:Ljava/lang/String;

    .line 336
    .line 337
    const-string v2, "fantasyFontFamily"

    .line 338
    .line 339
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->fixedFontFamily:Ljava/lang/String;

    .line 343
    .line 344
    const-string v2, "fixedFontFamily"

    .line 345
    .line 346
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->forceDark:Ljava/lang/Integer;

    .line 350
    .line 351
    const-string v2, "forceDark"

    .line 352
    .line 353
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->forceDarkStrategy:Ljava/lang/Integer;

    .line 357
    .line 358
    const-string v2, "forceDarkStrategy"

    .line 359
    .line 360
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->geolocationEnabled:Ljava/lang/Boolean;

    .line 364
    .line 365
    const-string v2, "geolocationEnabled"

    .line 366
    .line 367
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    invoke-direct {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->getLayoutAlgorithm()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    const-string v2, "layoutAlgorithm"

    .line 375
    .line 376
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->loadWithOverviewMode:Ljava/lang/Boolean;

    .line 380
    .line 381
    const-string v2, "loadWithOverviewMode"

    .line 382
    .line 383
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->loadsImagesAutomatically:Ljava/lang/Boolean;

    .line 387
    .line 388
    const-string v2, "loadsImagesAutomatically"

    .line 389
    .line 390
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->minimumLogicalFontSize:Ljava/lang/Integer;

    .line 394
    .line 395
    const-string v2, "minimumLogicalFontSize"

    .line 396
    .line 397
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->initialScale:Ljava/lang/Integer;

    .line 401
    .line 402
    const-string v2, "initialScale"

    .line 403
    .line 404
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->needInitialFocus:Ljava/lang/Boolean;

    .line 408
    .line 409
    const-string v2, "needInitialFocus"

    .line 410
    .line 411
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->offscreenPreRaster:Ljava/lang/Boolean;

    .line 415
    .line 416
    const-string v2, "offscreenPreRaster"

    .line 417
    .line 418
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->sansSerifFontFamily:Ljava/lang/String;

    .line 422
    .line 423
    const-string v2, "sansSerifFontFamily"

    .line 424
    .line 425
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->serifFontFamily:Ljava/lang/String;

    .line 429
    .line 430
    const-string v2, "serifFontFamily"

    .line 431
    .line 432
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->standardFontFamily:Ljava/lang/String;

    .line 436
    .line 437
    const-string v2, "standardFontFamily"

    .line 438
    .line 439
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->saveFormData:Ljava/lang/Boolean;

    .line 443
    .line 444
    const-string v2, "saveFormData"

    .line 445
    .line 446
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->thirdPartyCookiesEnabled:Ljava/lang/Boolean;

    .line 450
    .line 451
    const-string v2, "thirdPartyCookiesEnabled"

    .line 452
    .line 453
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->hardwareAcceleration:Ljava/lang/Boolean;

    .line 457
    .line 458
    const-string v2, "hardwareAcceleration"

    .line 459
    .line 460
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->supportMultipleWindows:Ljava/lang/Boolean;

    .line 464
    .line 465
    const-string v2, "supportMultipleWindows"

    .line 466
    .line 467
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->regexToCancelSubFramesLoading:Ljava/lang/String;

    .line 471
    .line 472
    const-string v2, "regexToCancelSubFramesLoading"

    .line 473
    .line 474
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->overScrollMode:Ljava/lang/Integer;

    .line 478
    .line 479
    const-string v2, "overScrollMode"

    .line 480
    .line 481
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->networkAvailable:Ljava/lang/Boolean;

    .line 485
    .line 486
    const-string v2, "networkAvailable"

    .line 487
    .line 488
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarStyle:Ljava/lang/Integer;

    .line 492
    .line 493
    const-string v2, "scrollBarStyle"

    .line 494
    .line 495
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollbarPosition:Ljava/lang/Integer;

    .line 499
    .line 500
    const-string v2, "verticalScrollbarPosition"

    .line 501
    .line 502
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarDefaultDelayBeforeFade:Ljava/lang/Integer;

    .line 506
    .line 507
    const-string v2, "scrollBarDefaultDelayBeforeFade"

    .line 508
    .line 509
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollbarFadingEnabled:Ljava/lang/Boolean;

    .line 513
    .line 514
    const-string v2, "scrollbarFadingEnabled"

    .line 515
    .line 516
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->scrollBarFadeDuration:Ljava/lang/Integer;

    .line 520
    .line 521
    const-string v2, "scrollBarFadeDuration"

    .line 522
    .line 523
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->rendererPriorityPolicy:Ljava/util/Map;

    .line 527
    .line 528
    const-string v2, "rendererPriorityPolicy"

    .line 529
    .line 530
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useShouldInterceptRequest:Ljava/lang/Boolean;

    .line 534
    .line 535
    const-string v2, "useShouldInterceptRequest"

    .line 536
    .line 537
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useOnRenderProcessGone:Ljava/lang/Boolean;

    .line 541
    .line 542
    const-string v2, "useOnRenderProcessGone"

    .line 543
    .line 544
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->disableDefaultErrorPage:Ljava/lang/Boolean;

    .line 548
    .line 549
    const-string v2, "disableDefaultErrorPage"

    .line 550
    .line 551
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->useHybridComposition:Ljava/lang/Boolean;

    .line 555
    .line 556
    const-string v2, "useHybridComposition"

    .line 557
    .line 558
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollbarThumbColor:Ljava/lang/String;

    .line 562
    .line 563
    const-string v2, "verticalScrollbarThumbColor"

    .line 564
    .line 565
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->verticalScrollbarTrackColor:Ljava/lang/String;

    .line 569
    .line 570
    const-string v2, "verticalScrollbarTrackColor"

    .line 571
    .line 572
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->horizontalScrollbarThumbColor:Ljava/lang/String;

    .line 576
    .line 577
    const-string v2, "horizontalScrollbarThumbColor"

    .line 578
    .line 579
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->horizontalScrollbarTrackColor:Ljava/lang/String;

    .line 583
    .line 584
    const-string v2, "horizontalScrollbarTrackColor"

    .line 585
    .line 586
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->algorithmicDarkeningAllowed:Ljava/lang/Boolean;

    .line 590
    .line 591
    const-string v2, "algorithmicDarkeningAllowed"

    .line 592
    .line 593
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->enterpriseAuthenticationAppLinkPolicyEnabled:Ljava/lang/Boolean;

    .line 597
    .line 598
    const-string v2, "enterpriseAuthenticationAppLinkPolicyEnabled"

    .line 599
    .line 600
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->allowBackgroundAudioPlaying:Ljava/lang/Boolean;

    .line 604
    .line 605
    const-string v2, "allowBackgroundAudioPlaying"

    .line 606
    .line 607
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->defaultVideoPoster:[B

    .line 611
    .line 612
    const-string v2, "defaultVideoPoster"

    .line 613
    .line 614
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->requestedWithHeaderOriginAllowList:Ljava/util/Set;

    .line 618
    .line 619
    if-eqz v1, :cond_0

    .line 620
    .line 621
    new-instance v1, Ljava/util/ArrayList;

    .line 622
    .line 623
    iget-object p0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/webview/in_app_webview/InAppWebViewSettings;->requestedWithHeaderOriginAllowList:Ljava/util/Set;

    .line 624
    .line 625
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 626
    .line 627
    .line 628
    goto :goto_0

    .line 629
    :cond_0
    const/4 v1, 0x0

    .line 630
    :goto_0
    const-string p0, "requestedWithHeaderOriginAllowList"

    .line 631
    .line 632
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    return-object v0
.end method
