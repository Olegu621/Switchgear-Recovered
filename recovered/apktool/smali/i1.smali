.class public final synthetic Li1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, Li1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Li1;->b:Landroid/view/View;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Li1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Li1;->b:Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->e0:I

    .line 9
    .line 10
    invoke-static {p0}, Lxe2;->c(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x1

    .line 41
    const/high16 v3, 0x42400000    # 48.0f

    .line 42
    .line 43
    invoke-static {v2, v3, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 48
    .line 49
    iget v4, v0, Landroid/graphics/Rect;->top:I

    .line 50
    .line 51
    sub-int v5, v3, v4

    .line 52
    .line 53
    int-to-float v5, v5

    .line 54
    cmpl-float v6, v1, v5

    .line 55
    .line 56
    const/high16 v7, 0x40000000    # 2.0f

    .line 57
    .line 58
    if-lez v6, :cond_0

    .line 59
    .line 60
    sub-float v5, v1, v5

    .line 61
    .line 62
    div-float/2addr v5, v7

    .line 63
    float-to-int v5, v5

    .line 64
    add-int/2addr v5, v2

    .line 65
    sub-int/2addr v4, v5

    .line 66
    iput v4, v0, Landroid/graphics/Rect;->top:I

    .line 67
    .line 68
    add-int/2addr v3, v5

    .line 69
    iput v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 70
    .line 71
    :cond_0
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 72
    .line 73
    iget v4, v0, Landroid/graphics/Rect;->left:I

    .line 74
    .line 75
    sub-int v5, v3, v4

    .line 76
    .line 77
    int-to-float v5, v5

    .line 78
    cmpl-float v6, v1, v5

    .line 79
    .line 80
    if-lez v6, :cond_1

    .line 81
    .line 82
    sub-float/2addr v1, v5

    .line 83
    div-float/2addr v1, v7

    .line 84
    float-to-int v1, v1

    .line 85
    add-int/2addr v1, v2

    .line 86
    sub-int/2addr v4, v1

    .line 87
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 88
    .line 89
    add-int/2addr v3, v1

    .line 90
    iput v3, v0, Landroid/graphics/Rect;->right:I

    .line 91
    .line 92
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    instance-of v2, v1, Landroid/view/View;

    .line 97
    .line 98
    if-eqz v2, :cond_2

    .line 99
    .line 100
    check-cast v1, Landroid/view/View;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    const/4 v1, 0x0

    .line 104
    :goto_0
    if-eqz v1, :cond_3

    .line 105
    .line 106
    new-instance v2, Landroid/view/TouchDelegate;

    .line 107
    .line 108
    invoke-direct {v2, v0, p0}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v2}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    return-void

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
