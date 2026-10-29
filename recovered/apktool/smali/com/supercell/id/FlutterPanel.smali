.class public Lcom/supercell/id/FlutterPanel;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final TAG:Ljava/lang/String; = "FlutterPanel"


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final engine:Lio/flutter/embedding/engine/FlutterEngine;

.field private final flutterSupport:Lcom/supercell/id/FlutterSupport;

.field private final hitTestRects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation
.end field

.field private final hitTestRectsNormalized:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/RectF;",
            ">;"
        }
    .end annotation
.end field

.field private final platformPlugin:Lcom/supercell/id/FlutterPanelPlatformPlugin;

.field private final view:Lio/flutter/embedding/android/FlutterView;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lio/flutter/embedding/engine/FlutterEngine;Lcom/supercell/id/FlutterSupport;)V
    .locals 7

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/supercell/id/FlutterPanel;->hitTestRectsNormalized:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/supercell/id/FlutterPanel;->hitTestRects:Ljava/util/List;

    .line 17
    .line 18
    iput-object p1, p0, Lcom/supercell/id/FlutterPanel;->activity:Landroid/app/Activity;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/supercell/id/FlutterPanel;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 21
    .line 22
    iput-object p3, p0, Lcom/supercell/id/FlutterPanel;->flutterSupport:Lcom/supercell/id/FlutterSupport;

    .line 23
    .line 24
    new-instance p3, Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 25
    .line 26
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformChannel()Lio/flutter/embedding/engine/systemchannels/PlatformChannel;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Ls80;

    .line 31
    .line 32
    const/16 v2, 0x13

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ls80;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p3, p0, v0, v1}, Lcom/supercell/id/FlutterPanelPlatformPlugin;-><init>(Lcom/supercell/id/FlutterPanel;Lio/flutter/embedding/engine/systemchannels/PlatformChannel;Lcom/supercell/id/FlutterPanelPlatformPlugin$PlatformPluginDelegate;)V

    .line 38
    .line 39
    .line 40
    iput-object p3, p0, Lcom/supercell/id/FlutterPanel;->platformPlugin:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 41
    .line 42
    new-instance p3, Lio/flutter/embedding/android/FlutterTextureView;

    .line 43
    .line 44
    invoke-direct {p3, p1}, Lio/flutter/embedding/android/FlutterTextureView;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p3, v0}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Lio/flutter/embedding/android/FlutterView;

    .line 52
    .line 53
    invoke-direct {v2, p1, p3}, Lio/flutter/embedding/android/FlutterView;-><init>(Landroid/content/Context;Lio/flutter/embedding/android/FlutterTextureView;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, Lcom/supercell/id/FlutterPanel;->view:Lio/flutter/embedding/android/FlutterView;

    .line 57
    .line 58
    invoke-virtual {v2, p2}, Lio/flutter/embedding/android/FlutterView;->attachToFlutterEngine(Lio/flutter/embedding/engine/FlutterEngine;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, Lio/flutter/plugin/editing/CustomTextInputPlugin;

    .line 62
    .line 63
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getTextInputChannel()Lio/flutter/embedding/engine/systemchannels/TextInputChannel;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getScribeChannel()Lio/flutter/embedding/engine/systemchannels/ScribeChannel;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformViewsController()Lio/flutter/plugin/platform/PlatformViewsController;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformViewsController2()Lio/flutter/plugin/platform/PlatformViewsController2;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-direct/range {v1 .. v6}, Lio/flutter/plugin/editing/CustomTextInputPlugin;-><init>(Landroid/view/View;Lio/flutter/embedding/engine/systemchannels/TextInputChannel;Lio/flutter/embedding/engine/systemchannels/ScribeChannel;Lio/flutter/plugin/platform/PlatformViewsController;Lio/flutter/plugin/platform/PlatformViewsController2;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformViewsController()Lio/flutter/plugin/platform/PlatformViewsController;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    invoke-virtual {p3}, Lio/flutter/plugin/platform/PlatformViewsController;->detachTextInputPlugin()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lio/flutter/embedding/engine/FlutterEngine;->getPlatformViewsController()Lio/flutter/plugin/platform/PlatformViewsController;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p2, v1}, Lio/flutter/plugin/platform/PlatformViewsController;->attachTextInputPlugin(Lio/flutter/plugin/editing/TextInputPlugin;)V

    .line 94
    .line 95
    .line 96
    :try_start_0
    const-class p2, Lio/flutter/embedding/android/FlutterView;

    .line 97
    .line 98
    const-string p3, "textInputPlugin"

    .line 99
    .line 100
    invoke-virtual {p2, p3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    const/4 p3, 0x1

    .line 105
    invoke-virtual {p2, p3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v2, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    .line 111
    :catch_0
    iget-object p2, p0, Lcom/supercell/id/FlutterPanel;->view:Lio/flutter/embedding/android/FlutterView;

    .line 112
    .line 113
    new-instance p3, Landroid/view/ViewGroup$LayoutParams;

    .line 114
    .line 115
    const/4 v0, -0x1

    .line 116
    invoke-direct {p3, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    invoke-virtual {p0, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    .line 131
    .line 132
    const v4, 0x10120

    .line 133
    .line 134
    .line 135
    const/4 v5, -0x3

    .line 136
    const/4 v1, -0x1

    .line 137
    const/4 v2, -0x1

    .line 138
    const/16 v3, 0x3e8

    .line 139
    .line 140
    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 141
    .line 142
    .line 143
    const/16 p3, 0x10

    .line 144
    .line 145
    iput p3, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 146
    .line 147
    const p3, 0x800033

    .line 148
    .line 149
    .line 150
    iput p3, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 151
    .line 152
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 153
    .line 154
    const/16 v1, 0x1c

    .line 155
    .line 156
    if-lt p3, v1, :cond_0

    .line 157
    .line 158
    invoke-static {v0}, Lsk0;->t(Landroid/view/WindowManager$LayoutParams;)V

    .line 159
    .line 160
    .line 161
    :cond_0
    invoke-interface {p2, p0, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    .line 163
    .line 164
    iget-object p0, p0, Lcom/supercell/id/FlutterPanel;->view:Lio/flutter/embedding/android/FlutterView;

    .line 165
    .line 166
    invoke-static {p0, p1}, Lcom/supercell/id/FlutterPanel;->setSystemUiVisibility(Landroid/view/View;Landroid/app/Activity;)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public static synthetic a()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/supercell/id/FlutterPanel;->lambda$new$0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method private hitTest(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iget-object p0, p0, Lcom/supercell/id/FlutterPanel;->hitTestRects:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroid/graphics/RectF;

    .line 26
    .line 27
    invoke-virtual {v1, v0, p1}, Landroid/graphics/RectF;->contains(FF)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method private static synthetic lambda$new$0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public static setSystemUiVisibility(Landroid/view/View;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getWindowSystemUiVisibility()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    or-int/lit16 p1, p1, 0x700

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private updateHitTestRects(II)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->hitTestRects:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->hitTestRectsNormalized:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/graphics/RectF;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/supercell/id/FlutterPanel;->hitTestRects:Ljava/util/List;

    .line 25
    .line 26
    new-instance v3, Landroid/graphics/RectF;

    .line 27
    .line 28
    iget v4, v1, Landroid/graphics/RectF;->left:F

    .line 29
    .line 30
    int-to-float v5, p1

    .line 31
    mul-float/2addr v4, v5

    .line 32
    iget v6, v1, Landroid/graphics/RectF;->top:F

    .line 33
    .line 34
    int-to-float v7, p2

    .line 35
    mul-float/2addr v6, v7

    .line 36
    iget v8, v1, Landroid/graphics/RectF;->right:F

    .line 37
    .line 38
    mul-float/2addr v8, v5

    .line 39
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 40
    .line 41
    mul-float/2addr v1, v7

    .line 42
    invoke-direct {v3, v4, v6, v8, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->view:Lio/flutter/embedding/android/FlutterView;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/flutter/embedding/android/FlutterView;->detachFromFlutterEngine()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    move-exception v0

    .line 8
    sget-object v1, Lcom/supercell/id/FlutterPanel;->TAG:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "detachFromFlutterEngine failed"

    .line 11
    .line 12
    invoke-static {v1, v2, v0}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 13
    .line 14
    .line 15
    :goto_0
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->activity:Landroid/app/Activity;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0, p0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanel;->hitTest(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/supercell/id/FlutterPanel;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Activity;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1, p0, v0, p0}, Landroid/view/KeyEvent;->dispatch(Landroid/view/KeyEvent$Callback;Landroid/view/KeyEvent$DispatcherState;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanel;->hitTest(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/supercell/id/FlutterPanel;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Activity;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/supercell/id/FlutterPanel;->hitTest(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/supercell/id/FlutterPanel;->activity:Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/app/Activity;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->flutterSupport:Lcom/supercell/id/FlutterSupport;

    .line 5
    .line 6
    iget-object p0, p0, Lcom/supercell/id/FlutterPanel;->activity:Landroid/app/Activity;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/supercell/id/FlutterSupport;->onPanelResumed(Landroid/app/Activity;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/id/FlutterPanel;->engine:Lio/flutter/embedding/engine/FlutterEngine;

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/flutter/embedding/engine/FlutterEngine;->getNavigationChannel()Lio/flutter/embedding/engine/systemchannels/NavigationChannel;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lio/flutter/embedding/engine/systemchannels/NavigationChannel;->popRoute()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->platformPlugin:Lcom/supercell/id/FlutterPanelPlatformPlugin;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/supercell/id/FlutterPanelPlatformPlugin;->destroy()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->view:Lio/flutter/embedding/android/FlutterView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lio/flutter/embedding/android/FlutterView;->detachFromFlutterEngine()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->flutterSupport:Lcom/supercell/id/FlutterSupport;

    .line 15
    .line 16
    iget-object p0, p0, Lcom/supercell/id/FlutterPanel;->activity:Landroid/app/Activity;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lcom/supercell/id/FlutterSupport;->onPanelPaused(Landroid/app/Activity;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p0, 0x4

    .line 2
    if-eq p1, p0, :cond_1

    .line 3
    .line 4
    const/16 p0, 0x6f

    .line 5
    .line 6
    if-ne p1, p0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    :goto_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->startTracking()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    const/16 v0, 0x6f

    .line 5
    .line 6
    if-ne p1, v0, :cond_1

    .line 7
    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/supercell/id/FlutterPanel;->onBackPressed()V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Lcom/supercell/id/FlutterPanel;->updateHitTestRects(II)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setHitTestRects([F)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/supercell/id/FlutterPanel;->hitTestRectsNormalized:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    :goto_0
    add-int/lit8 v1, v0, 0x3

    .line 8
    .line 9
    array-length v2, p1

    .line 10
    if-ge v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lcom/supercell/id/FlutterPanel;->hitTestRectsNormalized:Ljava/util/List;

    .line 13
    .line 14
    new-instance v3, Landroid/graphics/RectF;

    .line 15
    .line 16
    aget v4, p1, v0

    .line 17
    .line 18
    add-int/lit8 v5, v0, 0x1

    .line 19
    .line 20
    aget v5, p1, v5

    .line 21
    .line 22
    add-int/lit8 v6, v0, 0x2

    .line 23
    .line 24
    aget v6, p1, v6

    .line 25
    .line 26
    aget v1, p1, v1

    .line 27
    .line 28
    invoke-direct {v3, v4, v5, v6, v1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-direct {p0, p1, v0}, Lcom/supercell/id/FlutterPanel;->updateHitTestRects(II)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
