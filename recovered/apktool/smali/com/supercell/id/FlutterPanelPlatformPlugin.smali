.class public Lcom/supercell/id/FlutterPanelPlatformPlugin;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/supercell/id/FlutterPanelPlatformPlugin$PlatformPluginDelegate;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ViewPlatformPlugin"


# instance fields
.field final mPlatformMessageHandler:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$PlatformMessageHandler;

.field private final platformChannel:Lio/flutter/embedding/engine/systemchannels/PlatformChannel;

.field private final platformPluginDelegate:Lcom/supercell/id/FlutterPanelPlatformPlugin$PlatformPluginDelegate;

.field private final view:Lcom/supercell/id/FlutterPanel;


# direct methods
.method public constructor <init>(Lcom/supercell/id/FlutterPanel;Lio/flutter/embedding/engine/systemchannels/PlatformChannel;)V
    .locals 1

    const/4 v0, 0x0

    .line 21
    invoke-direct {p0, p1, p2, v0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;-><init>(Lcom/supercell/id/FlutterPanel;Lio/flutter/embedding/engine/systemchannels/PlatformChannel;Lcom/supercell/id/FlutterPanelPlatformPlugin$PlatformPluginDelegate;)V

    return-void
.end method

.method public constructor <init>(Lcom/supercell/id/FlutterPanel;Lio/flutter/embedding/engine/systemchannels/PlatformChannel;Lcom/supercell/id/FlutterPanelPlatformPlugin$PlatformPluginDelegate;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lvk0;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lvk0;-><init>(Lcom/supercell/id/FlutterPanelPlatformPlugin;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->mPlatformMessageHandler:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$PlatformMessageHandler;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->platformChannel:Lio/flutter/embedding/engine/systemchannels/PlatformChannel;

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Lio/flutter/embedding/engine/systemchannels/PlatformChannel;->setPlatformMessageHandler(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$PlatformMessageHandler;)V

    .line 16
    .line 17
    .line 18
    iput-object p3, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->platformPluginDelegate:Lcom/supercell/id/FlutterPanelPlatformPlugin$PlatformPluginDelegate;

    .line 19
    .line 20
    return-void
.end method

.method public static bridge synthetic a(Lcom/supercell/id/FlutterPanelPlatformPlugin;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->clipboardHasStrings()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static bridge synthetic b(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$ClipboardContentFormat;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->getClipboardData(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$ClipboardContentFormat;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static bridge synthetic c(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SoundType;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->playSystemSound(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SoundType;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private clipboardHasStrings()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "clipboard"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/content/ClipboardManager;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    return v1

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    const-string v0, "text/*"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0
.end method

.method public static bridge synthetic d(Lcom/supercell/id/FlutterPanelPlatformPlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->popSystemNavigator()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic e(Lcom/supercell/id/FlutterPanelPlatformPlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->restoreSystemChromeSystemUIOverlays()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic f(Lcom/supercell/id/FlutterPanelPlatformPlugin;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->setClipboardData(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic g(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$AppSwitcherDescription;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->setSystemChromeApplicationSwitcherDescription(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$AppSwitcherDescription;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getClipboardData(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$ClipboardContentFormat;)Ljava/lang/CharSequence;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "clipboard"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/content/ClipboardManager;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    return-object v2

    .line 30
    :cond_1
    if-eqz p1, :cond_3

    .line 31
    .line 32
    sget-object v1, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$ClipboardContentFormat;->PLAIN_TEXT:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$ClipboardContentFormat;

    .line 33
    .line 34
    if-ne p1, v1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-object v2

    .line 38
    :catch_0
    move-exception p0

    .line 39
    goto :goto_1

    .line 40
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 41
    invoke-virtual {v0, p1}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    iget-object v0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v3, "text/*"

    .line 66
    .line 67
    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->openTypedAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    .line 68
    .line 69
    .line 70
    :cond_4
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p1, p0}, Landroid/content/ClipData$Item;->coerceToText(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 80
    return-object p0

    .line 81
    :catch_1
    return-object v2

    .line 82
    :goto_1
    const-string p1, "ViewPlatformPlugin"

    .line 83
    .line 84
    const-string v0, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"

    .line 85
    .line 86
    invoke-static {p1, v0, p0}, Lio/flutter/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    return-object v2
.end method

.method public static bridge synthetic h(Lcom/supercell/id/FlutterPanelPlatformPlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->setSystemChromeChangeListener()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic i(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->setSystemChromeEnabledSystemUIMode(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic j(Lcom/supercell/id/FlutterPanelPlatformPlugin;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->setSystemChromeEnabledSystemUIOverlays(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic k(Lcom/supercell/id/FlutterPanelPlatformPlugin;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->setSystemChromePreferredOrientations(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic l(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemChromeStyle;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->setSystemChromeSystemUIOverlayStyle(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemChromeStyle;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static bridge synthetic m(Lcom/supercell/id/FlutterPanelPlatformPlugin;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->share(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private playSystemSound(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SoundType;)V
    .locals 1

    .line 1
    sget-object v0, Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SoundType;->CLICK:Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SoundType;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->playSoundEffect(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private popSystemNavigator()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->platformPluginDelegate:Lcom/supercell/id/FlutterPanelPlatformPlugin$PlatformPluginDelegate;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/supercell/id/FlutterPanelPlatformPlugin$PlatformPluginDelegate;->popSystemNavigator()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/supercell/id/FlutterPanel;->destroy()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private restoreSystemChromeSystemUIOverlays()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->updateSystemUiOverlays()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private setClipboardData(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "clipboard"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Landroid/content/ClipboardManager;

    .line 14
    .line 15
    const-string v0, "text label?"

    .line 16
    .line 17
    invoke-static {v0, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p0, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private setSystemChromeApplicationSwitcherDescription(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$AppSwitcherDescription;)V
    .locals 0

    .line 1
    return-void
.end method

.method private setSystemChromeChangeListener()V
    .locals 0

    .line 1
    return-void
.end method

.method private setSystemChromeEnabledSystemUIMode(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;)V
    .locals 0

    .line 1
    return-void
.end method

.method private setSystemChromeEnabledSystemUIOverlays(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiOverlay;",
            ">;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method private setSystemChromePreferredOrientations(I)V
    .locals 0

    .line 1
    return-void
.end method

.method private setSystemChromeSystemUIOverlayStyle(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemChromeStyle;)V
    .locals 0

    .line 1
    return-void
.end method

.method private share(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.intent.action.SEND"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    const-string v1, "text/plain"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    const-string v1, "android.intent.extra.TEXT"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->platformChannel:Lio/flutter/embedding/engine/systemchannels/PlatformChannel;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, Lio/flutter/embedding/engine/systemchannels/PlatformChannel;->setPlatformMessageHandler(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$PlatformMessageHandler;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public updateSystemUiOverlays()V
    .locals 0

    .line 1
    return-void
.end method

.method public vibrateHapticFeedback(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$HapticFeedbackType;)V
    .locals 2

    .line 1
    sget-object v0, Lwk0;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-eq p1, v0, :cond_4

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq p1, v1, :cond_3

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    if-eq p1, v0, :cond_2

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-eq p1, v1, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 32
    .line 33
    const/4 p1, 0x6

    .line 34
    invoke-virtual {p0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_3
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_4
    iget-object p0, p0, Lcom/supercell/id/FlutterPanelPlatformPlugin;->view:Lcom/supercell/id/FlutterPanel;

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    invoke-virtual {p0, p1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method
