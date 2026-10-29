.class public final Lh10;
.super Landroidx/recyclerview/widget/o;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final u:Lhk2;

.field public final v:Lhk2;


# direct methods
.method public constructor <init>(Lew2;Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/o;-><init>(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, Lg10;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p2, v1}, Lg10;-><init>(Landroid/view/View;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lh10;->u:Lhk2;

    .line 18
    .line 19
    new-instance v1, Lg10;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-direct {v1, p2, v2}, Lg10;-><init>(Landroid/view/View;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v2, Lg10;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct {v2, p2, v3}, Lg10;-><init>(Landroid/view/View;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, p0, Lh10;->v:Lhk2;

    .line 40
    .line 41
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 49
    .line 50
    const/16 v4, 0x1e

    .line 51
    .line 52
    invoke-static {p0, p1, v4}, Lcom/usercentrics/sdk/ui/components/UCTextView;->i(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lhk2;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 63
    .line 64
    invoke-static {p0, p1, v4}, Lcom/usercentrics/sdk/ui/components/UCTextView;->i(Lcom/usercentrics/sdk/ui/components/UCTextView;Lew2;I)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p1, Lew2;->a:Lwt2;

    .line 68
    .line 69
    iget p1, p0, Lwt2;->j:I

    .line 70
    .line 71
    iget-object p0, p0, Lwt2;->e:Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-virtual {v0}, Lhk2;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    check-cast v0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 89
    .line 90
    .line 91
    :cond_0
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 92
    .line 93
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v3}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 97
    .line 98
    .line 99
    if-eqz p0, :cond_1

    .line 100
    .line 101
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    goto :goto_0

    .line 106
    :cond_1
    const/4 p0, -0x1

    .line 107
    :goto_0
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    const/high16 v2, 0x3f800000    # 1.0f

    .line 118
    .line 119
    invoke-static {v2, p0}, Lyy1;->n(FLandroid/content/Context;)F

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    float-to-int p0, p0

    .line 124
    invoke-virtual {v0, p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Lhk2;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    check-cast p0, Landroid/view/View;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 140
    .line 141
    .line 142
    return-void
.end method
