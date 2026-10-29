.class Lcom/google/android/material/timepicker/TimePickerView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final synthetic h0:I


# instance fields
.field public final g0:Lcom/google/android/material/button/MaterialButtonToggleGroup;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 133
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/timepicker/TimePickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Lcom/google/android/material/timepicker/f;

    .line 5
    .line 6
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    sget p3, Lcom/google/android/material/R$layout;->material_timepicker:I

    .line 14
    .line 15
    invoke-virtual {p1, p3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    sget p1, Lcom/google/android/material/R$id;->material_clock_face:I

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/google/android/material/timepicker/ClockFaceView;

    .line 25
    .line 26
    sget p1, Lcom/google/android/material/R$id;->material_clock_period_toggle:I

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/material/timepicker/TimePickerView;->g0:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 35
    .line 36
    new-instance p3, Lcom/google/android/material/timepicker/g;

    .line 37
    .line 38
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object p1, p1, Lcom/google/android/material/button/MaterialButtonToggleGroup;->c:Ljava/util/LinkedHashSet;

    .line 42
    .line 43
    invoke-virtual {p1, p3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    sget p1, Lcom/google/android/material/R$id;->material_minute_tv:I

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lcom/google/android/material/chip/Chip;

    .line 53
    .line 54
    sget p3, Lcom/google/android/material/R$id;->material_hour_tv:I

    .line 55
    .line 56
    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    check-cast p3, Lcom/google/android/material/chip/Chip;

    .line 61
    .line 62
    sget v0, Lcom/google/android/material/R$id;->material_clock_hand:I

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    check-cast v0, Lcom/google/android/material/timepicker/ClockHandView;

    .line 69
    .line 70
    new-instance v0, Landroid/view/GestureDetector;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    new-instance v1, Lcom/google/android/material/timepicker/h;

    .line 77
    .line 78
    invoke-direct {v1}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 82
    .line 83
    .line 84
    new-instance p0, Lq81;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    invoke-direct {p0, v0, v1}, Lq81;-><init>(Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p3, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 94
    .line 95
    .line 96
    sget p0, Lcom/google/android/material/R$id;->selection_type:I

    .line 97
    .line 98
    const/16 v0, 0xc

    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p1, p0, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    sget p0, Lcom/google/android/material/R$id;->selection_type:I

    .line 108
    .line 109
    const/16 v0, 0xa

    .line 110
    .line 111
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {p3, p0, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 122
    .line 123
    .line 124
    const-string p0, "android.view.View"

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Lcom/google/android/material/chip/Chip;->setAccessibilityClassName(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p3, p0}, Lcom/google/android/material/chip/Chip;->setAccessibilityClassName(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method


# virtual methods
.method public final j()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/timepicker/TimePickerView;->g0:Lcom/google/android/material/button/MaterialButtonToggleGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    new-instance v0, Landroidx/constraintlayout/widget/d;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/constraintlayout/widget/d;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/d;->e(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, Le33;->a:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v1, 0x1

    .line 28
    :goto_0
    sget v2, Lcom/google/android/material/R$id;->material_clock_display:I

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, v0, Landroidx/constraintlayout/widget/d;->f:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Landroidx/constraintlayout/widget/c;

    .line 51
    .line 52
    if-nez v2, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    iget-object v2, v2, Landroidx/constraintlayout/widget/c;->e:Luz;

    .line 56
    .line 57
    const/4 v3, 0x0

    .line 58
    const/high16 v4, -0x80000000

    .line 59
    .line 60
    const/4 v5, -0x1

    .line 61
    packed-switch v1, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    const-string p0, "unknown constraint"

    .line 65
    .line 66
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_0
    const/high16 v1, -0x40800000    # -1.0f

    .line 71
    .line 72
    iput v1, v2, Luz;->C:F

    .line 73
    .line 74
    iput v5, v2, Luz;->B:I

    .line 75
    .line 76
    iput v5, v2, Luz;->A:I

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :pswitch_1
    iput v5, v2, Luz;->v:I

    .line 80
    .line 81
    iput v5, v2, Luz;->w:I

    .line 82
    .line 83
    iput v3, v2, Luz;->K:I

    .line 84
    .line 85
    iput v4, v2, Luz;->R:I

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :pswitch_2
    iput v5, v2, Luz;->t:I

    .line 89
    .line 90
    iput v5, v2, Luz;->u:I

    .line 91
    .line 92
    iput v3, v2, Luz;->L:I

    .line 93
    .line 94
    iput v4, v2, Luz;->S:I

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_3
    iput v5, v2, Luz;->q:I

    .line 98
    .line 99
    iput v5, v2, Luz;->r:I

    .line 100
    .line 101
    iput v5, v2, Luz;->s:I

    .line 102
    .line 103
    iput v3, v2, Luz;->M:I

    .line 104
    .line 105
    iput v4, v2, Luz;->T:I

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :pswitch_4
    iput v5, v2, Luz;->o:I

    .line 109
    .line 110
    iput v5, v2, Luz;->p:I

    .line 111
    .line 112
    iput v3, v2, Luz;->J:I

    .line 113
    .line 114
    iput v4, v2, Luz;->Q:I

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :pswitch_5
    iput v5, v2, Luz;->n:I

    .line 118
    .line 119
    iput v5, v2, Luz;->m:I

    .line 120
    .line 121
    iput v3, v2, Luz;->I:I

    .line 122
    .line 123
    iput v4, v2, Luz;->O:I

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :pswitch_6
    iput v5, v2, Luz;->l:I

    .line 127
    .line 128
    iput v5, v2, Luz;->k:I

    .line 129
    .line 130
    iput v5, v2, Luz;->H:I

    .line 131
    .line 132
    iput v4, v2, Luz;->P:I

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :pswitch_7
    iput v5, v2, Luz;->j:I

    .line 136
    .line 137
    iput v5, v2, Luz;->i:I

    .line 138
    .line 139
    iput v5, v2, Luz;->G:I

    .line 140
    .line 141
    iput v4, v2, Luz;->N:I

    .line 142
    .line 143
    :cond_2
    :goto_1
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/widget/d;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x1
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

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/timepicker/TimePickerView;->j()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    if-ne p1, p0, :cond_0

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/timepicker/TimePickerView;->j()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
