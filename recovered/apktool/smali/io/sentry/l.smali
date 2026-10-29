.class public final Lio/sentry/l;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/a1;
.implements Lio/sentry/android/core/j0;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 19
    iput p1, p0, Lio/sentry/l;->a:I

    iput-object p2, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    iput-object p4, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lio/sentry/l;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance v0, Lk8;

    .line 10
    .line 11
    invoke-direct {v0, p2}, Lk8;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public A()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lio/sentry/a1;

    .line 9
    .line 10
    invoke-interface {v1}, Lio/sentry/a1;->A()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lio/sentry/a1;

    .line 20
    .line 21
    invoke-interface {v1}, Lio/sentry/a1;->A()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lio/sentry/a1;

    .line 31
    .line 32
    invoke-interface {p0}, Lio/sentry/a1;->A()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public B()Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->B()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lio/sentry/a1;

    .line 12
    .line 13
    invoke-interface {v1}, Lio/sentry/a1;->B()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lio/sentry/a1;

    .line 20
    .line 21
    invoke-interface {v2}, Lio/sentry/a1;->B()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1, v2}, Lio/sentry/l;->P(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/util/List;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    if-eqz v4, :cond_1

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_1
    if-eqz v3, :cond_2

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    if-eqz v3, :cond_3

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_3
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    return-object p0
.end method

.method public C(Lio/sentry/c5;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lio/sentry/a1;->C(Lio/sentry/c5;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public D()Lio/sentry/protocol/e;
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/j;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lio/sentry/a1;

    .line 6
    .line 7
    invoke-interface {v1}, Lio/sentry/a1;->D()Lio/sentry/protocol/e;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lio/sentry/a1;

    .line 14
    .line 15
    invoke-interface {v3}, Lio/sentry/a1;->D()Lio/sentry/protocol/e;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object p0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lio/sentry/a1;

    .line 22
    .line 23
    invoke-interface {p0}, Lio/sentry/a1;->D()Lio/sentry/protocol/e;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {v1}, Lio/sentry/a1;->l()Lio/sentry/m6;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Lio/sentry/m6;->getDefaultScopeType()Lio/sentry/f4;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {v0, v2, v3, p0, v1}, Lio/sentry/j;-><init>(Lio/sentry/protocol/e;Lio/sentry/protocol/e;Lio/sentry/protocol/e;Lio/sentry/f4;)V

    .line 36
    .line 37
    .line 38
    return-object v0
.end method

.method public E(Lio/sentry/y3;)Lio/sentry/t3;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1}, Lio/sentry/a1;->E(Lio/sentry/y3;)Lio/sentry/t3;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public F()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->F()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/a1;->F()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/sentry/a1;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/a1;->F()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public G(Lio/sentry/a4;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1}, Lio/sentry/a1;->G(Lio/sentry/a4;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public H(Lio/sentry/protocol/w;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/sentry/a1;->H(Lio/sentry/protocol/w;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lio/sentry/a1;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Lio/sentry/a1;->H(Lio/sentry/protocol/w;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lio/sentry/a1;

    .line 18
    .line 19
    invoke-interface {p0, p1}, Lio/sentry/a1;->H(Lio/sentry/protocol/w;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public I(Lio/sentry/m1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1}, Lio/sentry/a1;->I(Lio/sentry/m1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public J()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->J()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lio/sentry/a1;

    .line 19
    .line 20
    invoke-interface {v0}, Lio/sentry/a1;->J()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lio/sentry/a1;

    .line 34
    .line 35
    invoke-interface {p0}, Lio/sentry/a1;->J()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public K()Lio/sentry/protocol/j0;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->K()Lio/sentry/protocol/j0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/a1;->K()Lio/sentry/protocol/j0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/sentry/a1;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/a1;->K()Lio/sentry/protocol/j0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public L()Lio/sentry/protocol/r;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->L()Lio/sentry/protocol/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/a1;->L()Lio/sentry/protocol/r;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/sentry/a1;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/a1;->L()Lio/sentry/protocol/r;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public M()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/sentry/l;->A()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-static {p0}, Lio/sentry/util/c;->v(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public N()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->N()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/a1;->N()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/sentry/a1;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/a1;->N()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public O(Lio/sentry/t3;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1}, Lio/sentry/a1;->O(Lio/sentry/t3;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public P(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lio/sentry/k;->a:[I

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lio/sentry/a1;

    .line 6
    .line 7
    invoke-interface {p0}, Lio/sentry/a1;->l()Lio/sentry/m6;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lio/sentry/m6;->getDefaultScopeType()Lio/sentry/f4;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    aget p0, v0, p0

    .line 20
    .line 21
    const/4 v0, 0x2

    .line 22
    if-eq p0, v0, :cond_1

    .line 23
    .line 24
    const/4 p2, 0x3

    .line 25
    if-eq p0, p2, :cond_0

    .line 26
    .line 27
    return-object p3

    .line 28
    :cond_0
    return-object p1

    .line 29
    :cond_1
    return-object p2
.end method

.method public Q(Lio/sentry/f4;)Lio/sentry/a1;
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    iget-object v1, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lio/sentry/a1;

    .line 8
    .line 9
    iget-object v2, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lio/sentry/a1;

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    const/4 v4, 0x2

    .line 15
    const/4 v5, 0x1

    .line 16
    if-eqz p1, :cond_4

    .line 17
    .line 18
    sget-object v6, Lio/sentry/k;->a:[I

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    aget p1, v6, p1

    .line 25
    .line 26
    if-eq p1, v5, :cond_3

    .line 27
    .line 28
    if-eq p1, v4, :cond_2

    .line 29
    .line 30
    if-eq p1, v3, :cond_1

    .line 31
    .line 32
    const/4 v6, 0x4

    .line 33
    if-eq p1, v6, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    return-object p0

    .line 37
    :cond_1
    return-object v2

    .line 38
    :cond_2
    return-object v0

    .line 39
    :cond_3
    return-object v1

    .line 40
    :cond_4
    :goto_0
    sget-object p0, Lio/sentry/k;->a:[I

    .line 41
    .line 42
    invoke-interface {v2}, Lio/sentry/a1;->l()Lio/sentry/m6;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Lio/sentry/m6;->getDefaultScopeType()Lio/sentry/f4;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    aget p0, p0, p1

    .line 55
    .line 56
    if-eq p0, v5, :cond_7

    .line 57
    .line 58
    if-eq p0, v4, :cond_6

    .line 59
    .line 60
    if-eq p0, v3, :cond_5

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_5
    return-object v2

    .line 64
    :cond_6
    return-object v0

    .line 65
    :cond_7
    return-object v1
.end method

.method public R(JLio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lio/sentry/android/core/SentryAndroidOptions;

    .line 8
    .line 9
    iget-object v0, v0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Lk8;

    .line 13
    .line 14
    iget-object v0, v3, Lk8;->c:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v4, v0

    .line 17
    check-cast v4, Ljava/util/ArrayList;

    .line 18
    .line 19
    iget-object v0, v3, Lk8;->b:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v5, v0

    .line 22
    check-cast v5, Lio/sentry/android/core/SentryAndroidOptions;

    .line 23
    .line 24
    iget-boolean v0, v3, Lk8;->a:Z

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    :goto_0
    move-object v14, v2

    .line 30
    const/16 p0, 0x0

    .line 31
    .line 32
    goto/16 :goto_10

    .line 33
    .line 34
    :cond_0
    const/4 v8, 0x1

    .line 35
    iput-boolean v8, v3, Lk8;->a:Z

    .line 36
    .line 37
    invoke-virtual {v5}, Lio/sentry/m6;->getOutboxPath()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 48
    .line 49
    const-string v8, "Outbox path is null, skipping native event collection."

    .line 50
    .line 51
    new-array v9, v7, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-interface {v0, v3, v8, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    new-instance v9, Ljava/io/File;

    .line 58
    .line 59
    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v9}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    if-nez v9, :cond_2

    .line 67
    .line 68
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    sget-object v8, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 73
    .line 74
    const-string v9, "Outbox path is not a directory or an I/O error occurred: %s"

    .line 75
    .line 76
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-interface {v3, v8, v9, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    array-length v0, v9

    .line 85
    if-nez v0, :cond_3

    .line 86
    .line 87
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 92
    .line 93
    const-string v8, "No envelope files found in outbox."

    .line 94
    .line 95
    new-array v9, v7, [Ljava/lang/Object;

    .line 96
    .line 97
    invoke-interface {v0, v3, v8, v9}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    sget-object v10, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 106
    .line 107
    array-length v11, v9

    .line 108
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    const-string v12, "Scanning %d files in outbox for native events."

    .line 117
    .line 118
    invoke-interface {v0, v10, v12, v11}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    array-length v10, v9

    .line 122
    move v11, v7

    .line 123
    :goto_1
    if-ge v11, v10, :cond_15

    .line 124
    .line 125
    aget-object v12, v9, v11

    .line 126
    .line 127
    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_13

    .line 132
    .line 133
    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-eqz v0, :cond_13

    .line 138
    .line 139
    const-string v13, "session"

    .line 140
    .line 141
    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v13

    .line 145
    if-nez v13, :cond_13

    .line 146
    .line 147
    const-string v13, "previous_session"

    .line 148
    .line 149
    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v13

    .line 153
    if-nez v13, :cond_13

    .line 154
    .line 155
    const-string v13, "startup_crash"

    .line 156
    .line 157
    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-nez v0, :cond_13

    .line 162
    .line 163
    :try_start_0
    new-instance v13, Ljava/io/BufferedInputStream;

    .line 164
    .line 165
    new-instance v0, Ljava/io/FileInputStream;

    .line 166
    .line 167
    invoke-direct {v0, v12}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 168
    .line 169
    .line 170
    invoke-direct {v13, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 171
    .line 172
    .line 173
    move v0, v7

    .line 174
    :cond_4
    :try_start_1
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    .line 175
    .line 176
    .line 177
    move-result v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    .line 178
    const/16 v15, 0xa

    .line 179
    .line 180
    const/16 p0, 0x0

    .line 181
    .line 182
    const/4 v6, -0x1

    .line 183
    if-eq v14, v6, :cond_5

    .line 184
    .line 185
    add-int/lit8 v0, v0, 0x1

    .line 186
    .line 187
    if-ne v14, v15, :cond_4

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_5
    if-lez v0, :cond_6

    .line 191
    .line 192
    goto :goto_2

    .line 193
    :cond_6
    move v0, v6

    .line 194
    :goto_2
    if-gez v0, :cond_7

    .line 195
    .line 196
    :try_start_2
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 197
    .line 198
    .line 199
    move-object/from16 v0, p0

    .line 200
    .line 201
    move-object v14, v2

    .line 202
    move-object/from16 v19, v3

    .line 203
    .line 204
    move/from16 v17, v8

    .line 205
    .line 206
    move-object/from16 v16, v9

    .line 207
    .line 208
    goto/16 :goto_e

    .line 209
    .line 210
    :catchall_0
    move-exception v0

    .line 211
    move-object v14, v2

    .line 212
    move-object/from16 v19, v3

    .line 213
    .line 214
    move/from16 v17, v8

    .line 215
    .line 216
    move-object/from16 v16, v9

    .line 217
    .line 218
    goto/16 :goto_c

    .line 219
    .line 220
    :cond_7
    move v14, v8

    .line 221
    move-object/from16 v16, v9

    .line 222
    .line 223
    int-to-long v8, v0

    .line 224
    :goto_3
    const-wide/32 v17, 0xc800000

    .line 225
    .line 226
    .line 227
    cmp-long v0, v8, v17

    .line 228
    .line 229
    if-gez v0, :cond_12

    .line 230
    .line 231
    :try_start_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 234
    .line 235
    .line 236
    move/from16 v17, v14

    .line 237
    .line 238
    :goto_4
    :try_start_4
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    .line 239
    .line 240
    .line 241
    move-result v14

    .line 242
    if-eq v14, v6, :cond_9

    .line 243
    .line 244
    if-ne v14, v15, :cond_8

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    goto :goto_5

    .line 251
    :cond_8
    int-to-char v14, v14

    .line 252
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    goto :goto_4

    .line 256
    :cond_9
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 257
    .line 258
    .line 259
    move-result v14

    .line 260
    if-lez v14, :cond_a

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    goto :goto_5

    .line 267
    :cond_a
    move-object/from16 v0, p0

    .line 268
    .line 269
    :goto_5
    if-eqz v0, :cond_b

    .line 270
    .line 271
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 272
    .line 273
    .line 274
    move-result v14

    .line 275
    if-eqz v14, :cond_c

    .line 276
    .line 277
    :cond_b
    :goto_6
    move-object v14, v2

    .line 278
    move-object/from16 v19, v3

    .line 279
    .line 280
    goto/16 :goto_9

    .line 281
    .line 282
    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    add-int/lit8 v14, v14, 0x1

    .line 287
    .line 288
    move-wide/from16 v19, v8

    .line 289
    .line 290
    int-to-long v7, v14

    .line 291
    add-long v8, v19, v7

    .line 292
    .line 293
    invoke-virtual {v3, v0}, Lk8;->k(Ljava/lang/String;)Ljj;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    if-nez v0, :cond_d

    .line 298
    .line 299
    goto :goto_6

    .line 300
    :cond_d
    iget v7, v0, Ljj;->a:I

    .line 301
    .line 302
    const-string v14, "event"

    .line 303
    .line 304
    iget-object v0, v0, Ljj;->b:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_f

    .line 311
    .line 312
    invoke-virtual {v3, v13, v7, v12}, Lk8;->e(Ljava/io/BufferedInputStream;ILjava/io/File;)Lio/sentry/android/core/b1;

    .line 313
    .line 314
    .line 315
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 316
    if-eqz v0, :cond_e

    .line 317
    .line 318
    :try_start_5
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 319
    .line 320
    .line 321
    move-object v14, v2

    .line 322
    move-object/from16 v19, v3

    .line 323
    .line 324
    goto/16 :goto_e

    .line 325
    .line 326
    :catchall_1
    move-exception v0

    .line 327
    move-object v14, v2

    .line 328
    move-object/from16 v19, v3

    .line 329
    .line 330
    goto/16 :goto_c

    .line 331
    .line 332
    :cond_e
    move-object v14, v2

    .line 333
    move-object/from16 v19, v3

    .line 334
    .line 335
    goto :goto_8

    .line 336
    :catchall_2
    move-exception v0

    .line 337
    move-object v14, v2

    .line 338
    move-object/from16 v19, v3

    .line 339
    .line 340
    :goto_7
    move-object v2, v0

    .line 341
    goto :goto_a

    .line 342
    :cond_f
    move-object v14, v2

    .line 343
    move-object/from16 v19, v3

    .line 344
    .line 345
    int-to-long v2, v7

    .line 346
    :try_start_6
    invoke-static {v13, v2, v3}, Lk8;->l(Ljava/io/BufferedInputStream;J)V

    .line 347
    .line 348
    .line 349
    :goto_8
    int-to-long v2, v7

    .line 350
    add-long/2addr v8, v2

    .line 351
    invoke-virtual {v13}, Ljava/io/InputStream;->read()I

    .line 352
    .line 353
    .line 354
    move-result v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 355
    if-ne v0, v6, :cond_10

    .line 356
    .line 357
    goto :goto_9

    .line 358
    :cond_10
    const-wide/16 v2, 0x1

    .line 359
    .line 360
    add-long/2addr v8, v2

    .line 361
    if-eq v0, v15, :cond_11

    .line 362
    .line 363
    goto :goto_9

    .line 364
    :cond_11
    move-object v2, v14

    .line 365
    move/from16 v14, v17

    .line 366
    .line 367
    move-object/from16 v3, v19

    .line 368
    .line 369
    const/4 v7, 0x0

    .line 370
    goto/16 :goto_3

    .line 371
    .line 372
    :catchall_3
    move-exception v0

    .line 373
    goto :goto_7

    .line 374
    :catchall_4
    move-exception v0

    .line 375
    move-object/from16 v19, v3

    .line 376
    .line 377
    move/from16 v17, v14

    .line 378
    .line 379
    move-object v14, v2

    .line 380
    goto :goto_7

    .line 381
    :cond_12
    move-object/from16 v19, v3

    .line 382
    .line 383
    move/from16 v17, v14

    .line 384
    .line 385
    move-object v14, v2

    .line 386
    :goto_9
    :try_start_7
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 387
    .line 388
    .line 389
    goto :goto_d

    .line 390
    :catchall_5
    move-exception v0

    .line 391
    goto :goto_c

    .line 392
    :catchall_6
    move-exception v0

    .line 393
    move-object v14, v2

    .line 394
    move-object/from16 v19, v3

    .line 395
    .line 396
    move/from16 v17, v8

    .line 397
    .line 398
    move-object/from16 v16, v9

    .line 399
    .line 400
    const/16 p0, 0x0

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :goto_a
    :try_start_8
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 404
    .line 405
    .line 406
    goto :goto_b

    .line 407
    :catchall_7
    move-exception v0

    .line 408
    :try_start_9
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 409
    .line 410
    .line 411
    :goto_b
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 412
    :catchall_8
    move-exception v0

    .line 413
    move-object v14, v2

    .line 414
    move-object/from16 v19, v3

    .line 415
    .line 416
    move/from16 v17, v8

    .line 417
    .line 418
    move-object/from16 v16, v9

    .line 419
    .line 420
    const/16 p0, 0x0

    .line 421
    .line 422
    :goto_c
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 427
    .line 428
    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    const-string v7, "Error extracting metadata from envelope file: %s"

    .line 437
    .line 438
    invoke-interface {v2, v3, v0, v7, v6}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :goto_d
    move-object/from16 v0, p0

    .line 442
    .line 443
    :goto_e
    if-eqz v0, :cond_14

    .line 444
    .line 445
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 453
    .line 454
    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v6

    .line 458
    iget-wide v7, v0, Lio/sentry/android/core/b1;->b:J

    .line 459
    .line 460
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    filled-new-array {v6, v0}, [Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    const-string v6, "Found native event in outbox: %s (timestamp: %d)"

    .line 469
    .line 470
    invoke-interface {v2, v3, v6, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    goto :goto_f

    .line 474
    :cond_13
    move-object v14, v2

    .line 475
    move-object/from16 v19, v3

    .line 476
    .line 477
    move/from16 v17, v8

    .line 478
    .line 479
    move-object/from16 v16, v9

    .line 480
    .line 481
    const/16 p0, 0x0

    .line 482
    .line 483
    :cond_14
    :goto_f
    add-int/lit8 v11, v11, 0x1

    .line 484
    .line 485
    move-object v2, v14

    .line 486
    move-object/from16 v9, v16

    .line 487
    .line 488
    move/from16 v8, v17

    .line 489
    .line 490
    move-object/from16 v3, v19

    .line 491
    .line 492
    const/4 v7, 0x0

    .line 493
    goto/16 :goto_1

    .line 494
    .line 495
    :cond_15
    move-object v14, v2

    .line 496
    const/16 p0, 0x0

    .line 497
    .line 498
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    sget-object v2, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 503
    .line 504
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 509
    .line 510
    .line 511
    move-result-object v3

    .line 512
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    const-string v6, "Collected %d native events from outbox."

    .line 517
    .line 518
    invoke-interface {v0, v2, v6, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    :goto_10
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v2

    .line 529
    if-eqz v2, :cond_1b

    .line 530
    .line 531
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    check-cast v2, Lio/sentry/android/core/b1;

    .line 536
    .line 537
    iget-wide v6, v2, Lio/sentry/android/core/b1;->b:J

    .line 538
    .line 539
    sub-long v6, p1, v6

    .line 540
    .line 541
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(J)J

    .line 542
    .line 543
    .line 544
    move-result-wide v6

    .line 545
    const-wide/16 v8, 0x1388

    .line 546
    .line 547
    cmp-long v3, v6, v8

    .line 548
    .line 549
    if-gtz v3, :cond_16

    .line 550
    .line 551
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 556
    .line 557
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 558
    .line 559
    .line 560
    move-result-object v6

    .line 561
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    const-string v7, "Matched native event by timestamp (diff: %d ms)"

    .line 566
    .line 567
    invoke-interface {v0, v3, v7, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    iget-object v2, v2, Lio/sentry/android/core/b1;->a:Ljava/io/File;

    .line 574
    .line 575
    :try_start_a
    new-instance v3, Ljava/io/BufferedInputStream;

    .line 576
    .line 577
    new-instance v0, Ljava/io/FileInputStream;

    .line 578
    .line 579
    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 580
    .line 581
    .line 582
    invoke-direct {v3, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    .line 583
    .line 584
    .line 585
    :try_start_b
    invoke-virtual {v5}, Lio/sentry/m6;->getEnvelopeReader()Lio/sentry/t0;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-interface {v0, v3}, Lio/sentry/t0;->a(Ljava/io/BufferedInputStream;)Lio/sentry/internal/debugmeta/c;

    .line 590
    .line 591
    .line 592
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    .line 593
    if-nez v0, :cond_18

    .line 594
    .line 595
    :cond_17
    :try_start_c
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 596
    .line 597
    .line 598
    goto/16 :goto_17

    .line 599
    .line 600
    :catchall_9
    move-exception v0

    .line 601
    goto/16 :goto_16

    .line 602
    .line 603
    :cond_18
    :try_start_d
    iget-object v4, v0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    .line 604
    .line 605
    check-cast v4, Ljava/lang/Iterable;

    .line 606
    .line 607
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    :goto_11
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    if-eqz v6, :cond_17

    .line 616
    .line 617
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    check-cast v6, Lio/sentry/a5;

    .line 622
    .line 623
    sget-object v7, Lio/sentry/l5;->Event:Lio/sentry/l5;

    .line 624
    .line 625
    iget-object v8, v6, Lio/sentry/a5;->a:Lio/sentry/b5;

    .line 626
    .line 627
    iget-object v8, v8, Lio/sentry/b5;->e:Lio/sentry/l5;

    .line 628
    .line 629
    invoke-virtual {v7, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v7

    .line 633
    if-nez v7, :cond_19

    .line 634
    .line 635
    goto :goto_11

    .line 636
    :cond_19
    new-instance v7, Ljava/io/BufferedReader;

    .line 637
    .line 638
    new-instance v8, Ljava/io/InputStreamReader;

    .line 639
    .line 640
    new-instance v9, Ljava/io/ByteArrayInputStream;

    .line 641
    .line 642
    invoke-virtual {v6}, Lio/sentry/a5;->f()[B

    .line 643
    .line 644
    .line 645
    move-result-object v6

    .line 646
    invoke-direct {v9, v6}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 647
    .line 648
    .line 649
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 650
    .line 651
    invoke-direct {v8, v9, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 652
    .line 653
    .line 654
    invoke-direct {v7, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 655
    .line 656
    .line 657
    :try_start_e
    invoke-virtual {v5}, Lio/sentry/m6;->getSerializer()Lio/sentry/i1;

    .line 658
    .line 659
    .line 660
    move-result-object v6

    .line 661
    const-class v8, Lio/sentry/c5;

    .line 662
    .line 663
    invoke-interface {v6, v7, v8}, Lio/sentry/i1;->b(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v6

    .line 667
    check-cast v6, Lio/sentry/c5;

    .line 668
    .line 669
    if-eqz v6, :cond_1a

    .line 670
    .line 671
    const-string v8, "native"

    .line 672
    .line 673
    iget-object v9, v6, Lio/sentry/q4;->v:Ljava/lang/String;

    .line 674
    .line 675
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    move-result v8

    .line 679
    if-eqz v8, :cond_1a

    .line 680
    .line 681
    new-instance v4, Lio/sentry/l;

    .line 682
    .line 683
    const/4 v8, 0x2

    .line 684
    invoke-direct {v4, v8, v6, v2, v0}, Lio/sentry/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    .line 685
    .line 686
    .line 687
    :try_start_f
    invoke-virtual {v7}, Ljava/io/Reader;->close()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    .line 688
    .line 689
    .line 690
    :try_start_10
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 691
    .line 692
    .line 693
    goto :goto_18

    .line 694
    :catchall_a
    move-exception v0

    .line 695
    move-object v4, v0

    .line 696
    goto :goto_14

    .line 697
    :catchall_b
    move-exception v0

    .line 698
    move-object v4, v0

    .line 699
    goto :goto_12

    .line 700
    :cond_1a
    :try_start_11
    invoke-virtual {v7}, Ljava/io/Reader;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_a

    .line 701
    .line 702
    .line 703
    goto :goto_11

    .line 704
    :goto_12
    :try_start_12
    invoke-virtual {v7}, Ljava/io/Reader;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_c

    .line 705
    .line 706
    .line 707
    goto :goto_13

    .line 708
    :catchall_c
    move-exception v0

    .line 709
    :try_start_13
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 710
    .line 711
    .line 712
    :goto_13
    throw v4
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 713
    :goto_14
    :try_start_14
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_d

    .line 714
    .line 715
    .line 716
    goto :goto_15

    .line 717
    :catchall_d
    move-exception v0

    .line 718
    :try_start_15
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 719
    .line 720
    .line 721
    :goto_15
    throw v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    .line 722
    :goto_16
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 723
    .line 724
    .line 725
    move-result-object v3

    .line 726
    sget-object v4, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 727
    .line 728
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    const-string v6, "Error loading envelope file: %s"

    .line 737
    .line 738
    invoke-interface {v3, v4, v0, v6, v2}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    :cond_1b
    :goto_17
    move-object/from16 v4, p0

    .line 742
    .line 743
    :goto_18
    if-nez v4, :cond_1c

    .line 744
    .line 745
    invoke-virtual {v14}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    sget-object v1, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 750
    .line 751
    const-string v2, "No matching native event found for tombstone."

    .line 752
    .line 753
    const/4 v3, 0x0

    .line 754
    new-array v3, v3, [Ljava/lang/Object;

    .line 755
    .line 756
    invoke-interface {v0, v1, v2, v3}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    return-object p0

    .line 760
    :cond_1c
    iget-object v0, v4, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 761
    .line 762
    move-object v2, v0

    .line 763
    check-cast v2, Ljava/io/File;

    .line 764
    .line 765
    invoke-virtual {v14}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    sget-object v3, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 770
    .line 771
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v6

    .line 775
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v6

    .line 779
    const-string v7, "Found matching native event for tombstone, removing from outbox: %s"

    .line 780
    .line 781
    invoke-interface {v0, v3, v7, v6}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    :try_start_16
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 785
    .line 786
    .line 787
    move-result v0

    .line 788
    if-eqz v0, :cond_24

    .line 789
    .line 790
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    const-string v6, "Deleted native event file from outbox: %s"

    .line 795
    .line 796
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v7

    .line 800
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v7

    .line 804
    invoke-interface {v0, v3, v6, v7}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_10

    .line 805
    .line 806
    .line 807
    iget-object v0, v4, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 808
    .line 809
    move-object v2, v0

    .line 810
    check-cast v2, Lio/sentry/c5;

    .line 811
    .line 812
    invoke-virtual {v1}, Lio/sentry/c5;->d()Ljava/util/ArrayList;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    iget-object v3, v1, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 817
    .line 818
    invoke-virtual {v1}, Lio/sentry/c5;->e()Ljava/util/ArrayList;

    .line 819
    .line 820
    .line 821
    move-result-object v5

    .line 822
    if-eqz v0, :cond_20

    .line 823
    .line 824
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 825
    .line 826
    .line 827
    move-result v6

    .line 828
    if-nez v6, :cond_20

    .line 829
    .line 830
    if-eqz v3, :cond_20

    .line 831
    .line 832
    if-eqz v5, :cond_20

    .line 833
    .line 834
    const/4 v6, 0x0

    .line 835
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v6

    .line 839
    check-cast v6, Lio/sentry/protocol/v;

    .line 840
    .line 841
    iget-object v6, v6, Lio/sentry/protocol/v;->f:Lio/sentry/protocol/o;

    .line 842
    .line 843
    if-eqz v6, :cond_1d

    .line 844
    .line 845
    sget-object v7, Lio/sentry/android/core/internal/tombstone/a;->TOMBSTONE_MERGED:Lio/sentry/android/core/internal/tombstone/a;

    .line 846
    .line 847
    invoke-virtual {v7}, Lio/sentry/android/core/internal/tombstone/a;->getValue()Ljava/lang/String;

    .line 848
    .line 849
    .line 850
    move-result-object v7

    .line 851
    iput-object v7, v6, Lio/sentry/protocol/o;->a:Ljava/lang/String;

    .line 852
    .line 853
    :cond_1d
    iget-object v6, v2, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 854
    .line 855
    if-eqz v6, :cond_1e

    .line 856
    .line 857
    iget-object v6, v6, Lio/sentry/protocol/p;->b:Ljava/lang/String;

    .line 858
    .line 859
    if-eqz v6, :cond_1e

    .line 860
    .line 861
    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    .line 862
    .line 863
    .line 864
    move-result v6

    .line 865
    if-eqz v6, :cond_1f

    .line 866
    .line 867
    :cond_1e
    iget-object v1, v1, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 868
    .line 869
    iput-object v1, v2, Lio/sentry/c5;->b0:Lio/sentry/protocol/p;

    .line 870
    .line 871
    :cond_1f
    new-instance v1, Lio/sentry/d2;

    .line 872
    .line 873
    invoke-direct {v1, v0}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 874
    .line 875
    .line 876
    iput-object v1, v2, Lio/sentry/c5;->e0:Lio/sentry/d2;

    .line 877
    .line 878
    iput-object v3, v2, Lio/sentry/q4;->Y:Lio/sentry/protocol/f;

    .line 879
    .line 880
    new-instance v0, Lio/sentry/d2;

    .line 881
    .line 882
    invoke-direct {v0, v5}, Lio/sentry/d2;-><init>(Ljava/util/List;)V

    .line 883
    .line 884
    .line 885
    iput-object v0, v2, Lio/sentry/c5;->d0:Lio/sentry/d2;

    .line 886
    .line 887
    :cond_20
    iget-object v0, v4, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 888
    .line 889
    check-cast v0, Lio/sentry/internal/debugmeta/c;

    .line 890
    .line 891
    iget-object v0, v0, Lio/sentry/internal/debugmeta/c;->c:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v0, Ljava/lang/Iterable;

    .line 894
    .line 895
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 900
    .line 901
    .line 902
    move-result v0

    .line 903
    if-eqz v0, :cond_23

    .line 904
    .line 905
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v0

    .line 909
    check-cast v0, Lio/sentry/a5;

    .line 910
    .line 911
    :try_start_17
    iget-object v3, v0, Lio/sentry/a5;->a:Lio/sentry/b5;

    .line 912
    .line 913
    iget-object v4, v3, Lio/sentry/b5;->c:Ljava/lang/String;

    .line 914
    .line 915
    iget-object v3, v3, Lio/sentry/b5;->e:Lio/sentry/l5;

    .line 916
    .line 917
    sget-object v5, Lio/sentry/l5;->Attachment:Lio/sentry/l5;

    .line 918
    .line 919
    if-ne v3, v5, :cond_21

    .line 920
    .line 921
    if-nez v4, :cond_22

    .line 922
    .line 923
    :cond_21
    move-object/from16 v4, p4

    .line 924
    .line 925
    goto :goto_19

    .line 926
    :cond_22
    new-instance v3, Lio/sentry/a;

    .line 927
    .line 928
    invoke-virtual {v0}, Lio/sentry/a5;->f()[B

    .line 929
    .line 930
    .line 931
    move-result-object v5

    .line 932
    iget-object v0, v0, Lio/sentry/a5;->a:Lio/sentry/b5;

    .line 933
    .line 934
    iget-object v6, v0, Lio/sentry/b5;->a:Ljava/lang/String;

    .line 935
    .line 936
    iget-object v0, v0, Lio/sentry/b5;->v:Ljava/lang/String;

    .line 937
    .line 938
    invoke-direct {v3, v4, v6, v0, v5}, Lio/sentry/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_f

    .line 939
    .line 940
    .line 941
    move-object/from16 v4, p4

    .line 942
    .line 943
    :try_start_18
    iget-object v0, v4, Lio/sentry/i0;->b:Ljava/util/ArrayList;

    .line 944
    .line 945
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_e

    .line 946
    .line 947
    .line 948
    goto :goto_19

    .line 949
    :catchall_e
    move-exception v0

    .line 950
    goto :goto_1a

    .line 951
    :catchall_f
    move-exception v0

    .line 952
    move-object/from16 v4, p4

    .line 953
    .line 954
    :goto_1a
    invoke-virtual {v14}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 955
    .line 956
    .line 957
    move-result-object v3

    .line 958
    sget-object v5, Lio/sentry/m5;->DEBUG:Lio/sentry/m5;

    .line 959
    .line 960
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    const-string v6, "Failed to process envelope item: %s"

    .line 969
    .line 970
    invoke-interface {v3, v5, v6, v0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    goto :goto_19

    .line 974
    :cond_23
    return-object v2

    .line 975
    :catchall_10
    move-exception v0

    .line 976
    goto :goto_1b

    .line 977
    :cond_24
    :try_start_19
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 982
    .line 983
    const-string v3, "Failed to delete native event file: %s"

    .line 984
    .line 985
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v4

    .line 989
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    invoke-interface {v0, v1, v3, v4}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_10

    .line 994
    .line 995
    .line 996
    goto :goto_1c

    .line 997
    :goto_1b
    invoke-virtual {v5}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 998
    .line 999
    .line 1000
    move-result-object v1

    .line 1001
    sget-object v3, Lio/sentry/m5;->ERROR:Lio/sentry/m5;

    .line 1002
    .line 1003
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v2

    .line 1007
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v2

    .line 1011
    const-string v4, "Error deleting native event file: %s"

    .line 1012
    .line 1013
    invoke-interface {v1, v3, v0, v4, v2}, Lio/sentry/ILogger;->b(Lio/sentry/m5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1014
    .line 1015
    .line 1016
    :goto_1c
    return-object p0
.end method

.method public a()I
    .locals 0

    .line 1
    const/4 p0, 0x5

    .line 2
    return p0
.end method

.method public b()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    const-string v0, "last_tombstone_report"

    .line 6
    .line 7
    const-string v1, "Tombstone"

    .line 8
    .line 9
    invoke-static {p0, v0, v1}, Lio/sentry/android/core/cache/b;->h(Lio/sentry/m6;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public c(Ljava/lang/Throwable;Lio/sentry/a7;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, Lio/sentry/a1;->c(Ljava/lang/Throwable;Lio/sentry/a7;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0}, Lio/sentry/a1;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public clone()Lio/sentry/a1;
    .locals 4

    .line 1
    new-instance v0, Lio/sentry/l;

    .line 2
    .line 3
    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lio/sentry/a1;

    .line 6
    .line 7
    iget-object v2, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lio/sentry/a1;

    .line 10
    .line 11
    invoke-interface {v2}, Lio/sentry/a1;->clone()Lio/sentry/a1;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object p0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lio/sentry/a1;

    .line 18
    .line 19
    invoke-interface {p0}, Lio/sentry/a1;->clone()Lio/sentry/a1;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v0, v3, v1, v2, p0}, Lio/sentry/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/sentry/l;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 28
    :pswitch_0
    invoke-virtual {p0}, Lio/sentry/l;->clone()Lio/sentry/a1;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Tombstone"

    .line 2
    .line 3
    return-object p0
.end method

.method public e()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/SentryAndroidOptions;

    .line 4
    .line 5
    invoke-virtual {p0}, Lio/sentry/android/core/SentryAndroidOptions;->isReportHistoricalTombstones()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public f(Lio/sentry/f;Lio/sentry/i0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1, p2}, Lio/sentry/a1;->f(Lio/sentry/f;Lio/sentry/i0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public g()Lio/sentry/k1;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->g()Lio/sentry/k1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/a1;->g()Lio/sentry/k1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/sentry/a1;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/a1;->g()Lio/sentry/k1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public getAttributes()Ljava/util/Map;
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->getAttributes()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lio/sentry/a1;

    .line 12
    .line 13
    invoke-interface {v1}, Lio/sentry/a1;->getAttributes()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lio/sentry/a1;

    .line 20
    .line 21
    invoke-interface {v2}, Lio/sentry/a1;->getAttributes()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1, v2}, Lio/sentry/l;->P(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/util/Map;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    if-eqz v4, :cond_1

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_1
    if-eqz v3, :cond_2

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    if-eqz v3, :cond_3

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_3
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method

.method public getExtras()Ljava/util/Map;
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->getExtras()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lio/sentry/a1;

    .line 12
    .line 13
    invoke-interface {v1}, Lio/sentry/a1;->getExtras()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lio/sentry/a1;

    .line 20
    .line 21
    invoke-interface {v2}, Lio/sentry/a1;->getExtras()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1, v2}, Lio/sentry/l;->P(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/util/Map;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    if-eqz v4, :cond_1

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_1
    if-eqz v3, :cond_2

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    if-eqz v3, :cond_3

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_3
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method

.method public h()Lio/sentry/protocol/j;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/sentry/l;->q()Lio/sentry/featureflags/b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Lio/sentry/featureflags/b;->h()Lio/sentry/protocol/j;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public i()Lio/sentry/protocol/w;
    .locals 3

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->i()Lio/sentry/protocol/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Lio/sentry/protocol/w;->b:Lio/sentry/protocol/w;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lio/sentry/a1;

    .line 21
    .line 22
    invoke-interface {v0}, Lio/sentry/a1;->i()Lio/sentry/protocol/w;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v1, v0}, Lio/sentry/protocol/w;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Lio/sentry/a1;

    .line 36
    .line 37
    invoke-interface {p0}, Lio/sentry/a1;->i()Lio/sentry/protocol/w;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public j(Lio/sentry/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1}, Lio/sentry/a1;->j(Lio/sentry/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public k(Lio/sentry/protocol/w;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1}, Lio/sentry/a1;->k(Lio/sentry/protocol/w;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public l()Lio/sentry/m6;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {p0}, Lio/sentry/a1;->l()Lio/sentry/m6;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public m()Lio/sentry/m1;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->m()Lio/sentry/m1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/a1;->m()Lio/sentry/m1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/sentry/a1;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/a1;->m()Lio/sentry/m1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public n()Lio/sentry/z6;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0}, Lio/sentry/a1;->n()Lio/sentry/z6;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public o()Lio/sentry/internal/debugmeta/c;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0}, Lio/sentry/a1;->o()Lio/sentry/internal/debugmeta/c;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public p()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0}, Lio/sentry/a1;->p()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public q()Lio/sentry/featureflags/b;
    .locals 8

    .line 1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->l()Lio/sentry/m6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lio/sentry/a1;

    .line 12
    .line 13
    invoke-interface {v1}, Lio/sentry/a1;->q()Lio/sentry/featureflags/b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lio/sentry/a1;

    .line 20
    .line 21
    invoke-interface {v2}, Lio/sentry/a1;->q()Lio/sentry/featureflags/b;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    iget-object p0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Lio/sentry/a1;

    .line 28
    .line 29
    invoke-interface {p0}, Lio/sentry/a1;->q()Lio/sentry/featureflags/b;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object v3, Lio/sentry/featureflags/c;->a:Lio/sentry/featureflags/c;

    .line 34
    .line 35
    invoke-virtual {v0}, Lio/sentry/m6;->getMaxFeatureFlags()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-gtz v0, :cond_0

    .line 40
    .line 41
    goto :goto_9

    .line 42
    :cond_0
    instance-of v4, v1, Lio/sentry/featureflags/a;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    check-cast v1, Lio/sentry/featureflags/a;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move-object v1, v5

    .line 51
    :goto_0
    instance-of v4, v2, Lio/sentry/featureflags/a;

    .line 52
    .line 53
    if-eqz v4, :cond_2

    .line 54
    .line 55
    check-cast v2, Lio/sentry/featureflags/a;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move-object v2, v5

    .line 59
    :goto_1
    instance-of v4, p0, Lio/sentry/featureflags/a;

    .line 60
    .line 61
    if-eqz v4, :cond_3

    .line 62
    .line 63
    check-cast p0, Lio/sentry/featureflags/a;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object p0, v5

    .line 67
    :goto_2
    if-nez v1, :cond_4

    .line 68
    .line 69
    move-object v1, v5

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    iget-object v1, v1, Lio/sentry/featureflags/a;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 72
    .line 73
    :goto_3
    if-nez v2, :cond_5

    .line 74
    .line 75
    move-object v2, v5

    .line 76
    goto :goto_4

    .line 77
    :cond_5
    iget-object v2, v2, Lio/sentry/featureflags/a;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 78
    .line 79
    :goto_4
    if-nez p0, :cond_6

    .line 80
    .line 81
    move-object p0, v5

    .line 82
    goto :goto_5

    .line 83
    :cond_6
    iget-object p0, p0, Lio/sentry/featureflags/a;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 84
    .line 85
    :goto_5
    const/4 v4, 0x0

    .line 86
    if-nez v1, :cond_7

    .line 87
    .line 88
    move v6, v4

    .line 89
    goto :goto_6

    .line 90
    :cond_7
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    :goto_6
    if-nez v2, :cond_8

    .line 95
    .line 96
    move v7, v4

    .line 97
    goto :goto_7

    .line 98
    :cond_8
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    :goto_7
    if-nez p0, :cond_9

    .line 103
    .line 104
    goto :goto_8

    .line 105
    :cond_9
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->size()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    :goto_8
    if-nez v6, :cond_a

    .line 110
    .line 111
    if-nez v7, :cond_a

    .line 112
    .line 113
    if-nez v4, :cond_a

    .line 114
    .line 115
    :goto_9
    return-object v3

    .line 116
    :cond_a
    add-int/lit8 v6, v6, -0x1

    .line 117
    .line 118
    add-int/lit8 v7, v7, -0x1

    .line 119
    .line 120
    add-int/lit8 v4, v4, -0x1

    .line 121
    .line 122
    if-eqz v1, :cond_d

    .line 123
    .line 124
    if-gez v6, :cond_b

    .line 125
    .line 126
    goto :goto_a

    .line 127
    :cond_b
    invoke-virtual {v1, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-nez v1, :cond_c

    .line 132
    .line 133
    goto :goto_a

    .line 134
    :cond_c
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 135
    .line 136
    .line 137
    return-object v5

    .line 138
    :cond_d
    :goto_a
    if-eqz v2, :cond_10

    .line 139
    .line 140
    if-gez v7, :cond_e

    .line 141
    .line 142
    goto :goto_b

    .line 143
    :cond_e
    invoke-virtual {v2, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-nez v1, :cond_f

    .line 148
    .line 149
    goto :goto_b

    .line 150
    :cond_f
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 151
    .line 152
    .line 153
    return-object v5

    .line 154
    :cond_10
    :goto_b
    if-eqz p0, :cond_13

    .line 155
    .line 156
    if-gez v4, :cond_11

    .line 157
    .line 158
    goto :goto_c

    .line 159
    :cond_11
    invoke-virtual {p0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    if-nez p0, :cond_12

    .line 164
    .line 165
    goto :goto_c

    .line 166
    :cond_12
    invoke-static {}, Lio/sentry/u2;->g()V

    .line 167
    .line 168
    .line 169
    return-object v5

    .line 170
    :cond_13
    :goto_c
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 171
    .line 172
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 176
    .line 177
    .line 178
    new-instance v1, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 188
    .line 189
    .line 190
    new-instance p0, Lio/sentry/featureflags/a;

    .line 191
    .line 192
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 193
    .line 194
    invoke-direct {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 195
    .line 196
    .line 197
    invoke-direct {p0, v0, v2}, Lio/sentry/featureflags/a;-><init>(ILjava/util/concurrent/CopyOnWriteArrayList;)V

    .line 198
    .line 199
    .line 200
    return-object p0
.end method

.method public r()Lio/sentry/z6;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->r()Lio/sentry/z6;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/a1;->r()Lio/sentry/z6;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/sentry/a1;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/a1;->r()Lio/sentry/z6;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public s()Ljava/util/Queue;
    .locals 7

    .line 1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->s()Ljava/util/Queue;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lio/sentry/a1;

    .line 12
    .line 13
    invoke-interface {v1}, Lio/sentry/a1;->s()Ljava/util/Queue;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lio/sentry/a1;

    .line 20
    .line 21
    invoke-interface {v2}, Lio/sentry/a1;->s()Ljava/util/Queue;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1, v3}, Lio/sentry/l;->P(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/util/Queue;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    if-eqz v5, :cond_1

    .line 51
    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_1
    if-eqz v4, :cond_2

    .line 56
    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    if-eqz v4, :cond_3

    .line 61
    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    return-object v3

    .line 65
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v2}, Lio/sentry/a1;->l()Lio/sentry/m6;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lio/sentry/m6;->getMaxBreadcrumbs()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-static {v0}, Lio/sentry/b4;->a(I)Ljava/util/Queue;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {v0, p0}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 95
    .line 96
    .line 97
    return-object v0
.end method

.method public t()Lio/sentry/m5;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->t()Lio/sentry/m5;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lio/sentry/a1;

    .line 15
    .line 16
    invoke-interface {v0}, Lio/sentry/a1;->t()Lio/sentry/m5;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, Lio/sentry/a1;

    .line 26
    .line 27
    invoke-interface {p0}, Lio/sentry/a1;->t()Lio/sentry/m5;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public u()Lio/sentry/t3;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0}, Lio/sentry/a1;->u()Lio/sentry/t3;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public v(Lio/sentry/z3;)Lio/sentry/z6;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1}, Lio/sentry/a1;->v(Lio/sentry/z3;)Lio/sentry/z6;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public w(Landroid/app/ApplicationExitInfo;Z)Lio/sentry/l;
    .locals 14

    .line 1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    invoke-virtual {v1}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachRawTombstone()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p1}, Lcom/appsflyer/internal/o;->f(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    if-nez v3, :cond_1

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 22
    .line 23
    const-string v4, "No tombstone InputStream available for ApplicationExitInfo from %s"

    .line 24
    .line 25
    invoke-static {}, Lcom/appsflyer/internal/n;->h()Ljava/time/format/DateTimeFormatter;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Lcom/appsflyer/internal/o;->b(Landroid/app/ApplicationExitInfo;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    invoke-static {v5, v6}, Lcom/appsflyer/internal/n;->g(J)Ljava/time/Instant;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Lcom/appsflyer/internal/n;->e(Ljava/time/Instant;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-interface {p0, v0, v4, v5}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 45
    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object p0, v0

    .line 55
    goto/16 :goto_6

    .line 56
    .line 57
    :cond_0
    return-object v2

    .line 58
    :catchall_1
    move-exception v0

    .line 59
    move-object p0, v0

    .line 60
    goto/16 :goto_4

    .line 61
    .line 62
    :cond_1
    if-eqz v0, :cond_2

    .line 63
    .line 64
    :try_start_3
    invoke-static {v3}, Lio/sentry/config/a;->t(Ljava/io/InputStream;)[B

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v4, v2

    .line 70
    :goto_0
    if-eqz v0, :cond_3

    .line 71
    .line 72
    new-instance v0, Ljava/io/ByteArrayInputStream;

    .line 73
    .line 74
    invoke-direct {v0, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move-object v0, v3

    .line 79
    :goto_1
    new-instance v5, Lio/sentry/android/core/internal/tombstone/c;

    .line 80
    .line 81
    invoke-virtual {v1}, Lio/sentry/m6;->getInAppIncludes()Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-virtual {v1}, Lio/sentry/m6;->getInAppExcludes()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    iget-object v8, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v8, Landroid/content/Context;

    .line 92
    .line 93
    invoke-virtual {v8}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    iget-object v8, v8, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 98
    .line 99
    invoke-direct {v5, v0, v6, v7, v8}, Lio/sentry/android/core/internal/tombstone/c;-><init>(Ljava/io/InputStream;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 100
    .line 101
    .line 102
    :try_start_4
    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/c;->c()Lio/sentry/c5;

    .line 103
    .line 104
    .line 105
    move-result-object v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 106
    :try_start_5
    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/c;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 107
    .line 108
    .line 109
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Lcom/appsflyer/internal/o;->b(Landroid/app/ApplicationExitInfo;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v11

    .line 116
    new-instance p1, Ljava/util/Date;

    .line 117
    .line 118
    invoke-direct {p1, v11, v12}, Ljava/util/Date;-><init>(J)V

    .line 119
    .line 120
    .line 121
    iput-object p1, v6, Lio/sentry/c5;->a0:Ljava/util/Date;

    .line 122
    .line 123
    new-instance v7, Lio/sentry/android/core/x1;

    .line 124
    .line 125
    invoke-virtual {v1}, Lio/sentry/m6;->getFlushTimeoutMillis()J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    move/from16 v13, p2

    .line 134
    .line 135
    invoke-direct/range {v7 .. v13}, Lio/sentry/android/core/x1;-><init>(JLio/sentry/ILogger;JZ)V

    .line 136
    .line 137
    .line 138
    invoke-static {v7}, Lio/sentry/util/c;->e(Ljava/lang/Object;)Lio/sentry/i0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz v4, :cond_4

    .line 143
    .line 144
    new-instance v0, Lio/sentry/a;

    .line 145
    .line 146
    const-string v2, "tombstone.pb"

    .line 147
    .line 148
    const-string v3, "application/x-protobuf"

    .line 149
    .line 150
    invoke-direct {v0, v4, v2, v3}, Lio/sentry/a;-><init>([BLjava/lang/String;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    iput-object v0, p1, Lio/sentry/i0;->g:Lio/sentry/a;

    .line 154
    .line 155
    :cond_4
    :try_start_7
    invoke-virtual {p0, v11, v12, v6, p1}, Lio/sentry/l;->R(JLio/sentry/c5;Lio/sentry/i0;)Lio/sentry/c5;

    .line 156
    .line 157
    .line 158
    move-result-object p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 159
    if-eqz p0, :cond_5

    .line 160
    .line 161
    move-object v6, p0

    .line 162
    goto :goto_2

    .line 163
    :catchall_2
    move-exception v0

    .line 164
    move-object p0, v0

    .line 165
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    const-string v2, "Failed to merge native event with tombstone, continuing without merge: %s"

    .line 180
    .line 181
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_5
    :goto_2
    new-instance p0, Lio/sentry/l;

    .line 185
    .line 186
    const/4 v0, 0x1

    .line 187
    invoke-direct {p0, v0, v6, p1, v7}, Lio/sentry/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    return-object p0

    .line 191
    :catchall_3
    move-exception v0

    .line 192
    move-object p0, v0

    .line 193
    :try_start_8
    invoke-virtual {v5}, Lio/sentry/android/core/internal/tombstone/c;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :catchall_4
    move-exception v0

    .line 198
    :try_start_9
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 199
    .line 200
    .line 201
    :goto_3
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 202
    :goto_4
    if-eqz v3, :cond_6

    .line 203
    .line 204
    :try_start_a
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 205
    .line 206
    .line 207
    goto :goto_5

    .line 208
    :catchall_5
    move-exception v0

    .line 209
    :try_start_b
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    :cond_6
    :goto_5
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 213
    :goto_6
    invoke-virtual {v1}, Lio/sentry/m6;->getLogger()Lio/sentry/ILogger;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v1, Lio/sentry/m5;->WARNING:Lio/sentry/m5;

    .line 218
    .line 219
    invoke-static {}, Lcom/appsflyer/internal/n;->h()Ljava/time/format/DateTimeFormatter;

    .line 220
    .line 221
    .line 222
    invoke-static {p1}, Lcom/appsflyer/internal/o;->b(Landroid/app/ApplicationExitInfo;)J

    .line 223
    .line 224
    .line 225
    move-result-wide v3

    .line 226
    invoke-static {v3, v4}, Lcom/appsflyer/internal/n;->g(J)Ljava/time/Instant;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-static {p1}, Lcom/appsflyer/internal/n;->e(Ljava/time/Instant;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    const-string p1, "Failed to parse tombstone from %s: %s"

    .line 243
    .line 244
    invoke-interface {v0, v1, p1, p0}, Lio/sentry/ILogger;->k(Lio/sentry/m5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    return-object v2
.end method

.method public x(Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lio/sentry/l;->Q(Lio/sentry/f4;)Lio/sentry/a1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-interface {p0, p1}, Lio/sentry/a1;->x(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public y()Lio/sentry/f1;
    .locals 2

    .line 1
    iget-object v0, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->y()Lio/sentry/f1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Lio/sentry/z2;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lio/sentry/a1;

    .line 17
    .line 18
    invoke-interface {v0}, Lio/sentry/a1;->y()Lio/sentry/f1;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    instance-of v1, v0, Lio/sentry/z2;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    iget-object p0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Lio/sentry/a1;

    .line 30
    .line 31
    invoke-interface {p0}, Lio/sentry/a1;->y()Lio/sentry/f1;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public z()Ljava/util/Map;
    .locals 6

    .line 1
    iget-object v0, p0, Lio/sentry/l;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lio/sentry/a1;

    .line 4
    .line 5
    invoke-interface {v0}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lio/sentry/l;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lio/sentry/a1;

    .line 12
    .line 13
    invoke-interface {v1}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, Lio/sentry/l;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lio/sentry/a1;

    .line 20
    .line 21
    invoke-interface {v2}, Lio/sentry/a1;->z()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0, v0, v1, v2}, Lio/sentry/l;->P(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/util/Map;

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    if-eqz v4, :cond_1

    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_1
    if-eqz v3, :cond_2

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    return-object v1

    .line 60
    :cond_2
    if-eqz v3, :cond_3

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    return-object v2

    .line 65
    :cond_3
    new-instance p0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 66
    .line 67
    invoke-direct {p0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method
