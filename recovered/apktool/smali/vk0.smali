.class public final Lvk0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/flutter/embedding/engine/systemchannels/PlatformChannel$PlatformMessageHandler;


# instance fields
.field public final synthetic a:Lcom/supercell/id/FlutterPanelPlatformPlugin;


# direct methods
.method public constructor <init>(Lcom/supercell/id/FlutterPanelPlatformPlugin;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final clipboardHasStrings()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->a(Lcom/supercell/id/FlutterPanelPlatformPlugin;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getClipboardData(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$ClipboardContentFormat;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->b(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$ClipboardContentFormat;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final playSystemSound(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SoundType;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->c(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SoundType;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final popSystemNavigator()V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->d(Lcom/supercell/id/FlutterPanelPlatformPlugin;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final restoreSystemUiOverlays()V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->e(Lcom/supercell/id/FlutterPanelPlatformPlugin;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setApplicationSwitcherDescription(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$AppSwitcherDescription;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->g(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$AppSwitcherDescription;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setClipboardData(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->f(Lcom/supercell/id/FlutterPanelPlatformPlugin;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPreferredOrientations(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->k(Lcom/supercell/id/FlutterPanelPlatformPlugin;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSystemUiChangeListener()V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->h(Lcom/supercell/id/FlutterPanelPlatformPlugin;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSystemUiOverlayStyle(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemChromeStyle;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->l(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemChromeStyle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final share(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->m(Lcom/supercell/id/FlutterPanelPlatformPlugin;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final showSystemOverlays(Ljava/util/List;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->j(Lcom/supercell/id/FlutterPanelPlatformPlugin;Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final showSystemUiMode(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->i(Lcom/supercell/id/FlutterPanelPlatformPlugin;Lio/flutter/embedding/engine/systemchannels/PlatformChannel$SystemUiMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final vibrateHapticFeedback(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$HapticFeedbackType;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lvk0;->a:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->vibrateHapticFeedback(Lio/flutter/embedding/engine/systemchannels/PlatformChannel$HapticFeedbackType;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
