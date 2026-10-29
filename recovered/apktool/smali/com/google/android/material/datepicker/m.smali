.class public final Lcom/google/android/material/datepicker/m;
.super Landroidx/fragment/app/i;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/fragment/app/i;"
    }
.end annotation


# instance fields
.field public final b0:Ljava/util/LinkedHashSet;

.field public final c0:Ljava/util/LinkedHashSet;

.field public final d0:Ljava/util/LinkedHashSet;

.field public final e0:Ljava/util/LinkedHashSet;

.field public f0:I

.field public g0:Lcom/google/android/material/datepicker/DateSelector;

.field public h0:Lzr1;

.field public i0:Lcom/google/android/material/datepicker/CalendarConstraints;

.field public j0:Lcom/google/android/material/datepicker/l;

.field public k0:I

.field public l0:Ljava/lang/CharSequence;

.field public m0:Z

.field public n0:I

.field public o0:I

.field public p0:Ljava/lang/CharSequence;

.field public q0:I

.field public r0:Ljava/lang/CharSequence;

.field public s0:Landroid/widget/TextView;

.field public t0:Lcom/google/android/material/internal/CheckableImageButton;

.field public u0:Lfd1;

.field public v0:Landroid/widget/Button;

.field public w0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->b0:Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->c0:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->d0:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->e0:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    return-void
.end method

.method public static j(Landroid/content/Context;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget v0, Lcom/google/android/material/R$dimen;->mtrl_calendar_content_padding:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-instance v1, Lcom/google/android/material/datepicker/Month;

    .line 12
    .line 13
    invoke-static {}, Lh13;->e()Ljava/util/Calendar;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2}, Lcom/google/android/material/datepicker/Month;-><init>(Ljava/util/Calendar;)V

    .line 18
    .line 19
    .line 20
    sget v2, Lcom/google/android/material/R$dimen;->mtrl_calendar_day_width:I

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sget v3, Lcom/google/android/material/R$dimen;->mtrl_calendar_month_horizontal_padding:I

    .line 27
    .line 28
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    mul-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    iget v1, v1, Lcom/google/android/material/datepicker/Month;->d:I

    .line 35
    .line 36
    mul-int/2addr v2, v1

    .line 37
    add-int/2addr v2, v0

    .line 38
    add-int/lit8 v1, v1, -0x1

    .line 39
    .line 40
    mul-int/2addr v1, p0

    .line 41
    add-int/2addr v1, v2

    .line 42
    return v1
.end method

.method public static k(Landroid/content/Context;I)Z
    .locals 2

    .line 1
    sget v0, Lcom/google/android/material/R$attr;->materialCalendarStyle:I

    .line 2
    .line 3
    const-class v1, Lcom/google/android/material/datepicker/l;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {p0, v1, v0}, Lyy1;->D(Landroid/content/Context;Ljava/lang/String;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    filled-new-array {p1}, [I

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 27
    .line 28
    .line 29
    return p1
.end method


# virtual methods
.method public final h()Landroid/app/Dialog;
    .locals 7

    .line 1
    new-instance v0, Landroid/app/Dialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget v3, p0, Lcom/google/android/material/datepicker/m;->f0:I

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->i()Lcom/google/android/material/datepicker/DateSelector;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-interface {v3, v2}, Lcom/google/android/material/datepicker/DateSelector;->B0(Landroid/content/Context;)I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    :goto_0
    invoke-direct {v0, v1, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const v2, 0x101020d

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2}, Lcom/google/android/material/datepicker/m;->k(Landroid/content/Context;I)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iput-boolean v2, p0, Lcom/google/android/material/datepicker/m;->m0:Z

    .line 39
    .line 40
    sget v2, Lcom/google/android/material/R$attr;->colorSurface:I

    .line 41
    .line 42
    const-class v3, Lcom/google/android/material/datepicker/m;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v1, v3, v2}, Lyy1;->D(Landroid/content/Context;Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    new-instance v3, Lfd1;

    .line 53
    .line 54
    sget v4, Lcom/google/android/material/R$attr;->materialCalendarStyle:I

    .line 55
    .line 56
    sget v5, Lcom/google/android/material/R$style;->Widget_MaterialComponents_MaterialCalendar:I

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct {v3, v1, v6, v4, v5}, Lfd1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 60
    .line 61
    .line 62
    iput-object v3, p0, Lcom/google/android/material/datepicker/m;->u0:Lfd1;

    .line 63
    .line 64
    invoke-virtual {v3, v1}, Lfd1;->k(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->u0:Lfd1;

    .line 68
    .line 69
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v1, v2}, Lfd1;->n(Landroid/content/res/ColorStateList;)V

    .line 74
    .line 75
    .line 76
    iget-object p0, p0, Lcom/google/android/material/datepicker/m;->u0:Lfd1;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    sget-object v2, Le33;->a:Ljava/util/WeakHashMap;

    .line 87
    .line 88
    invoke-static {v1}, Ls23;->i(Landroid/view/View;)F

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-virtual {p0, v1}, Lfd1;->m(F)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

.method public final i()Lcom/google/android/material/datepicker/DateSelector;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->g0:Lcom/google/android/material/datepicker/DateSelector;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "DATE_SELECTOR_KEY"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/google/android/material/datepicker/DateSelector;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->g0:Lcom/google/android/material/datepicker/DateSelector;

    .line 18
    .line 19
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/datepicker/m;->g0:Lcom/google/android/material/datepicker/DateSelector;

    .line 20
    .line 21
    return-object p0
.end method

.method public final l()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/google/android/material/datepicker/m;->f0:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->i()Lcom/google/android/material/datepicker/DateSelector;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v1, v0}, Lcom/google/android/material/datepicker/DateSelector;->B0(Landroid/content/Context;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->i()Lcom/google/android/material/datepicker/DateSelector;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->i0:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 23
    .line 24
    new-instance v3, Lcom/google/android/material/datepicker/l;

    .line 25
    .line 26
    invoke-direct {v3}, Lcom/google/android/material/datepicker/l;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v4, Landroid/os/Bundle;

    .line 30
    .line 31
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v5, "THEME_RES_ID_KEY"

    .line 35
    .line 36
    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    const-string v6, "GRID_SELECTOR_KEY"

    .line 40
    .line 41
    invoke-virtual {v4, v6, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 42
    .line 43
    .line 44
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 45
    .line 46
    invoke-virtual {v4, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    const-string v6, "CURRENT_MONTH_KEY"

    .line 50
    .line 51
    iget-object v2, v2, Lcom/google/android/material/datepicker/CalendarConstraints;->d:Lcom/google/android/material/datepicker/Month;

    .line 52
    .line 53
    invoke-virtual {v4, v6, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 57
    .line 58
    .line 59
    iput-object v3, p0, Lcom/google/android/material/datepicker/m;->j0:Lcom/google/android/material/datepicker/l;

    .line 60
    .line 61
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 62
    .line 63
    iget-boolean v2, v2, Lcom/google/android/material/internal/CheckableImageButton;->d:Z

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->i()Lcom/google/android/material/datepicker/DateSelector;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object v3, p0, Lcom/google/android/material/datepicker/m;->i0:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 72
    .line 73
    new-instance v4, Lgd1;

    .line 74
    .line 75
    invoke-direct {v4}, Lgd1;-><init>()V

    .line 76
    .line 77
    .line 78
    new-instance v6, Landroid/os/Bundle;

    .line 79
    .line 80
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, v5, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    const-string v1, "DATE_SELECTOR_KEY"

    .line 87
    .line 88
    invoke-virtual {v6, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6, v0, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4, v6}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 95
    .line 96
    .line 97
    move-object v3, v4

    .line 98
    :cond_1
    iput-object v3, p0, Lcom/google/android/material/datepicker/m;->h0:Lzr1;

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->m()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/w;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v1, Landroidx/fragment/app/a;

    .line 111
    .line 112
    invoke-direct {v1, v0}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/w;)V

    .line 113
    .line 114
    .line 115
    sget v0, Lcom/google/android/material/R$id;->mtrl_calendar_frame:I

    .line 116
    .line 117
    iget-object v2, p0, Lcom/google/android/material/datepicker/m;->h0:Lzr1;

    .line 118
    .line 119
    if-eqz v0, :cond_3

    .line 120
    .line 121
    const/4 v3, 0x2

    .line 122
    const/4 v4, 0x0

    .line 123
    invoke-virtual {v1, v0, v2, v4, v3}, Landroidx/fragment/app/a;->e(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    iget-boolean v0, v1, Landroidx/fragment/app/a;->g:Z

    .line 127
    .line 128
    if-nez v0, :cond_2

    .line 129
    .line 130
    const/4 v0, 0x0

    .line 131
    iput-boolean v0, v1, Landroidx/fragment/app/a;->h:Z

    .line 132
    .line 133
    iget-object v2, v1, Landroidx/fragment/app/a;->q:Landroidx/fragment/app/w;

    .line 134
    .line 135
    invoke-virtual {v2, v1, v0}, Landroidx/fragment/app/w;->A(Landroidx/fragment/app/a;Z)V

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->h0:Lzr1;

    .line 139
    .line 140
    new-instance v2, Ldd1;

    .line 141
    .line 142
    invoke-direct {v2, p0, v0}, Ldd1;-><init>(Landroidx/fragment/app/Fragment;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v2}, Lzr1;->g(Ldd1;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_2
    const-string p0, "This transaction is already being added to the back stack"

    .line 150
    .line 151
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_3
    const-string p0, "Must use non-zero containerViewId"

    .line 156
    .line 157
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->i()Lcom/google/android/material/datepicker/DateSelector;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Lcom/google/android/material/datepicker/DateSelector;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->s0:Landroid/widget/TextView;

    .line 14
    .line 15
    sget v2, Lcom/google/android/material/R$string;->mtrl_picker_announce_current_selection:I

    .line 16
    .line 17
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lcom/google/android/material/datepicker/m;->s0:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final n(Lcom/google/android/material/internal/CheckableImageButton;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 2
    .line 3
    iget-boolean v0, v0, Lcom/google/android/material/internal/CheckableImageButton;->d:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget v0, Lcom/google/android/material/R$string;->mtrl_picker_toggle_to_calendar_input_mode:I

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget v0, Lcom/google/android/material/R$string;->mtrl_picker_toggle_to_text_input_mode:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    iget-object p0, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/m;->d0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/content/DialogInterface$OnCancelListener;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/i;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :cond_0
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iput v0, p0, Lcom/google/android/material/datepicker/m;->f0:I

    .line 17
    .line 18
    const-string v0, "DATE_SELECTOR_KEY"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/google/android/material/datepicker/DateSelector;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->g0:Lcom/google/android/material/datepicker/DateSelector;

    .line 27
    .line 28
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 35
    .line 36
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->i0:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 37
    .line 38
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iput v0, p0, Lcom/google/android/material/datepicker/m;->k0:I

    .line 45
    .line 46
    const-string v0, "TITLE_TEXT_KEY"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->l0:Ljava/lang/CharSequence;

    .line 53
    .line 54
    const-string v0, "INPUT_MODE_KEY"

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, Lcom/google/android/material/datepicker/m;->n0:I

    .line 61
    .line 62
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iput v0, p0, Lcom/google/android/material/datepicker/m;->o0:I

    .line 69
    .line 70
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, Lcom/google/android/material/datepicker/m;->p0:Ljava/lang/CharSequence;

    .line 77
    .line 78
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iput v0, p0, Lcom/google/android/material/datepicker/m;->q0:I

    .line 85
    .line 86
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Lcom/google/android/material/datepicker/m;->r0:Ljava/lang/CharSequence;

    .line 93
    .line 94
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 1
    iget-boolean p3, p0, Lcom/google/android/material/datepicker/m;->m0:Z

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget p3, Lcom/google/android/material/R$layout;->mtrl_picker_fullscreen:I

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget p3, Lcom/google/android/material/R$layout;->mtrl_picker_dialog:I

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p1, p3, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-boolean p3, p0, Lcom/google/android/material/datepicker/m;->m0:Z

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    sget p3, Lcom/google/android/material/R$id;->mtrl_calendar_frame:I

    .line 23
    .line 24
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 29
    .line 30
    invoke-static {p2}, Lcom/google/android/material/datepicker/m;->j(Landroid/content/Context;)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, -0x2

    .line 35
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    sget p3, Lcom/google/android/material/R$id;->mtrl_calendar_main_pane:I

    .line 43
    .line 44
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 49
    .line 50
    invoke-static {p2}, Lcom/google/android/material/datepicker/m;->j(Landroid/content/Context;)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v2, -0x1

    .line 55
    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    sget p3, Lcom/google/android/material/R$id;->mtrl_picker_header_selection_text:I

    .line 62
    .line 63
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    check-cast p3, Landroid/widget/TextView;

    .line 68
    .line 69
    iput-object p3, p0, Lcom/google/android/material/datepicker/m;->s0:Landroid/widget/TextView;

    .line 70
    .line 71
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 72
    .line 73
    const/4 v0, 0x1

    .line 74
    invoke-virtual {p3, v0}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 75
    .line 76
    .line 77
    sget p3, Lcom/google/android/material/R$id;->mtrl_picker_header_toggle:I

    .line 78
    .line 79
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p3

    .line 83
    check-cast p3, Lcom/google/android/material/internal/CheckableImageButton;

    .line 84
    .line 85
    iput-object p3, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 86
    .line 87
    sget p3, Lcom/google/android/material/R$id;->mtrl_picker_title_text:I

    .line 88
    .line 89
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    check-cast p3, Landroid/widget/TextView;

    .line 94
    .line 95
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->l0:Ljava/lang/CharSequence;

    .line 96
    .line 97
    if-eqz v1, :cond_2

    .line 98
    .line 99
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    iget v1, p0, Lcom/google/android/material/datepicker/m;->k0:I

    .line 104
    .line 105
    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setText(I)V

    .line 106
    .line 107
    .line 108
    :goto_2
    iget-object p3, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 109
    .line 110
    const-string v1, "TOGGLE_BUTTON_TAG"

    .line 111
    .line 112
    invoke-virtual {p3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object p3, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 116
    .line 117
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    .line 118
    .line 119
    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 120
    .line 121
    .line 122
    const v2, 0x10100a0

    .line 123
    .line 124
    .line 125
    filled-new-array {v2}, [I

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    sget v3, Lcom/google/android/material/R$drawable;->material_ic_calendar_black_24dp:I

    .line 130
    .line 131
    invoke-static {p2, v3}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 136
    .line 137
    .line 138
    const/4 v2, 0x0

    .line 139
    new-array v3, v2, [I

    .line 140
    .line 141
    sget v4, Lcom/google/android/material/R$drawable;->material_ic_edit_black_24dp:I

    .line 142
    .line 143
    invoke-static {p2, v4}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-virtual {v1, v3, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p3, v1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 151
    .line 152
    .line 153
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 154
    .line 155
    iget p3, p0, Lcom/google/android/material/datepicker/m;->n0:I

    .line 156
    .line 157
    if-eqz p3, :cond_3

    .line 158
    .line 159
    move p3, v0

    .line 160
    goto :goto_3

    .line 161
    :cond_3
    move p3, v2

    .line 162
    :goto_3
    invoke-virtual {p2, p3}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    .line 163
    .line 164
    .line 165
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 166
    .line 167
    const/4 p3, 0x0

    .line 168
    invoke-static {p2, p3}, Le33;->n(Landroid/view/View;Lt0;)V

    .line 169
    .line 170
    .line 171
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 172
    .line 173
    invoke-virtual {p0, p2}, Lcom/google/android/material/datepicker/m;->n(Lcom/google/android/material/internal/CheckableImageButton;)V

    .line 174
    .line 175
    .line 176
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->t0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 177
    .line 178
    new-instance p3, Lbd1;

    .line 179
    .line 180
    const/4 v1, 0x2

    .line 181
    invoke-direct {p3, p0, v1}, Lbd1;-><init>(Lcom/google/android/material/datepicker/m;I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    .line 186
    .line 187
    sget p2, Lcom/google/android/material/R$id;->confirm_button:I

    .line 188
    .line 189
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    check-cast p2, Landroid/widget/Button;

    .line 194
    .line 195
    iput-object p2, p0, Lcom/google/android/material/datepicker/m;->v0:Landroid/widget/Button;

    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->i()Lcom/google/android/material/datepicker/DateSelector;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    invoke-interface {p2}, Lcom/google/android/material/datepicker/DateSelector;->J0()Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    iget-object p3, p0, Lcom/google/android/material/datepicker/m;->v0:Landroid/widget/Button;

    .line 206
    .line 207
    if-eqz p2, :cond_4

    .line 208
    .line 209
    invoke-virtual {p3, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_4
    invoke-virtual {p3, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 214
    .line 215
    .line 216
    :goto_4
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->v0:Landroid/widget/Button;

    .line 217
    .line 218
    const-string p3, "CONFIRM_BUTTON_TAG"

    .line 219
    .line 220
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->p0:Ljava/lang/CharSequence;

    .line 224
    .line 225
    if-eqz p2, :cond_5

    .line 226
    .line 227
    iget-object p3, p0, Lcom/google/android/material/datepicker/m;->v0:Landroid/widget/Button;

    .line 228
    .line 229
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_5
    iget p2, p0, Lcom/google/android/material/datepicker/m;->o0:I

    .line 234
    .line 235
    if-eqz p2, :cond_6

    .line 236
    .line 237
    iget-object p3, p0, Lcom/google/android/material/datepicker/m;->v0:Landroid/widget/Button;

    .line 238
    .line 239
    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(I)V

    .line 240
    .line 241
    .line 242
    :cond_6
    :goto_5
    iget-object p2, p0, Lcom/google/android/material/datepicker/m;->v0:Landroid/widget/Button;

    .line 243
    .line 244
    new-instance p3, Lbd1;

    .line 245
    .line 246
    invoke-direct {p3, p0, v2}, Lbd1;-><init>(Lcom/google/android/material/datepicker/m;I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 250
    .line 251
    .line 252
    sget p2, Lcom/google/android/material/R$id;->cancel_button:I

    .line 253
    .line 254
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    check-cast p2, Landroid/widget/Button;

    .line 259
    .line 260
    const-string p3, "CANCEL_BUTTON_TAG"

    .line 261
    .line 262
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object p3, p0, Lcom/google/android/material/datepicker/m;->r0:Ljava/lang/CharSequence;

    .line 266
    .line 267
    if-eqz p3, :cond_7

    .line 268
    .line 269
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_7
    iget p3, p0, Lcom/google/android/material/datepicker/m;->q0:I

    .line 274
    .line 275
    if-eqz p3, :cond_8

    .line 276
    .line 277
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 278
    .line 279
    .line 280
    :cond_8
    :goto_6
    new-instance p3, Lbd1;

    .line 281
    .line 282
    invoke-direct {p3, p0, v0}, Lbd1;-><init>(Lcom/google/android/material/datepicker/m;I)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 286
    .line 287
    .line 288
    return-object p1
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->e0:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-super {p0, p1}, Landroidx/fragment/app/i;->onDismiss(Landroid/content/DialogInterface;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/i;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const-string v0, "OVERRIDE_THEME_RES_ID"

    .line 5
    .line 6
    iget v1, p0, Lcom/google/android/material/datepicker/m;->f0:I

    .line 7
    .line 8
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const-string v0, "DATE_SELECTOR_KEY"

    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->g0:Lcom/google/android/material/datepicker/DateSelector;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/google/android/material/datepicker/b;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->i0:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v2, Lcom/google/android/material/datepicker/DateValidatorPointForward;

    .line 26
    .line 27
    const-wide/high16 v3, -0x8000000000000000L

    .line 28
    .line 29
    invoke-direct {v2, v3, v4}, Lcom/google/android/material/datepicker/DateValidatorPointForward;-><init>(J)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v0, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 33
    .line 34
    iget-object v2, v1, Lcom/google/android/material/datepicker/CalendarConstraints;->a:Lcom/google/android/material/datepicker/Month;

    .line 35
    .line 36
    iget-wide v2, v2, Lcom/google/android/material/datepicker/Month;->f:J

    .line 37
    .line 38
    iget-object v4, v1, Lcom/google/android/material/datepicker/CalendarConstraints;->b:Lcom/google/android/material/datepicker/Month;

    .line 39
    .line 40
    iget-wide v4, v4, Lcom/google/android/material/datepicker/Month;->f:J

    .line 41
    .line 42
    iget-object v6, v1, Lcom/google/android/material/datepicker/CalendarConstraints;->d:Lcom/google/android/material/datepicker/Month;

    .line 43
    .line 44
    iget-wide v6, v6, Lcom/google/android/material/datepicker/Month;->f:J

    .line 45
    .line 46
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    iput-object v6, v0, Lcom/google/android/material/datepicker/b;->a:Ljava/lang/Long;

    .line 51
    .line 52
    iget-object v1, v1, Lcom/google/android/material/datepicker/CalendarConstraints;->c:Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 53
    .line 54
    iput-object v1, v0, Lcom/google/android/material/datepicker/b;->b:Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 55
    .line 56
    iget-object v6, p0, Lcom/google/android/material/datepicker/m;->j0:Lcom/google/android/material/datepicker/l;

    .line 57
    .line 58
    iget-object v6, v6, Lcom/google/android/material/datepicker/l;->e:Lcom/google/android/material/datepicker/Month;

    .line 59
    .line 60
    if-eqz v6, :cond_0

    .line 61
    .line 62
    iget-wide v6, v6, Lcom/google/android/material/datepicker/Month;->f:J

    .line 63
    .line 64
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    iput-object v6, v0, Lcom/google/android/material/datepicker/b;->a:Ljava/lang/Long;

    .line 69
    .line 70
    :cond_0
    new-instance v6, Landroid/os/Bundle;

    .line 71
    .line 72
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v7, "DEEP_COPY_VALIDATOR_KEY"

    .line 76
    .line 77
    invoke-virtual {v6, v7, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 81
    .line 82
    invoke-static {v2, v3}, Lcom/google/android/material/datepicker/Month;->d(J)Lcom/google/android/material/datepicker/Month;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v4, v5}, Lcom/google/android/material/datepicker/Month;->d(J)Lcom/google/android/material/datepicker/Month;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v6, v7}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 95
    .line 96
    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->a:Ljava/lang/Long;

    .line 97
    .line 98
    if-nez v0, :cond_1

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    goto :goto_0

    .line 102
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    invoke-static {v5, v6}, Lcom/google/android/material/datepicker/Month;->d(J)Lcom/google/android/material/datepicker/Month;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    :goto_0
    invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/android/material/datepicker/CalendarConstraints;-><init>(Lcom/google/android/material/datepicker/Month;Lcom/google/android/material/datepicker/Month;Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;Lcom/google/android/material/datepicker/Month;)V

    .line 111
    .line 112
    .line 113
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 114
    .line 115
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 116
    .line 117
    .line 118
    const-string v0, "TITLE_TEXT_RES_ID_KEY"

    .line 119
    .line 120
    iget v1, p0, Lcom/google/android/material/datepicker/m;->k0:I

    .line 121
    .line 122
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    const-string v0, "TITLE_TEXT_KEY"

    .line 126
    .line 127
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->l0:Ljava/lang/CharSequence;

    .line 128
    .line 129
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    const-string v0, "POSITIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 133
    .line 134
    iget v1, p0, Lcom/google/android/material/datepicker/m;->o0:I

    .line 135
    .line 136
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    const-string v0, "POSITIVE_BUTTON_TEXT_KEY"

    .line 140
    .line 141
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->p0:Ljava/lang/CharSequence;

    .line 142
    .line 143
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 144
    .line 145
    .line 146
    const-string v0, "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"

    .line 147
    .line 148
    iget v1, p0, Lcom/google/android/material/datepicker/m;->q0:I

    .line 149
    .line 150
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 151
    .line 152
    .line 153
    const-string v0, "NEGATIVE_BUTTON_TEXT_KEY"

    .line 154
    .line 155
    iget-object p0, p0, Lcom/google/android/material/datepicker/m;->r0:Ljava/lang/CharSequence;

    .line 156
    .line 157
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final onStart()V
    .locals 12

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/i;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/i;->W:Landroid/app/Dialog;

    .line 5
    .line 6
    const-string v1, " does not have a Dialog."

    .line 7
    .line 8
    const-string v2, "DialogFragment "

    .line 9
    .line 10
    if-eqz v0, :cond_f

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-boolean v3, p0, Lcom/google/android/material/datepicker/m;->m0:Z

    .line 17
    .line 18
    if-eqz v3, :cond_d

    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/material/datepicker/m;->u0:Lfd1;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/google/android/material/datepicker/m;->w0:Z

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    goto/16 :goto_9

    .line 34
    .line 35
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget v2, Lcom/google/android/material/R$id;->fullscreen_header:I

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    instance-of v2, v2, Landroid/graphics/drawable/ColorDrawable;

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, Landroid/graphics/drawable/ColorDrawable;

    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    const/4 v2, 0x0

    .line 69
    :goto_0
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x1

    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move v5, v3

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :goto_1
    move v5, v4

    .line 83
    :goto_2
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    const v7, 0x1010031

    .line 88
    .line 89
    .line 90
    const/high16 v8, -0x1000000

    .line 91
    .line 92
    invoke-static {v6, v7, v8}, Lxe2;->r(Landroid/content/Context;II)I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v5, :cond_4

    .line 97
    .line 98
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    :cond_4
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 103
    .line 104
    const/16 v7, 0x1e

    .line 105
    .line 106
    if-lt v5, v7, :cond_5

    .line 107
    .line 108
    invoke-static {v0, v3}, Lq73;->a(Landroid/view/Window;Z)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-virtual {v9}, Landroid/view/View;->getSystemUiVisibility()I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    or-int/lit16 v10, v10, 0x700

    .line 121
    .line 122
    invoke-virtual {v9, v10}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    const/16 v10, 0x1b

    .line 133
    .line 134
    if-ge v5, v10, :cond_6

    .line 135
    .line 136
    const v5, 0x1010452

    .line 137
    .line 138
    .line 139
    invoke-static {v9, v5, v8}, Lxe2;->r(Landroid/content/Context;II)I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    const/16 v8, 0x80

    .line 144
    .line 145
    invoke-static {v5, v8}, Lbx;->f(II)I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    goto :goto_4

    .line 150
    :cond_6
    move v5, v3

    .line 151
    :goto_4
    invoke-virtual {v0, v3}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v5}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    .line 162
    .line 163
    if-eqz v2, :cond_7

    .line 164
    .line 165
    invoke-static {v2}, Lbx;->c(I)D

    .line 166
    .line 167
    .line 168
    move-result-wide v10

    .line 169
    cmpl-double v2, v10, v8

    .line 170
    .line 171
    if-lez v2, :cond_7

    .line 172
    .line 173
    move v2, v4

    .line 174
    goto :goto_5

    .line 175
    :cond_7
    move v2, v3

    .line 176
    :goto_5
    if-eqz v6, :cond_8

    .line 177
    .line 178
    invoke-static {v6}, Lbx;->c(I)D

    .line 179
    .line 180
    .line 181
    move-result-wide v10

    .line 182
    cmpl-double v6, v10, v8

    .line 183
    .line 184
    if-lez v6, :cond_8

    .line 185
    .line 186
    move v6, v4

    .line 187
    goto :goto_6

    .line 188
    :cond_8
    move v6, v3

    .line 189
    :goto_6
    if-eqz v5, :cond_9

    .line 190
    .line 191
    invoke-static {v5}, Lbx;->c(I)D

    .line 192
    .line 193
    .line 194
    move-result-wide v10

    .line 195
    cmpl-double v8, v10, v8

    .line 196
    .line 197
    if-lez v8, :cond_9

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_9
    if-nez v5, :cond_a

    .line 201
    .line 202
    if-eqz v6, :cond_a

    .line 203
    .line 204
    :goto_7
    move v3, v4

    .line 205
    :cond_a
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 206
    .line 207
    .line 208
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 209
    .line 210
    if-lt v5, v7, :cond_b

    .line 211
    .line 212
    new-instance v5, Lp83;

    .line 213
    .line 214
    invoke-direct {v5, v0}, Lp83;-><init>(Landroid/view/Window;)V

    .line 215
    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_b
    const/16 v6, 0x1a

    .line 219
    .line 220
    if-lt v5, v6, :cond_c

    .line 221
    .line 222
    new-instance v5, Lo83;

    .line 223
    .line 224
    invoke-direct {v5, v0}, Ln83;-><init>(Landroid/view/Window;)V

    .line 225
    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_c
    new-instance v5, Ln83;

    .line 229
    .line 230
    invoke-direct {v5, v0}, Ln83;-><init>(Landroid/view/Window;)V

    .line 231
    .line 232
    .line 233
    :goto_8
    invoke-virtual {v5, v2}, Lpg3;->y(Z)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5, v3}, Lpg3;->x(Z)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 248
    .line 249
    new-instance v3, Lcd1;

    .line 250
    .line 251
    invoke-direct {v3, v1, v2, v0}, Lcd1;-><init>(Landroid/view/View;II)V

    .line 252
    .line 253
    .line 254
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 255
    .line 256
    invoke-static {v1, v3}, Ls23;->u(Landroid/view/View;Ljp1;)V

    .line 257
    .line 258
    .line 259
    iput-boolean v4, p0, Lcom/google/android/material/datepicker/m;->w0:Z

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_d
    const/4 v3, -0x2

    .line 263
    invoke-virtual {v0, v3, v3}, Landroid/view/Window;->setLayout(II)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    sget v4, Lcom/google/android/material/R$dimen;->mtrl_calendar_dialog_background_inset:I

    .line 271
    .line 272
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    new-instance v3, Landroid/graphics/Rect;

    .line 277
    .line 278
    invoke-direct {v3, v7, v7, v7, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 279
    .line 280
    .line 281
    new-instance v5, Landroid/graphics/drawable/InsetDrawable;

    .line 282
    .line 283
    iget-object v6, p0, Lcom/google/android/material/datepicker/m;->u0:Lfd1;

    .line 284
    .line 285
    move v8, v7

    .line 286
    move v9, v7

    .line 287
    move v10, v7

    .line 288
    invoke-direct/range {v5 .. v10}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v5}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    new-instance v4, Ljy0;

    .line 299
    .line 300
    iget-object v5, p0, Landroidx/fragment/app/i;->W:Landroid/app/Dialog;

    .line 301
    .line 302
    if-eqz v5, :cond_e

    .line 303
    .line 304
    invoke-direct {v4, v5, v3}, Ljy0;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 308
    .line 309
    .line 310
    :goto_9
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/m;->l()V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_e
    invoke-static {p0, v2, v1}, Ls80;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_f
    invoke-static {p0, v2, v1}, Ls80;->e(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/m;->h0:Lzr1;

    .line 2
    .line 3
    iget-object v0, v0, Lzr1;->a:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Landroidx/fragment/app/i;->onStop()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
