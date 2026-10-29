.class public final synthetic Lep2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/supercell/titan/TitanWebView;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/supercell/titan/GameApp;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic i:F

.field public final synthetic v:F


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/TitanWebView;ZLcom/supercell/titan/GameApp;FFFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lep2;->a:Lcom/supercell/titan/TitanWebView;

    .line 5
    .line 6
    iput-boolean p2, p0, Lep2;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lep2;->c:Lcom/supercell/titan/GameApp;

    .line 9
    .line 10
    iput p4, p0, Lep2;->d:F

    .line 11
    .line 12
    iput p5, p0, Lep2;->e:F

    .line 13
    .line 14
    iput p6, p0, Lep2;->f:F

    .line 15
    .line 16
    iput p7, p0, Lep2;->i:F

    .line 17
    .line 18
    iput p8, p0, Lep2;->v:F

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lep2;->a:Lcom/supercell/titan/TitanWebView;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->o:Landroid/webkit/WebView;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-boolean v2, v0, Lcom/supercell/titan/TitanWebView;->s:Z

    .line 9
    .line 10
    iget-boolean v3, p0, Lep2;->b:Z

    .line 11
    .line 12
    iget-object v4, p0, Lep2;->c:Lcom/supercell/titan/GameApp;

    .line 13
    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    iget-boolean v2, v0, Lcom/supercell/titan/TitanWebView;->t:Z

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    const/16 p0, 0x8

    .line 23
    .line 24
    invoke-virtual {v1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, Lcom/supercell/titan/TitanWebView;->i:Landroid/widget/LinearLayout;

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    iget v1, v0, Lcom/supercell/titan/TitanWebView;->A:I

    .line 33
    .line 34
    invoke-virtual {v4}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/supercell/titan/GameApp;->getInstance()Lcom/supercell/titan/GameApp;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v2, Lcp2;

    .line 46
    .line 47
    invoke-direct {v2, v0, p0}, Lcp2;-><init>(Lcom/supercell/titan/TitanWebView;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lcom/supercell/titan/GameApp;->runOnView(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_0
    return-void

    .line 54
    :cond_2
    invoke-virtual {v4}, Lcom/supercell/titan/GameApp;->getView()Lcom/supercell/titan/GL2JNISurfaceView;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Lcom/supercell/titan/GL2JNISurfaceView;->getScaleX()F

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-virtual {v4}, Lcom/supercell/titan/GameApp;->getView()Lcom/supercell/titan/GL2JNISurfaceView;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-virtual {v4}, Lcom/supercell/titan/GL2JNISurfaceView;->getScaleY()F

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    new-instance v5, Landroid/view/animation/TranslateAnimation;

    .line 71
    .line 72
    iget v6, p0, Lep2;->d:F

    .line 73
    .line 74
    div-float/2addr v6, v2

    .line 75
    float-to-int v6, v6

    .line 76
    int-to-float v6, v6

    .line 77
    iget v7, p0, Lep2;->e:F

    .line 78
    .line 79
    div-float/2addr v7, v2

    .line 80
    float-to-int v2, v7

    .line 81
    int-to-float v2, v2

    .line 82
    iget v7, p0, Lep2;->f:F

    .line 83
    .line 84
    div-float/2addr v7, v4

    .line 85
    float-to-int v7, v7

    .line 86
    int-to-float v7, v7

    .line 87
    iget v8, p0, Lep2;->i:F

    .line 88
    .line 89
    div-float/2addr v8, v4

    .line 90
    float-to-int v4, v8

    .line 91
    int-to-float v4, v4

    .line 92
    invoke-direct {v5, v6, v2, v7, v4}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 93
    .line 94
    .line 95
    const/high16 v2, 0x447a0000    # 1000.0f

    .line 96
    .line 97
    iget p0, p0, Lep2;->v:F

    .line 98
    .line 99
    mul-float/2addr p0, v2

    .line 100
    float-to-int p0, p0

    .line 101
    int-to-long v6, p0

    .line 102
    invoke-virtual {v5, v6, v7}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 103
    .line 104
    .line 105
    const/4 p0, 0x1

    .line 106
    invoke-virtual {v5, p0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 107
    .line 108
    .line 109
    new-instance p0, Lnp2;

    .line 110
    .line 111
    invoke-direct {p0, v0, v3}, Lnp2;-><init>(Lcom/supercell/titan/TitanWebView;Z)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method
