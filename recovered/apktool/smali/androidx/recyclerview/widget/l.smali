.class public final Landroidx/recyclerview/widget/l;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Lt12;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/l;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Landroidx/recyclerview/widget/l;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/recyclerview/widget/l;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Landroidx/recyclerview/widget/l;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Landroidx/recyclerview/widget/l;->e:I

    .line 31
    .line 32
    iput p1, p0, Landroidx/recyclerview/widget/l;->f:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Landroidx/recyclerview/widget/o;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Landroidx/recyclerview/widget/o;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->Y0:Lc22;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, v2, Lc22;->e:Lb22;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Lb22;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lt0;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v2, v3

    .line 29
    :goto_0
    invoke-static {v0, v2}, Le33;->n(Landroid/view/View;Lt0;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    if-eqz p2, :cond_4

    .line 33
    .line 34
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->b0:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-gtz v0, :cond_3

    .line 41
    .line 42
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/g;->g(Landroidx/recyclerview/widget/o;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->R0:Ly12;

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->f:Lwe2;

    .line 54
    .line 55
    invoke-virtual {p2, p1}, Lwe2;->p(Landroidx/recyclerview/widget/o;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 p0, 0x0

    .line 60
    invoke-static {p0, p2}, Lpm2;->i(ILjava/util/ArrayList;)Ljava/lang/ClassCastException;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    throw p0

    .line 65
    :cond_4
    :goto_1
    iput-object v3, p1, Landroidx/recyclerview/widget/o;->s:Landroidx/recyclerview/widget/g;

    .line 66
    .line 67
    iput-object v3, p1, Landroidx/recyclerview/widget/o;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/recyclerview/widget/l;->c()Lt12;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget p2, p1, Landroidx/recyclerview/widget/o;->f:I

    .line 77
    .line 78
    invoke-virtual {p0, p2}, Lt12;->a(I)Ls12;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-object v0, v0, Ls12;->a:Ljava/util/ArrayList;

    .line 83
    .line 84
    iget-object p0, p0, Lt12;->a:Landroid/util/SparseArray;

    .line 85
    .line 86
    invoke-virtual {p0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, Ls12;

    .line 91
    .line 92
    iget p0, p0, Ls12;->b:I

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-gt p0, p2, :cond_5

    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->m()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->R0:Ly12;

    .line 4
    .line 5
    if-ltz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {v0}, Ly12;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-boolean v0, v0, Ly12;->g:Z

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->d:Lq3;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, p1, v0}, Lq3;->g(II)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 27
    .line 28
    const-string v2, "invalid position "

    .line 29
    .line 30
    const-string v3, ". State item count is "

    .line 31
    .line 32
    invoke-static {p1, v2, v3}, Lfm0;->s(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0}, Ly12;->b()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v1
.end method

.method public final c()Lt12;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/l;->g:Lt12;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lt12;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Lt12;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Lt12;->b:I

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/recyclerview/widget/l;->g:Lt12;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->g:Lt12;

    .line 23
    .line 24
    return-object p0
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/l;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/l;->e(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->k1:[I

    .line 21
    .line 22
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q0:Liw;

    .line 25
    .line 26
    iget-object v0, p0, Liw;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, [I

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    const/4 v1, -0x1

    .line 33
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Liw;->d:I

    .line 38
    .line 39
    return-void
.end method

.method public final e(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/l;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroidx/recyclerview/widget/o;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/l;->a(Landroidx/recyclerview/widget/o;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->i()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Landroidx/recyclerview/widget/o;->n:Landroidx/recyclerview/widget/l;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/l;->j(Landroidx/recyclerview/widget/o;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->p()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Landroidx/recyclerview/widget/o;->j:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Landroidx/recyclerview/widget/o;->j:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/o;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->z0:Ln12;

    .line 45
    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o;->g()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_3

    .line 53
    .line 54
    iget-object p0, v2, Landroidx/recyclerview/widget/RecyclerView;->z0:Ln12;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ln12;->d(Landroidx/recyclerview/widget/o;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final g(Landroidx/recyclerview/widget/o;)V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->Q0:Liw;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    iget-object v3, p1, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v2, :cond_f

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto/16 :goto_9

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->j()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_e

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->o()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_d

    .line 34
    .line 35
    iget v2, p1, Landroidx/recyclerview/widget/o;->j:I

    .line 36
    .line 37
    and-int/lit8 v2, v2, 0x10

    .line 38
    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    sget-object v2, Le33;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->hasTransientState()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    move v2, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v2, v4

    .line 52
    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->g()Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_b

    .line 57
    .line 58
    iget v3, p0, Landroidx/recyclerview/widget/l;->f:I

    .line 59
    .line 60
    if-lez v3, :cond_9

    .line 61
    .line 62
    iget v3, p1, Landroidx/recyclerview/widget/o;->j:I

    .line 63
    .line 64
    and-int/lit16 v3, v3, 0x20e

    .line 65
    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_2
    iget-object v3, p0, Landroidx/recyclerview/widget/l;->c:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    iget v7, p0, Landroidx/recyclerview/widget/l;->f:I

    .line 76
    .line 77
    if-lt v6, v7, :cond_3

    .line 78
    .line 79
    if-lez v6, :cond_3

    .line 80
    .line 81
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/l;->e(I)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v6, v6, -0x1

    .line 85
    .line 86
    :cond_3
    sget-object v7, Landroidx/recyclerview/widget/RecyclerView;->k1:[I

    .line 87
    .line 88
    if-lez v6, :cond_8

    .line 89
    .line 90
    iget v7, p1, Landroidx/recyclerview/widget/o;->c:I

    .line 91
    .line 92
    iget-object v8, v1, Liw;->e:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, [I

    .line 95
    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    iget v8, v1, Liw;->d:I

    .line 99
    .line 100
    mul-int/lit8 v8, v8, 0x2

    .line 101
    .line 102
    move v9, v4

    .line 103
    :goto_1
    if-ge v9, v8, :cond_5

    .line 104
    .line 105
    iget-object v10, v1, Liw;->e:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v10, [I

    .line 108
    .line 109
    aget v10, v10, v9

    .line 110
    .line 111
    if-ne v10, v7, :cond_4

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    add-int/lit8 v9, v9, 0x2

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    add-int/lit8 v6, v6, -0x1

    .line 118
    .line 119
    :goto_2
    if-ltz v6, :cond_7

    .line 120
    .line 121
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    check-cast v7, Landroidx/recyclerview/widget/o;

    .line 126
    .line 127
    iget v7, v7, Landroidx/recyclerview/widget/o;->c:I

    .line 128
    .line 129
    iget-object v8, v1, Liw;->e:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v8, [I

    .line 132
    .line 133
    if-eqz v8, :cond_7

    .line 134
    .line 135
    iget v8, v1, Liw;->d:I

    .line 136
    .line 137
    mul-int/lit8 v8, v8, 0x2

    .line 138
    .line 139
    move v9, v4

    .line 140
    :goto_3
    if-ge v9, v8, :cond_7

    .line 141
    .line 142
    iget-object v10, v1, Liw;->e:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v10, [I

    .line 145
    .line 146
    aget v10, v10, v9

    .line 147
    .line 148
    if-ne v10, v7, :cond_6

    .line 149
    .line 150
    add-int/lit8 v6, v6, -0x1

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    add-int/lit8 v9, v9, 0x2

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_7
    add-int/2addr v6, v5

    .line 157
    :cond_8
    :goto_4
    invoke-virtual {v3, v6, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    move v1, v5

    .line 161
    goto :goto_6

    .line 162
    :cond_9
    :goto_5
    move v1, v4

    .line 163
    :goto_6
    if-nez v1, :cond_a

    .line 164
    .line 165
    invoke-virtual {p0, p1, v5}, Landroidx/recyclerview/widget/l;->a(Landroidx/recyclerview/widget/o;Z)V

    .line 166
    .line 167
    .line 168
    :goto_7
    move v4, v1

    .line 169
    goto :goto_8

    .line 170
    :cond_a
    move v5, v4

    .line 171
    goto :goto_7

    .line 172
    :cond_b
    move v5, v4

    .line 173
    :goto_8
    iget-object p0, v0, Landroidx/recyclerview/widget/RecyclerView;->f:Lwe2;

    .line 174
    .line 175
    invoke-virtual {p0, p1}, Lwe2;->p(Landroidx/recyclerview/widget/o;)V

    .line 176
    .line 177
    .line 178
    if-nez v4, :cond_c

    .line 179
    .line 180
    if-nez v5, :cond_c

    .line 181
    .line 182
    if-eqz v2, :cond_c

    .line 183
    .line 184
    const/4 p0, 0x0

    .line 185
    iput-object p0, p1, Landroidx/recyclerview/widget/o;->s:Landroidx/recyclerview/widget/g;

    .line 186
    .line 187
    iput-object p0, p1, Landroidx/recyclerview/widget/o;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    :cond_c
    return-void

    .line 190
    :cond_d
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    const-string p1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 195
    .line 196
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :cond_e
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 205
    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 209
    .line 210
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw p0

    .line 231
    :cond_f
    :goto_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 232
    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v2, "Scrapped or attached views may not be recycled. isScrap:"

    .line 236
    .line 237
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->i()Z

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string p1, " isAttached:"

    .line 248
    .line 249
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-eqz p1, :cond_10

    .line 257
    .line 258
    move v4, v5

    .line 259
    :cond_10
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p0
.end method

.method public final h(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Landroidx/recyclerview/widget/o;->j:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xc

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->k()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->z0:Ln12;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v0, Lj60;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-boolean v0, v0, Lj60;->g:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->f()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/l;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Landroidx/recyclerview/widget/l;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    :cond_2
    iput-object p0, p1, Landroidx/recyclerview/widget/o;->n:Landroidx/recyclerview/widget/l;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p1, Landroidx/recyclerview/widget/o;->o:Z

    .line 62
    .line 63
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->h()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 82
    .line 83
    iget-boolean v0, v0, Landroidx/recyclerview/widget/g;->b:Z

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const-string p1, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 93
    .line 94
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    :goto_1
    iput-object p0, p1, Landroidx/recyclerview/widget/o;->n:Landroidx/recyclerview/widget/l;

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p1, Landroidx/recyclerview/widget/o;->o:Z

    .line 106
    .line 107
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->a:Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final i(IJ)Landroidx/recyclerview/widget/o;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->R0:Ly12;

    .line 8
    .line 9
    if-ltz v1, :cond_4a

    .line 10
    .line 11
    invoke-virtual {v3}, Ly12;->b()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v1, v4, :cond_4a

    .line 16
    .line 17
    iget-boolean v4, v3, Ly12;->g:Z

    .line 18
    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    if-eqz v4, :cond_5

    .line 24
    .line 25
    iget-object v4, v0, Landroidx/recyclerview/widget/l;->b:Ljava/util/ArrayList;

    .line 26
    .line 27
    if-eqz v4, :cond_4

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_0
    move v9, v8

    .line 37
    :goto_0
    if-ge v9, v4, :cond_2

    .line 38
    .line 39
    iget-object v10, v0, Landroidx/recyclerview/widget/l;->b:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    check-cast v10, Landroidx/recyclerview/widget/o;

    .line 46
    .line 47
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->p()Z

    .line 48
    .line 49
    .line 50
    move-result v11

    .line 51
    if-nez v11, :cond_1

    .line 52
    .line 53
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->b()I

    .line 54
    .line 55
    .line 56
    move-result v11

    .line 57
    if-ne v11, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v10, v5}, Landroidx/recyclerview/widget/o;->a(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 67
    .line 68
    iget-boolean v9, v9, Landroidx/recyclerview/widget/g;->b:Z

    .line 69
    .line 70
    if-eqz v9, :cond_4

    .line 71
    .line 72
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->d:Lq3;

    .line 73
    .line 74
    invoke-virtual {v9, v1, v8}, Lq3;->g(II)I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-lez v9, :cond_4

    .line 79
    .line 80
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 81
    .line 82
    invoke-virtual {v10}, Landroidx/recyclerview/widget/g;->a()I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-ge v9, v10, :cond_4

    .line 87
    .line 88
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 89
    .line 90
    invoke-virtual {v10, v9}, Landroidx/recyclerview/widget/g;->b(I)J

    .line 91
    .line 92
    .line 93
    move-result-wide v9

    .line 94
    move v11, v8

    .line 95
    :goto_1
    if-ge v11, v4, :cond_4

    .line 96
    .line 97
    iget-object v12, v0, Landroidx/recyclerview/widget/l;->b:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    check-cast v12, Landroidx/recyclerview/widget/o;

    .line 104
    .line 105
    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->p()Z

    .line 106
    .line 107
    .line 108
    move-result v13

    .line 109
    if-nez v13, :cond_3

    .line 110
    .line 111
    iget-wide v13, v12, Landroidx/recyclerview/widget/o;->e:J

    .line 112
    .line 113
    cmp-long v13, v13, v9

    .line 114
    .line 115
    if-nez v13, :cond_3

    .line 116
    .line 117
    invoke-virtual {v12, v5}, Landroidx/recyclerview/widget/o;->a(I)V

    .line 118
    .line 119
    .line 120
    move-object v10, v12

    .line 121
    goto :goto_3

    .line 122
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_4
    :goto_2
    move-object v10, v6

    .line 126
    :goto_3
    if-eqz v10, :cond_6

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    goto :goto_4

    .line 130
    :cond_5
    move-object v10, v6

    .line 131
    :cond_6
    move v4, v8

    .line 132
    :goto_4
    iget-object v9, v0, Landroidx/recyclerview/widget/l;->a:Ljava/util/ArrayList;

    .line 133
    .line 134
    iget-object v11, v0, Landroidx/recyclerview/widget/l;->c:Ljava/util/ArrayList;

    .line 135
    .line 136
    if-nez v10, :cond_1c

    .line 137
    .line 138
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    move v12, v8

    .line 143
    :goto_5
    if-ge v12, v10, :cond_9

    .line 144
    .line 145
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    check-cast v13, Landroidx/recyclerview/widget/o;

    .line 150
    .line 151
    invoke-virtual {v13}, Landroidx/recyclerview/widget/o;->p()Z

    .line 152
    .line 153
    .line 154
    move-result v14

    .line 155
    if-nez v14, :cond_8

    .line 156
    .line 157
    invoke-virtual {v13}, Landroidx/recyclerview/widget/o;->b()I

    .line 158
    .line 159
    .line 160
    move-result v14

    .line 161
    if-ne v14, v1, :cond_8

    .line 162
    .line 163
    invoke-virtual {v13}, Landroidx/recyclerview/widget/o;->f()Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-nez v14, :cond_8

    .line 168
    .line 169
    iget-boolean v14, v3, Ly12;->g:Z

    .line 170
    .line 171
    if-nez v14, :cond_7

    .line 172
    .line 173
    invoke-virtual {v13}, Landroidx/recyclerview/widget/o;->h()Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-nez v14, :cond_8

    .line 178
    .line 179
    :cond_7
    invoke-virtual {v13, v5}, Landroidx/recyclerview/widget/o;->a(I)V

    .line 180
    .line 181
    .line 182
    move-object v10, v13

    .line 183
    const/16 v16, 0x1

    .line 184
    .line 185
    goto/16 :goto_b

    .line 186
    .line 187
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_9
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->e:Lec;

    .line 191
    .line 192
    iget-object v10, v10, Lec;->d:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v10, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    move v13, v8

    .line 201
    :goto_6
    if-ge v13, v12, :cond_b

    .line 202
    .line 203
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    check-cast v14, Landroid/view/View;

    .line 208
    .line 209
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    .line 210
    .line 211
    .line 212
    move-result-object v15

    .line 213
    const/16 v16, 0x1

    .line 214
    .line 215
    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->b()I

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    if-ne v7, v1, :cond_a

    .line 220
    .line 221
    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->f()Z

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    if-nez v7, :cond_a

    .line 226
    .line 227
    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->h()Z

    .line 228
    .line 229
    .line 230
    move-result v7

    .line 231
    if-nez v7, :cond_a

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_b
    const/16 v16, 0x1

    .line 238
    .line 239
    move-object v14, v6

    .line 240
    :goto_7
    if-eqz v14, :cond_11

    .line 241
    .line 242
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->e:Lec;

    .line 247
    .line 248
    iget-object v12, v10, Lec;->c:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v12, Lbu;

    .line 251
    .line 252
    iget-object v13, v10, Lec;->b:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v13, Lts0;

    .line 255
    .line 256
    iget-object v13, v13, Lts0;->a:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v13, Landroidx/recyclerview/widget/RecyclerView;

    .line 259
    .line 260
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    if-ltz v13, :cond_10

    .line 265
    .line 266
    invoke-virtual {v12, v13}, Lbu;->d(I)Z

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    if-eqz v15, :cond_f

    .line 271
    .line 272
    invoke-virtual {v12, v13}, Lbu;->a(I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v10, v14}, Lec;->O(Landroid/view/View;)V

    .line 276
    .line 277
    .line 278
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->e:Lec;

    .line 279
    .line 280
    iget-object v12, v10, Lec;->c:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v12, Lbu;

    .line 283
    .line 284
    iget-object v10, v10, Lec;->b:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v10, Lts0;

    .line 287
    .line 288
    iget-object v10, v10, Lts0;->a:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v10, Landroidx/recyclerview/widget/RecyclerView;

    .line 291
    .line 292
    invoke-virtual {v10, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 293
    .line 294
    .line 295
    move-result v10

    .line 296
    const/4 v13, -0x1

    .line 297
    if-ne v10, v13, :cond_c

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_c
    invoke-virtual {v12, v10}, Lbu;->d(I)Z

    .line 301
    .line 302
    .line 303
    move-result v15

    .line 304
    if-eqz v15, :cond_d

    .line 305
    .line 306
    :goto_8
    move v10, v13

    .line 307
    goto :goto_9

    .line 308
    :cond_d
    invoke-virtual {v12, v10}, Lbu;->b(I)I

    .line 309
    .line 310
    .line 311
    move-result v12

    .line 312
    sub-int/2addr v10, v12

    .line 313
    :goto_9
    if-eq v10, v13, :cond_e

    .line 314
    .line 315
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->e:Lec;

    .line 316
    .line 317
    invoke-virtual {v12, v10}, Lec;->p(I)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/l;->h(Landroid/view/View;)V

    .line 321
    .line 322
    .line 323
    const/16 v10, 0x2020

    .line 324
    .line 325
    invoke-virtual {v7, v10}, Landroidx/recyclerview/widget/o;->a(I)V

    .line 326
    .line 327
    .line 328
    move-object v10, v7

    .line 329
    goto :goto_b

    .line 330
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v1, "layout index should not be -1 after unhiding a view:"

    .line 333
    .line 334
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-static {v0, v1}, Lf42;->o(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    return-object v6

    .line 348
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 349
    .line 350
    new-instance v1, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v2, "trying to unhide a view that was not hidden"

    .line 353
    .line 354
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :cond_10
    const-string v0, "view is not a child, cannot hide "

    .line 369
    .line 370
    invoke-static {v14, v0}, Ls80;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    return-object v6

    .line 374
    :cond_11
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    move v10, v8

    .line 379
    :goto_a
    if-ge v10, v7, :cond_13

    .line 380
    .line 381
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    check-cast v12, Landroidx/recyclerview/widget/o;

    .line 386
    .line 387
    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->f()Z

    .line 388
    .line 389
    .line 390
    move-result v13

    .line 391
    if-nez v13, :cond_12

    .line 392
    .line 393
    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->b()I

    .line 394
    .line 395
    .line 396
    move-result v13

    .line 397
    if-ne v13, v1, :cond_12

    .line 398
    .line 399
    invoke-virtual {v12}, Landroidx/recyclerview/widget/o;->d()Z

    .line 400
    .line 401
    .line 402
    move-result v13

    .line 403
    if-nez v13, :cond_12

    .line 404
    .line 405
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-object v10, v12

    .line 409
    goto :goto_b

    .line 410
    :cond_12
    add-int/lit8 v10, v10, 0x1

    .line 411
    .line 412
    goto :goto_a

    .line 413
    :cond_13
    move-object v10, v6

    .line 414
    :goto_b
    if-eqz v10, :cond_1d

    .line 415
    .line 416
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->h()Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-eqz v7, :cond_14

    .line 421
    .line 422
    iget-boolean v7, v3, Ly12;->g:Z

    .line 423
    .line 424
    goto :goto_c

    .line 425
    :cond_14
    iget v7, v10, Landroidx/recyclerview/widget/o;->c:I

    .line 426
    .line 427
    if-ltz v7, :cond_1b

    .line 428
    .line 429
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 430
    .line 431
    invoke-virtual {v12}, Landroidx/recyclerview/widget/g;->a()I

    .line 432
    .line 433
    .line 434
    move-result v12

    .line 435
    if-ge v7, v12, :cond_1b

    .line 436
    .line 437
    iget-boolean v7, v3, Ly12;->g:Z

    .line 438
    .line 439
    if-nez v7, :cond_16

    .line 440
    .line 441
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 442
    .line 443
    iget v12, v10, Landroidx/recyclerview/widget/o;->c:I

    .line 444
    .line 445
    invoke-virtual {v7, v12}, Landroidx/recyclerview/widget/g;->c(I)I

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    iget v12, v10, Landroidx/recyclerview/widget/o;->f:I

    .line 450
    .line 451
    if-eq v7, v12, :cond_16

    .line 452
    .line 453
    :cond_15
    move v7, v8

    .line 454
    goto :goto_c

    .line 455
    :cond_16
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 456
    .line 457
    iget-boolean v12, v7, Landroidx/recyclerview/widget/g;->b:Z

    .line 458
    .line 459
    if-eqz v12, :cond_17

    .line 460
    .line 461
    iget-wide v12, v10, Landroidx/recyclerview/widget/o;->e:J

    .line 462
    .line 463
    iget v14, v10, Landroidx/recyclerview/widget/o;->c:I

    .line 464
    .line 465
    invoke-virtual {v7, v14}, Landroidx/recyclerview/widget/g;->b(I)J

    .line 466
    .line 467
    .line 468
    move-result-wide v14

    .line 469
    cmp-long v7, v12, v14

    .line 470
    .line 471
    if-nez v7, :cond_15

    .line 472
    .line 473
    :cond_17
    move/from16 v7, v16

    .line 474
    .line 475
    :goto_c
    if-nez v7, :cond_1a

    .line 476
    .line 477
    const/4 v7, 0x4

    .line 478
    invoke-virtual {v10, v7}, Landroidx/recyclerview/widget/o;->a(I)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->i()Z

    .line 482
    .line 483
    .line 484
    move-result v7

    .line 485
    if-eqz v7, :cond_18

    .line 486
    .line 487
    iget-object v7, v10, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 488
    .line 489
    invoke-virtual {v2, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 490
    .line 491
    .line 492
    iget-object v7, v10, Landroidx/recyclerview/widget/o;->n:Landroidx/recyclerview/widget/l;

    .line 493
    .line 494
    invoke-virtual {v7, v10}, Landroidx/recyclerview/widget/l;->j(Landroidx/recyclerview/widget/o;)V

    .line 495
    .line 496
    .line 497
    goto :goto_d

    .line 498
    :cond_18
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->p()Z

    .line 499
    .line 500
    .line 501
    move-result v7

    .line 502
    if-eqz v7, :cond_19

    .line 503
    .line 504
    iget v7, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 505
    .line 506
    and-int/lit8 v7, v7, -0x21

    .line 507
    .line 508
    iput v7, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 509
    .line 510
    :cond_19
    :goto_d
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/o;)V

    .line 511
    .line 512
    .line 513
    move-object v10, v6

    .line 514
    goto :goto_e

    .line 515
    :cond_1a
    move/from16 v4, v16

    .line 516
    .line 517
    goto :goto_e

    .line 518
    :cond_1b
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 519
    .line 520
    new-instance v1, Ljava/lang/StringBuilder;

    .line 521
    .line 522
    const-string v3, "Inconsistency detected. Invalid view holder adapter position"

    .line 523
    .line 524
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 535
    .line 536
    .line 537
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    throw v0

    .line 545
    :cond_1c
    const/16 v16, 0x1

    .line 546
    .line 547
    :cond_1d
    :goto_e
    const-wide/16 v17, 0x0

    .line 548
    .line 549
    const-wide v19, 0x7fffffffffffffffL

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    if-nez v10, :cond_30

    .line 555
    .line 556
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->d:Lq3;

    .line 557
    .line 558
    invoke-virtual {v7, v1, v8}, Lq3;->g(II)I

    .line 559
    .line 560
    .line 561
    move-result v7

    .line 562
    if-ltz v7, :cond_2f

    .line 563
    .line 564
    const-wide/16 v21, 0x3

    .line 565
    .line 566
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 567
    .line 568
    invoke-virtual {v12}, Landroidx/recyclerview/widget/g;->a()I

    .line 569
    .line 570
    .line 571
    move-result v12

    .line 572
    if-ge v7, v12, :cond_2f

    .line 573
    .line 574
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 575
    .line 576
    invoke-virtual {v12, v7}, Landroidx/recyclerview/widget/g;->c(I)I

    .line 577
    .line 578
    .line 579
    move-result v12

    .line 580
    iget-object v13, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 581
    .line 582
    const-wide/16 v23, 0x4

    .line 583
    .line 584
    iget-boolean v14, v13, Landroidx/recyclerview/widget/g;->b:Z

    .line 585
    .line 586
    if-eqz v14, :cond_25

    .line 587
    .line 588
    invoke-virtual {v13, v7}, Landroidx/recyclerview/widget/g;->b(I)J

    .line 589
    .line 590
    .line 591
    move-result-wide v13

    .line 592
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 593
    .line 594
    .line 595
    move-result v10

    .line 596
    add-int/lit8 v10, v10, -0x1

    .line 597
    .line 598
    :goto_f
    if-ltz v10, :cond_21

    .line 599
    .line 600
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v15

    .line 604
    check-cast v15, Landroidx/recyclerview/widget/o;

    .line 605
    .line 606
    move/from16 v26, v7

    .line 607
    .line 608
    iget-wide v6, v15, Landroidx/recyclerview/widget/o;->e:J

    .line 609
    .line 610
    iget-object v8, v15, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 611
    .line 612
    cmp-long v6, v6, v13

    .line 613
    .line 614
    if-nez v6, :cond_20

    .line 615
    .line 616
    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->p()Z

    .line 617
    .line 618
    .line 619
    move-result v6

    .line 620
    if-nez v6, :cond_20

    .line 621
    .line 622
    iget v6, v15, Landroidx/recyclerview/widget/o;->f:I

    .line 623
    .line 624
    if-ne v12, v6, :cond_1f

    .line 625
    .line 626
    invoke-virtual {v15, v5}, Landroidx/recyclerview/widget/o;->a(I)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {v15}, Landroidx/recyclerview/widget/o;->h()Z

    .line 630
    .line 631
    .line 632
    move-result v5

    .line 633
    if-eqz v5, :cond_1e

    .line 634
    .line 635
    iget-boolean v5, v3, Ly12;->g:Z

    .line 636
    .line 637
    if-nez v5, :cond_1e

    .line 638
    .line 639
    iget v5, v15, Landroidx/recyclerview/widget/o;->j:I

    .line 640
    .line 641
    and-int/lit8 v5, v5, -0xf

    .line 642
    .line 643
    or-int/lit8 v5, v5, 0x2

    .line 644
    .line 645
    iput v5, v15, Landroidx/recyclerview/widget/o;->j:I

    .line 646
    .line 647
    :cond_1e
    move-object v10, v15

    .line 648
    goto :goto_11

    .line 649
    :cond_1f
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    const/4 v6, 0x0

    .line 653
    invoke-virtual {v2, v8, v6}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 654
    .line 655
    .line 656
    invoke-static {v8}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    .line 657
    .line 658
    .line 659
    move-result-object v7

    .line 660
    const/4 v8, 0x0

    .line 661
    iput-object v8, v7, Landroidx/recyclerview/widget/o;->n:Landroidx/recyclerview/widget/l;

    .line 662
    .line 663
    iput-boolean v6, v7, Landroidx/recyclerview/widget/o;->o:Z

    .line 664
    .line 665
    iget v6, v7, Landroidx/recyclerview/widget/o;->j:I

    .line 666
    .line 667
    and-int/lit8 v6, v6, -0x21

    .line 668
    .line 669
    iput v6, v7, Landroidx/recyclerview/widget/o;->j:I

    .line 670
    .line 671
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/o;)V

    .line 672
    .line 673
    .line 674
    :cond_20
    add-int/lit8 v10, v10, -0x1

    .line 675
    .line 676
    move/from16 v7, v26

    .line 677
    .line 678
    const/4 v6, 0x0

    .line 679
    const/4 v8, 0x0

    .line 680
    goto :goto_f

    .line 681
    :cond_21
    move/from16 v26, v7

    .line 682
    .line 683
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    add-int/lit8 v5, v5, -0x1

    .line 688
    .line 689
    :goto_10
    if-ltz v5, :cond_23

    .line 690
    .line 691
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    check-cast v6, Landroidx/recyclerview/widget/o;

    .line 696
    .line 697
    iget-wide v7, v6, Landroidx/recyclerview/widget/o;->e:J

    .line 698
    .line 699
    cmp-long v7, v7, v13

    .line 700
    .line 701
    if-nez v7, :cond_24

    .line 702
    .line 703
    invoke-virtual {v6}, Landroidx/recyclerview/widget/o;->d()Z

    .line 704
    .line 705
    .line 706
    move-result v7

    .line 707
    if-nez v7, :cond_24

    .line 708
    .line 709
    iget v7, v6, Landroidx/recyclerview/widget/o;->f:I

    .line 710
    .line 711
    if-ne v12, v7, :cond_22

    .line 712
    .line 713
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 714
    .line 715
    .line 716
    move-object v10, v6

    .line 717
    goto :goto_11

    .line 718
    :cond_22
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/l;->e(I)V

    .line 719
    .line 720
    .line 721
    :cond_23
    const/4 v10, 0x0

    .line 722
    goto :goto_11

    .line 723
    :cond_24
    add-int/lit8 v5, v5, -0x1

    .line 724
    .line 725
    goto :goto_10

    .line 726
    :goto_11
    if-eqz v10, :cond_25

    .line 727
    .line 728
    move/from16 v5, v26

    .line 729
    .line 730
    iput v5, v10, Landroidx/recyclerview/widget/o;->c:I

    .line 731
    .line 732
    move/from16 v4, v16

    .line 733
    .line 734
    :cond_25
    if-nez v10, :cond_29

    .line 735
    .line 736
    invoke-virtual {v0}, Landroidx/recyclerview/widget/l;->c()Lt12;

    .line 737
    .line 738
    .line 739
    move-result-object v5

    .line 740
    iget-object v5, v5, Lt12;->a:Landroid/util/SparseArray;

    .line 741
    .line 742
    invoke-virtual {v5, v12}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v5

    .line 746
    check-cast v5, Ls12;

    .line 747
    .line 748
    if-eqz v5, :cond_27

    .line 749
    .line 750
    iget-object v5, v5, Ls12;->a:Ljava/util/ArrayList;

    .line 751
    .line 752
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 753
    .line 754
    .line 755
    move-result v6

    .line 756
    if-nez v6, :cond_27

    .line 757
    .line 758
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 759
    .line 760
    .line 761
    move-result v6

    .line 762
    add-int/lit8 v6, v6, -0x1

    .line 763
    .line 764
    :goto_12
    if-ltz v6, :cond_27

    .line 765
    .line 766
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v7

    .line 770
    check-cast v7, Landroidx/recyclerview/widget/o;

    .line 771
    .line 772
    invoke-virtual {v7}, Landroidx/recyclerview/widget/o;->d()Z

    .line 773
    .line 774
    .line 775
    move-result v7

    .line 776
    if-nez v7, :cond_26

    .line 777
    .line 778
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v5

    .line 782
    check-cast v5, Landroidx/recyclerview/widget/o;

    .line 783
    .line 784
    goto :goto_13

    .line 785
    :cond_26
    add-int/lit8 v6, v6, -0x1

    .line 786
    .line 787
    goto :goto_12

    .line 788
    :cond_27
    const/4 v5, 0x0

    .line 789
    :goto_13
    if-eqz v5, :cond_28

    .line 790
    .line 791
    invoke-virtual {v5}, Landroidx/recyclerview/widget/o;->m()V

    .line 792
    .line 793
    .line 794
    sget-object v6, Landroidx/recyclerview/widget/RecyclerView;->k1:[I

    .line 795
    .line 796
    :cond_28
    move-object v10, v5

    .line 797
    :cond_29
    if-nez v10, :cond_31

    .line 798
    .line 799
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 800
    .line 801
    .line 802
    move-result-wide v5

    .line 803
    cmp-long v7, p2, v19

    .line 804
    .line 805
    if-eqz v7, :cond_2b

    .line 806
    .line 807
    iget-object v7, v0, Landroidx/recyclerview/widget/l;->g:Lt12;

    .line 808
    .line 809
    invoke-virtual {v7, v12}, Lt12;->a(I)Ls12;

    .line 810
    .line 811
    .line 812
    move-result-object v7

    .line 813
    iget-wide v7, v7, Ls12;->c:J

    .line 814
    .line 815
    cmp-long v9, v7, v17

    .line 816
    .line 817
    if-eqz v9, :cond_2b

    .line 818
    .line 819
    add-long/2addr v7, v5

    .line 820
    cmp-long v7, v7, p2

    .line 821
    .line 822
    if-gez v7, :cond_2a

    .line 823
    .line 824
    goto :goto_14

    .line 825
    :cond_2a
    const/16 v25, 0x0

    .line 826
    .line 827
    return-object v25

    .line 828
    :cond_2b
    :goto_14
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 829
    .line 830
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    :try_start_0
    const-string v8, "RV CreateView"

    .line 834
    .line 835
    sget v9, Loq2;->a:I

    .line 836
    .line 837
    invoke-static {v8}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v7, v2, v12}, Landroidx/recyclerview/widget/g;->f(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o;

    .line 841
    .line 842
    .line 843
    move-result-object v10

    .line 844
    iget-object v7, v10, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 845
    .line 846
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 847
    .line 848
    .line 849
    move-result-object v7

    .line 850
    if-nez v7, :cond_2e

    .line 851
    .line 852
    iput v12, v10, Landroidx/recyclerview/widget/o;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 853
    .line 854
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 855
    .line 856
    .line 857
    sget-object v7, Landroidx/recyclerview/widget/RecyclerView;->k1:[I

    .line 858
    .line 859
    iget-object v7, v10, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 860
    .line 861
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->E(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 862
    .line 863
    .line 864
    move-result-object v7

    .line 865
    if-eqz v7, :cond_2c

    .line 866
    .line 867
    new-instance v8, Ljava/lang/ref/WeakReference;

    .line 868
    .line 869
    invoke-direct {v8, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    iput-object v8, v10, Landroidx/recyclerview/widget/o;->b:Ljava/lang/ref/WeakReference;

    .line 873
    .line 874
    :cond_2c
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 875
    .line 876
    .line 877
    move-result-wide v7

    .line 878
    iget-object v9, v0, Landroidx/recyclerview/widget/l;->g:Lt12;

    .line 879
    .line 880
    sub-long/2addr v7, v5

    .line 881
    invoke-virtual {v9, v12}, Lt12;->a(I)Ls12;

    .line 882
    .line 883
    .line 884
    move-result-object v5

    .line 885
    iget-wide v11, v5, Ls12;->c:J

    .line 886
    .line 887
    cmp-long v6, v11, v17

    .line 888
    .line 889
    if-nez v6, :cond_2d

    .line 890
    .line 891
    goto :goto_15

    .line 892
    :cond_2d
    div-long v11, v11, v23

    .line 893
    .line 894
    mul-long v11, v11, v21

    .line 895
    .line 896
    div-long v7, v7, v23

    .line 897
    .line 898
    add-long/2addr v7, v11

    .line 899
    :goto_15
    iput-wide v7, v5, Ls12;->c:J

    .line 900
    .line 901
    goto :goto_16

    .line 902
    :cond_2e
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 903
    .line 904
    const-string v1, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 905
    .line 906
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 907
    .line 908
    .line 909
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 910
    :catchall_0
    move-exception v0

    .line 911
    sget v1, Loq2;->a:I

    .line 912
    .line 913
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 914
    .line 915
    .line 916
    throw v0

    .line 917
    :cond_2f
    move v5, v7

    .line 918
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 919
    .line 920
    invoke-virtual {v3}, Ly12;->b()I

    .line 921
    .line 922
    .line 923
    move-result v3

    .line 924
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    new-instance v4, Ljava/lang/StringBuilder;

    .line 929
    .line 930
    const-string v6, "Inconsistency detected. Invalid item position "

    .line 931
    .line 932
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 936
    .line 937
    .line 938
    const-string v1, "(offset:"

    .line 939
    .line 940
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 941
    .line 942
    .line 943
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 944
    .line 945
    .line 946
    const-string v1, ").state:"

    .line 947
    .line 948
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 949
    .line 950
    .line 951
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 952
    .line 953
    .line 954
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 955
    .line 956
    .line 957
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    throw v0

    .line 965
    :cond_30
    const-wide/16 v21, 0x3

    .line 966
    .line 967
    const-wide/16 v23, 0x4

    .line 968
    .line 969
    :cond_31
    :goto_16
    iget-object v5, v10, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 970
    .line 971
    if-eqz v4, :cond_32

    .line 972
    .line 973
    iget-boolean v6, v3, Ly12;->g:Z

    .line 974
    .line 975
    if-nez v6, :cond_32

    .line 976
    .line 977
    iget v6, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 978
    .line 979
    and-int/lit16 v7, v6, 0x2000

    .line 980
    .line 981
    if-eqz v7, :cond_32

    .line 982
    .line 983
    and-int/lit16 v6, v6, -0x2001

    .line 984
    .line 985
    iput v6, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 986
    .line 987
    iget-boolean v6, v3, Ly12;->j:Z

    .line 988
    .line 989
    if-eqz v6, :cond_32

    .line 990
    .line 991
    invoke-static {v10}, Ln12;->b(Landroidx/recyclerview/widget/o;)V

    .line 992
    .line 993
    .line 994
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->z0:Ln12;

    .line 995
    .line 996
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->c()Ljava/util/List;

    .line 997
    .line 998
    .line 999
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    new-instance v6, Lm12;

    .line 1003
    .line 1004
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1005
    .line 1006
    .line 1007
    invoke-virtual {v6, v10}, Lm12;->a(Landroidx/recyclerview/widget/o;)V

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v2, v10, v6}, Landroidx/recyclerview/widget/RecyclerView;->X(Landroidx/recyclerview/widget/o;Lm12;)V

    .line 1011
    .line 1012
    .line 1013
    :cond_32
    iget-boolean v6, v3, Ly12;->g:Z

    .line 1014
    .line 1015
    if-eqz v6, :cond_33

    .line 1016
    .line 1017
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->e()Z

    .line 1018
    .line 1019
    .line 1020
    move-result v6

    .line 1021
    if-eqz v6, :cond_33

    .line 1022
    .line 1023
    iput v1, v10, Landroidx/recyclerview/widget/o;->g:I

    .line 1024
    .line 1025
    goto :goto_17

    .line 1026
    :cond_33
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->e()Z

    .line 1027
    .line 1028
    .line 1029
    move-result v6

    .line 1030
    if-eqz v6, :cond_36

    .line 1031
    .line 1032
    iget v6, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 1033
    .line 1034
    and-int/lit8 v6, v6, 0x2

    .line 1035
    .line 1036
    if-eqz v6, :cond_34

    .line 1037
    .line 1038
    goto :goto_18

    .line 1039
    :cond_34
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->f()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v6

    .line 1043
    if-eqz v6, :cond_35

    .line 1044
    .line 1045
    goto :goto_18

    .line 1046
    :cond_35
    :goto_17
    move/from16 v9, v16

    .line 1047
    .line 1048
    const/4 v6, 0x0

    .line 1049
    const/4 v7, 0x0

    .line 1050
    goto/16 :goto_1f

    .line 1051
    .line 1052
    :cond_36
    :goto_18
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->d:Lq3;

    .line 1053
    .line 1054
    const/4 v7, 0x0

    .line 1055
    invoke-virtual {v6, v1, v7}, Lq3;->g(II)I

    .line 1056
    .line 1057
    .line 1058
    move-result v6

    .line 1059
    const/4 v8, 0x0

    .line 1060
    iput-object v8, v10, Landroidx/recyclerview/widget/o;->s:Landroidx/recyclerview/widget/g;

    .line 1061
    .line 1062
    iput-object v2, v10, Landroidx/recyclerview/widget/o;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1063
    .line 1064
    iget v9, v10, Landroidx/recyclerview/widget/o;->f:I

    .line 1065
    .line 1066
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1067
    .line 1068
    .line 1069
    move-result-wide v11

    .line 1070
    cmp-long v13, p2, v19

    .line 1071
    .line 1072
    if-eqz v13, :cond_38

    .line 1073
    .line 1074
    iget-object v13, v0, Landroidx/recyclerview/widget/l;->g:Lt12;

    .line 1075
    .line 1076
    invoke-virtual {v13, v9}, Lt12;->a(I)Ls12;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v9

    .line 1080
    iget-wide v13, v9, Ls12;->d:J

    .line 1081
    .line 1082
    cmp-long v9, v13, v17

    .line 1083
    .line 1084
    if-eqz v9, :cond_38

    .line 1085
    .line 1086
    add-long/2addr v13, v11

    .line 1087
    cmp-long v9, v13, p2

    .line 1088
    .line 1089
    if-gez v9, :cond_37

    .line 1090
    .line 1091
    goto :goto_19

    .line 1092
    :cond_37
    move v6, v7

    .line 1093
    move/from16 v9, v16

    .line 1094
    .line 1095
    goto/16 :goto_1f

    .line 1096
    .line 1097
    :cond_38
    :goto_19
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->W:Landroidx/recyclerview/widget/g;

    .line 1098
    .line 1099
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1100
    .line 1101
    .line 1102
    iget-object v13, v10, Landroidx/recyclerview/widget/o;->s:Landroidx/recyclerview/widget/g;

    .line 1103
    .line 1104
    if-nez v13, :cond_39

    .line 1105
    .line 1106
    move/from16 v13, v16

    .line 1107
    .line 1108
    goto :goto_1a

    .line 1109
    :cond_39
    move v13, v7

    .line 1110
    :goto_1a
    if-eqz v13, :cond_3b

    .line 1111
    .line 1112
    iput v6, v10, Landroidx/recyclerview/widget/o;->c:I

    .line 1113
    .line 1114
    iget-boolean v14, v9, Landroidx/recyclerview/widget/g;->b:Z

    .line 1115
    .line 1116
    if-eqz v14, :cond_3a

    .line 1117
    .line 1118
    invoke-virtual {v9, v6}, Landroidx/recyclerview/widget/g;->b(I)J

    .line 1119
    .line 1120
    .line 1121
    move-result-wide v14

    .line 1122
    iput-wide v14, v10, Landroidx/recyclerview/widget/o;->e:J

    .line 1123
    .line 1124
    :cond_3a
    iget v14, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 1125
    .line 1126
    and-int/lit16 v14, v14, -0x208

    .line 1127
    .line 1128
    or-int/lit8 v14, v14, 0x1

    .line 1129
    .line 1130
    iput v14, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 1131
    .line 1132
    sget v14, Loq2;->a:I

    .line 1133
    .line 1134
    const-string v14, "RV OnBindView"

    .line 1135
    .line 1136
    invoke-static {v14}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    :cond_3b
    iput-object v9, v10, Landroidx/recyclerview/widget/o;->s:Landroidx/recyclerview/widget/g;

    .line 1140
    .line 1141
    invoke-virtual {v10}, Landroidx/recyclerview/widget/o;->c()Ljava/util/List;

    .line 1142
    .line 1143
    .line 1144
    invoke-virtual {v9, v10, v6}, Landroidx/recyclerview/widget/g;->e(Landroidx/recyclerview/widget/o;I)V

    .line 1145
    .line 1146
    .line 1147
    if-eqz v13, :cond_3e

    .line 1148
    .line 1149
    iget-object v6, v10, Landroidx/recyclerview/widget/o;->k:Ljava/util/ArrayList;

    .line 1150
    .line 1151
    if-eqz v6, :cond_3c

    .line 1152
    .line 1153
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 1154
    .line 1155
    .line 1156
    :cond_3c
    iget v6, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 1157
    .line 1158
    and-int/lit16 v6, v6, -0x401

    .line 1159
    .line 1160
    iput v6, v10, Landroidx/recyclerview/widget/o;->j:I

    .line 1161
    .line 1162
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v6

    .line 1166
    instance-of v9, v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1167
    .line 1168
    if-eqz v9, :cond_3d

    .line 1169
    .line 1170
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1171
    .line 1172
    move/from16 v9, v16

    .line 1173
    .line 1174
    iput-boolean v9, v6, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->c:Z

    .line 1175
    .line 1176
    :cond_3d
    sget v6, Loq2;->a:I

    .line 1177
    .line 1178
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1179
    .line 1180
    .line 1181
    :cond_3e
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1182
    .line 1183
    .line 1184
    move-result-wide v13

    .line 1185
    iget-object v0, v0, Landroidx/recyclerview/widget/l;->g:Lt12;

    .line 1186
    .line 1187
    iget v6, v10, Landroidx/recyclerview/widget/o;->f:I

    .line 1188
    .line 1189
    sub-long/2addr v13, v11

    .line 1190
    invoke-virtual {v0, v6}, Lt12;->a(I)Ls12;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    iget-wide v11, v0, Ls12;->d:J

    .line 1195
    .line 1196
    cmp-long v6, v11, v17

    .line 1197
    .line 1198
    if-nez v6, :cond_3f

    .line 1199
    .line 1200
    goto :goto_1b

    .line 1201
    :cond_3f
    div-long v11, v11, v23

    .line 1202
    .line 1203
    mul-long v11, v11, v21

    .line 1204
    .line 1205
    div-long v13, v13, v23

    .line 1206
    .line 1207
    add-long/2addr v13, v11

    .line 1208
    :goto_1b
    iput-wide v13, v0, Ls12;->d:J

    .line 1209
    .line 1210
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->o0:Landroid/view/accessibility/AccessibilityManager;

    .line 1211
    .line 1212
    if-eqz v0, :cond_45

    .line 1213
    .line 1214
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1215
    .line 1216
    .line 1217
    move-result v0

    .line 1218
    if-eqz v0, :cond_45

    .line 1219
    .line 1220
    sget-object v0, Le33;->a:Ljava/util/WeakHashMap;

    .line 1221
    .line 1222
    invoke-virtual {v5}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1223
    .line 1224
    .line 1225
    move-result v0

    .line 1226
    const/4 v9, 0x1

    .line 1227
    if-nez v0, :cond_40

    .line 1228
    .line 1229
    invoke-virtual {v5, v9}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1230
    .line 1231
    .line 1232
    :cond_40
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView;->Y0:Lc22;

    .line 1233
    .line 1234
    if-nez v0, :cond_41

    .line 1235
    .line 1236
    goto :goto_1e

    .line 1237
    :cond_41
    iget-object v0, v0, Lc22;->e:Lb22;

    .line 1238
    .line 1239
    if-eqz v0, :cond_44

    .line 1240
    .line 1241
    invoke-static {v5}, Le33;->d(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v6

    .line 1245
    if-nez v6, :cond_42

    .line 1246
    .line 1247
    :goto_1c
    move-object v6, v8

    .line 1248
    goto :goto_1d

    .line 1249
    :cond_42
    instance-of v8, v6, Ls0;

    .line 1250
    .line 1251
    if-eqz v8, :cond_43

    .line 1252
    .line 1253
    check-cast v6, Ls0;

    .line 1254
    .line 1255
    iget-object v6, v6, Ls0;->a:Lt0;

    .line 1256
    .line 1257
    goto :goto_1d

    .line 1258
    :cond_43
    new-instance v8, Lt0;

    .line 1259
    .line 1260
    invoke-direct {v8, v6}, Lt0;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1261
    .line 1262
    .line 1263
    goto :goto_1c

    .line 1264
    :goto_1d
    if-eqz v6, :cond_44

    .line 1265
    .line 1266
    if-eq v6, v0, :cond_44

    .line 1267
    .line 1268
    iget-object v8, v0, Lb22;->f:Ljava/lang/Object;

    .line 1269
    .line 1270
    check-cast v8, Ljava/util/WeakHashMap;

    .line 1271
    .line 1272
    invoke-virtual {v8, v5, v6}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    :cond_44
    invoke-static {v5, v0}, Le33;->n(Landroid/view/View;Lt0;)V

    .line 1276
    .line 1277
    .line 1278
    goto :goto_1e

    .line 1279
    :cond_45
    const/4 v9, 0x1

    .line 1280
    :goto_1e
    iget-boolean v0, v3, Ly12;->g:Z

    .line 1281
    .line 1282
    if-eqz v0, :cond_46

    .line 1283
    .line 1284
    iput v1, v10, Landroidx/recyclerview/widget/o;->g:I

    .line 1285
    .line 1286
    :cond_46
    move v6, v9

    .line 1287
    :goto_1f
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    if-nez v0, :cond_47

    .line 1292
    .line 1293
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v0

    .line 1297
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1298
    .line 1299
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1300
    .line 1301
    .line 1302
    goto :goto_20

    .line 1303
    :cond_47
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1304
    .line 1305
    .line 1306
    move-result v1

    .line 1307
    if-nez v1, :cond_48

    .line 1308
    .line 1309
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1314
    .line 1315
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1316
    .line 1317
    .line 1318
    goto :goto_20

    .line 1319
    :cond_48
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;

    .line 1320
    .line 1321
    :goto_20
    iput-object v10, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->a:Landroidx/recyclerview/widget/o;

    .line 1322
    .line 1323
    if-eqz v4, :cond_49

    .line 1324
    .line 1325
    if-eqz v6, :cond_49

    .line 1326
    .line 1327
    move v7, v9

    .line 1328
    :cond_49
    iput-boolean v7, v0, Landroidx/recyclerview/widget/RecyclerView$LayoutParams;->d:Z

    .line 1329
    .line 1330
    return-object v10

    .line 1331
    :cond_4a
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 1332
    .line 1333
    invoke-virtual {v3}, Ly12;->b()I

    .line 1334
    .line 1335
    .line 1336
    move-result v3

    .line 1337
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->z()Ljava/lang/String;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v2

    .line 1341
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1342
    .line 1343
    const-string v5, "Invalid item position "

    .line 1344
    .line 1345
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1346
    .line 1347
    .line 1348
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1349
    .line 1350
    .line 1351
    const-string v5, "("

    .line 1352
    .line 1353
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1357
    .line 1358
    .line 1359
    const-string v1, "). Item count:"

    .line 1360
    .line 1361
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1362
    .line 1363
    .line 1364
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1365
    .line 1366
    .line 1367
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1368
    .line 1369
    .line 1370
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v1

    .line 1374
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1375
    .line 1376
    .line 1377
    throw v0
.end method

.method public final j(Landroidx/recyclerview/widget/o;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Landroidx/recyclerview/widget/o;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object p0, p0, Landroidx/recyclerview/widget/l;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 p0, 0x0

    .line 17
    iput-object p0, p1, Landroidx/recyclerview/widget/o;->n:Landroidx/recyclerview/widget/l;

    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    iput-boolean p0, p1, Landroidx/recyclerview/widget/o;->o:Z

    .line 21
    .line 22
    iget p0, p1, Landroidx/recyclerview/widget/o;->j:I

    .line 23
    .line 24
    and-int/lit8 p0, p0, -0x21

    .line 25
    .line 26
    iput p0, p1, Landroidx/recyclerview/widget/o;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/l;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Landroidx/recyclerview/widget/k;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Landroidx/recyclerview/widget/k;->U:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Landroidx/recyclerview/widget/l;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Landroidx/recyclerview/widget/l;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/recyclerview/widget/l;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Landroidx/recyclerview/widget/l;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/l;->e(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method
