.class public final Lcom/google/android/material/navigation/b;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Leh1;


# instance fields
.field public a:Ltl1;

.field public b:Z

.field public c:I


# virtual methods
.method public final b(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/navigation/b;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ltl1;->a()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_1
    iget-object p1, p0, Ltl1;->p0:Ljg1;

    .line 16
    .line 17
    if-eqz p1, :cond_7

    .line 18
    .line 19
    iget-object v0, p0, Ltl1;->f:[Lrl1;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_2
    iget-object p1, p1, Ljg1;->f:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object v0, p0, Ltl1;->f:[Lrl1;

    .line 32
    .line 33
    array-length v0, v0

    .line 34
    if-eq p1, v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Ltl1;->a()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    iget v0, p0, Ltl1;->i:I

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    move v2, v1

    .line 44
    :goto_0
    if-ge v2, p1, :cond_5

    .line 45
    .line 46
    iget-object v3, p0, Ltl1;->p0:Ljg1;

    .line 47
    .line 48
    invoke-virtual {v3, v2}, Ljg1;->getItem(I)Landroid/view/MenuItem;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-interface {v3}, Landroid/view/MenuItem;->isChecked()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_4

    .line 57
    .line 58
    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    iput v3, p0, Ltl1;->i:I

    .line 63
    .line 64
    iput v2, p0, Ltl1;->v:I

    .line 65
    .line 66
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_5
    iget v2, p0, Ltl1;->i:I

    .line 70
    .line 71
    if-eq v0, v2, :cond_6

    .line 72
    .line 73
    iget-object v0, p0, Ltl1;->a:Landroidx/transition/AutoTransition;

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-static {p0, v0}, Llr2;->a(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V

    .line 78
    .line 79
    .line 80
    :cond_6
    iget v0, p0, Ltl1;->e:I

    .line 81
    .line 82
    iget-object v2, p0, Ltl1;->p0:Ljg1;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljg1;->l()Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    invoke-static {v0, v2}, Ltl1;->f(II)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    move v2, v1

    .line 97
    :goto_1
    if-ge v2, p1, :cond_7

    .line 98
    .line 99
    iget-object v3, p0, Ltl1;->o0:Lcom/google/android/material/navigation/b;

    .line 100
    .line 101
    const/4 v4, 0x1

    .line 102
    iput-boolean v4, v3, Lcom/google/android/material/navigation/b;->b:Z

    .line 103
    .line 104
    iget-object v3, p0, Ltl1;->f:[Lrl1;

    .line 105
    .line 106
    aget-object v3, v3, v2

    .line 107
    .line 108
    iget v4, p0, Ltl1;->e:I

    .line 109
    .line 110
    invoke-virtual {v3, v4}, Lrl1;->setLabelVisibilityMode(I)V

    .line 111
    .line 112
    .line 113
    iget-object v3, p0, Ltl1;->f:[Lrl1;

    .line 114
    .line 115
    aget-object v3, v3, v2

    .line 116
    .line 117
    invoke-virtual {v3, v0}, Lrl1;->setShifting(Z)V

    .line 118
    .line 119
    .line 120
    iget-object v3, p0, Ltl1;->f:[Lrl1;

    .line 121
    .line 122
    aget-object v3, v3, v2

    .line 123
    .line 124
    iget-object v4, p0, Ltl1;->p0:Ljg1;

    .line 125
    .line 126
    invoke-virtual {v4, v2}, Ljg1;->getItem(I)Landroid/view/MenuItem;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, Lsg1;

    .line 131
    .line 132
    invoke-virtual {v3, v4}, Lrl1;->c(Lsg1;)V

    .line 133
    .line 134
    .line 135
    iget-object v3, p0, Ltl1;->o0:Lcom/google/android/material/navigation/b;

    .line 136
    .line 137
    iput-boolean v1, v3, Lcom/google/android/material/navigation/b;->b:Z

    .line 138
    .line 139
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_7
    :goto_2
    return-void
.end method

.method public final c(Lhi2;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d(Ljg1;Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final f(Lsg1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final g(Landroid/os/Parcelable;)V
    .locals 7

    .line 1
    instance-of v0, p1, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 6
    .line 7
    check-cast p1, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;

    .line 8
    .line 9
    iget v1, p1, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;->a:I

    .line 10
    .line 11
    iget-object v2, v0, Ltl1;->p0:Ljg1;

    .line 12
    .line 13
    iget-object v2, v2, Ljg1;->f:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x0

    .line 20
    move v4, v3

    .line 21
    :goto_0
    if-ge v4, v2, :cond_1

    .line 22
    .line 23
    iget-object v5, v0, Ltl1;->p0:Ljg1;

    .line 24
    .line 25
    invoke-virtual {v5, v4}, Ljg1;->getItem(I)Landroid/view/MenuItem;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface {v5}, Landroid/view/MenuItem;->getItemId()I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-ne v1, v6, :cond_0

    .line 34
    .line 35
    iput v1, v0, Ltl1;->i:I

    .line 36
    .line 37
    iput v4, v0, Ltl1;->v:I

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-interface {v5, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object p1, p1, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;->b:Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 54
    .line 55
    new-instance v1, Landroid/util/SparseArray;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    invoke-direct {v1, v2}, Landroid/util/SparseArray;-><init>(I)V

    .line 62
    .line 63
    .line 64
    move v2, v3

    .line 65
    :goto_2
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-ge v2, v4, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Lcom/google/android/material/badge/BadgeState$State;

    .line 80
    .line 81
    if-eqz v5, :cond_2

    .line 82
    .line 83
    new-instance v6, Lmh;

    .line 84
    .line 85
    invoke-direct {v6, v0, v5}, Lmh;-><init>(Landroid/content/Context;Lcom/google/android/material/badge/BadgeState$State;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    const-string p0, "BadgeDrawable\'s savedState cannot be null"

    .line 95
    .line 96
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_3
    iget-object p0, p0, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 101
    .line 102
    iget-object p1, p0, Ltl1;->e0:Landroid/util/SparseArray;

    .line 103
    .line 104
    move v0, v3

    .line 105
    :goto_3
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-ge v0, v2, :cond_5

    .line 110
    .line 111
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->keyAt(I)I

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->indexOfKey(I)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-gez v4, :cond_4

    .line 120
    .line 121
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {p1, v2, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_5
    iget-object p0, p0, Ltl1;->f:[Lrl1;

    .line 132
    .line 133
    if-eqz p0, :cond_6

    .line 134
    .line 135
    array-length v0, p0

    .line 136
    :goto_4
    if-ge v3, v0, :cond_6

    .line 137
    .line 138
    aget-object v1, p0, v3

    .line 139
    .line 140
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    check-cast v2, Lmh;

    .line 149
    .line 150
    invoke-virtual {v1, v2}, Lrl1;->setBadge(Lmh;)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_6
    return-void
.end method

.method public final getId()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/navigation/b;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public final i(Lsg1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final k(Landroid/content/Context;Ljg1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 2
    .line 3
    iput-object p2, p0, Ltl1;->p0:Ljg1;

    .line 4
    .line 5
    return-void
.end method

.method public final l()Landroid/os/Parcelable;
    .locals 5

    .line 1
    new-instance v0, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 7
    .line 8
    invoke-virtual {v1}, Ltl1;->getSelectedItemId()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iput v1, v0, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;->a:I

    .line 13
    .line 14
    iget-object p0, p0, Lcom/google/android/material/navigation/b;->a:Ltl1;

    .line 15
    .line 16
    invoke-virtual {p0}, Ltl1;->getBadgeDrawables()Landroid/util/SparseArray;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance v1, Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 21
    .line 22
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    :goto_0
    invoke-virtual {p0}, Landroid/util/SparseArray;->size()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge v2, v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lmh;

    .line 41
    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    iget-object v4, v4, Lmh;->e:Lnh;

    .line 45
    .line 46
    iget-object v4, v4, Lnh;->a:Lcom/google/android/material/badge/BadgeState$State;

    .line 47
    .line 48
    invoke-virtual {v1, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string p0, "badgeDrawable cannot be null"

    .line 55
    .line 56
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    return-object p0

    .line 61
    :cond_1
    iput-object v1, v0, Lcom/google/android/material/navigation/NavigationBarPresenter$SavedState;->b:Lcom/google/android/material/internal/ParcelableSparseArray;

    .line 62
    .line 63
    return-object v0
.end method
