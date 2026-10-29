.class public abstract Ln12;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lh12;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public static b(Landroidx/recyclerview/widget/o;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/o;->j:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/o;->f()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    and-int/lit8 v0, v0, 0x4

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/o;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->G(Landroidx/recyclerview/widget/o;)I

    .line 20
    .line 21
    .line 22
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract a(Landroidx/recyclerview/widget/o;Landroidx/recyclerview/widget/o;Lm12;Lm12;)Z
.end method

.method public final c(Landroidx/recyclerview/widget/o;)V
    .locals 9

    .line 1
    iget-object p0, p0, Ln12;->a:Lh12;

    .line 2
    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    iget-object p0, p0, Lh12;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/o;->n(Z)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p1, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 12
    .line 13
    iget-object v2, p1, Landroidx/recyclerview/widget/o;->h:Landroidx/recyclerview/widget/o;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, p1, Landroidx/recyclerview/widget/o;->i:Landroidx/recyclerview/widget/o;

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    iput-object v3, p1, Landroidx/recyclerview/widget/o;->h:Landroidx/recyclerview/widget/o;

    .line 23
    .line 24
    :cond_0
    iput-object v3, p1, Landroidx/recyclerview/widget/o;->i:Landroidx/recyclerview/widget/o;

    .line 25
    .line 26
    iget v2, p1, Landroidx/recyclerview/widget/o;->j:I

    .line 27
    .line 28
    and-int/lit8 v2, v2, 0x10

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->b:Landroidx/recyclerview/widget/l;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->f0()V

    .line 36
    .line 37
    .line 38
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->e:Lec;

    .line 39
    .line 40
    iget-object v4, v3, Lec;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Lbu;

    .line 43
    .line 44
    iget-object v5, v3, Lec;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Lts0;

    .line 47
    .line 48
    iget-object v6, v5, Lts0;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const/4 v7, -0x1

    .line 57
    const/4 v8, 0x0

    .line 58
    if-ne v6, v7, :cond_2

    .line 59
    .line 60
    invoke-virtual {v3, v1}, Lec;->O(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    invoke-virtual {v4, v6}, Lbu;->d(I)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_3

    .line 69
    .line 70
    invoke-virtual {v4, v6}, Lbu;->f(I)Z

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v1}, Lec;->O(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v6}, Lts0;->D(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move v0, v8

    .line 81
    :goto_0
    if-eqz v0, :cond_4

    .line 82
    .line 83
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroid/view/View;)Landroidx/recyclerview/widget/o;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/l;->j(Landroidx/recyclerview/widget/o;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/l;->g(Landroidx/recyclerview/widget/o;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    xor-int/lit8 v2, v0, 0x1

    .line 94
    .line 95
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->g0(Z)V

    .line 96
    .line 97
    .line 98
    if-nez v0, :cond_5

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/recyclerview/widget/o;->j()Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    invoke-virtual {p0, v1, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_1
    return-void
.end method

.method public abstract d(Landroidx/recyclerview/widget/o;)V
.end method

.method public abstract e()V
.end method

.method public abstract f()Z
.end method
