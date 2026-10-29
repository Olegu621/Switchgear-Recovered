.class public final Lqk2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lil2;


# instance fields
.field public final a:Li03;

.field public final b:Lpc2;

.field public final c:Lg80;

.field public final d:Ljz;

.field public final e:Lp91;

.field public final f:Ly3;

.field public final g:Lfs0;

.field public final h:Lx80;

.field public final i:Lib1;

.field public final j:Ljc2;

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public m:Lql2;

.field public n:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

.field public final o:Ljava/util/LinkedHashMap;

.field public p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

.field public final q:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Li03;Lpc2;Lg80;Ljz;Lp91;Ly3;Lfs0;Lx80;Lib1;Ljc2;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lqk2;->a:Li03;

    .line 29
    .line 30
    iput-object p2, p0, Lqk2;->b:Lpc2;

    .line 31
    .line 32
    iput-object p3, p0, Lqk2;->c:Lg80;

    .line 33
    .line 34
    iput-object p4, p0, Lqk2;->d:Ljz;

    .line 35
    .line 36
    iput-object p5, p0, Lqk2;->e:Lp91;

    .line 37
    .line 38
    iput-object p6, p0, Lqk2;->f:Ly3;

    .line 39
    .line 40
    iput-object p7, p0, Lqk2;->g:Lfs0;

    .line 41
    .line 42
    iput-object p8, p0, Lqk2;->h:Lx80;

    .line 43
    .line 44
    iput-object p9, p0, Lqk2;->i:Lib1;

    .line 45
    .line 46
    iput-object p10, p0, Lqk2;->j:Ljc2;

    .line 47
    .line 48
    new-instance p1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lqk2;->k:Ljava/util/ArrayList;

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lqk2;->l:Ljava/util/ArrayList;

    .line 61
    .line 62
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    new-instance p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 70
    .line 71
    sget-object p2, Lnd0;->a:Lnd0;

    .line 72
    .line 73
    invoke-direct {p1, p2, p2, p2}, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lqk2;->p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 77
    .line 78
    new-instance p1, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lqk2;->q:Ljava/util/ArrayList;

    .line 84
    .line 85
    return-void
.end method

.method public static c(Ljava/util/LinkedHashSet;Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move-object v2, v1

    .line 32
    check-cast v2, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    return-object v0
.end method

.method public static m(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0

    .line 40
    :cond_1
    const/4 p0, 0x0

    .line 41
    return p0
.end method

.method public static p(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_5

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-interface {p6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_0
    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-interface {p5, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Boolean;

    .line 59
    .line 60
    if-eqz v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    const/4 v2, 0x1

    .line 68
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move-object v2, v3

    .line 74
    :goto_2
    new-instance v4, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;

    .line 75
    .line 76
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Ljava/lang/Boolean;

    .line 91
    .line 92
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    invoke-interface {p4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Ljava/lang/Boolean;

    .line 103
    .line 104
    if-eqz v1, :cond_3

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    goto :goto_3

    .line 111
    :cond_3
    const/4 v1, 0x0

    .line 112
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    :cond_4
    invoke-direct {v4, v5, v3, v2}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_5
    return-object v0
.end method

.method public static q(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    move-object v4, v3

    .line 37
    check-cast v4, Lvk2;

    .line 38
    .line 39
    invoke-interface {v4}, Lqi;->getId()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    iget v5, v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;->a:I

    .line 44
    .line 45
    if-ne v4, v5, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/4 v3, 0x0

    .line 49
    :goto_1
    check-cast v3, Lvk2;

    .line 50
    .line 51
    iget v2, v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;->a:I

    .line 52
    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    invoke-interface {v3}, Lqi;->b()Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    :cond_2
    iget-object v4, v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;->b:Ljava/lang/Boolean;

    .line 62
    .line 63
    :cond_3
    if-eqz v3, :cond_4

    .line 64
    .line 65
    invoke-interface {v3}, Lvk2;->a()Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    if-nez v3, :cond_5

    .line 70
    .line 71
    :cond_4
    iget-object v3, v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndConsent;->c:Ljava/lang/Boolean;

    .line 72
    .line 73
    :cond_5
    new-instance v1, Lrk2;

    .line 74
    .line 75
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v4, v1, Lrk2;->a:Ljava/lang/Boolean;

    .line 79
    .line 80
    iput v2, v1, Lrk2;->b:I

    .line 81
    .line 82
    iput-object v3, v1, Lrk2;->c:Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_6
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Ljk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ljk2;

    .line 7
    .line 8
    iget v1, v0, Ljk2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ljk2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ljk2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ljk2;-><init>(Lqk2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ljk2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Ljk2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Ljk2;->a:Lqk2;

    .line 37
    .line 38
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    check-cast p2, Lo42;

    .line 42
    .line 43
    iget-object p1, p2, Lo42;->a:Ljava/lang/Object;

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x0

    .line 52
    return-object p0

    .line 53
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p2, Lfz;->a:Ljava/util/Set;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object p2, Lfz;->a:Ljava/util/Set;

    .line 62
    .line 63
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-eqz p2, :cond_3

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-static {p1}, Lfz;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    if-eqz p1, :cond_4

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    const-string p1, "en"

    .line 87
    .line 88
    :goto_1
    iput-object p0, v0, Ljk2;->a:Lqk2;

    .line 89
    .line 90
    iput v3, v0, Ljk2;->d:I

    .line 91
    .line 92
    invoke-virtual {p0, p1, v0}, Lqk2;->r(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, v1, :cond_5

    .line 97
    .line 98
    return-object v1

    .line 99
    :cond_5
    :goto_2
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_6

    .line 104
    .line 105
    new-instance p0, Ln42;

    .line 106
    .line 107
    invoke-direct {p0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_6
    iget-object p1, p0, Lqk2;->m:Lql2;

    .line 112
    .line 113
    if-eqz p1, :cond_7

    .line 114
    .line 115
    iget-object p1, p1, Lql2;->b:Lwp0;

    .line 116
    .line 117
    invoke-virtual {p0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Q:Ljava/util/List;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p2}, Lwp0;->c(Ljava/util/List;)V

    .line 130
    .line 131
    .line 132
    :cond_7
    invoke-virtual {p0}, Lqk2;->s()V

    .line 133
    .line 134
    .line 135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0
.end method

.method public final b(Lml2;)Lml2;
    .locals 10

    .line 1
    iget-object v0, p1, Lml2;->a:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lnd0;->a:Lnd0;

    .line 6
    .line 7
    :cond_0
    iget-object v1, p1, Lml2;->c:Ljava/util/List;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lnd0;->a:Lnd0;

    .line 12
    .line 13
    :cond_1
    sget-object v3, Lb7;->b0:Lb7;

    .line 14
    .line 15
    sget-object v4, Lb7;->c0:Lb7;

    .line 16
    .line 17
    sget-object v5, Lb7;->d0:Lb7;

    .line 18
    .line 19
    sget-object v6, Lb7;->e0:Lb7;

    .line 20
    .line 21
    sget-object v7, Lb7;->f0:Lb7;

    .line 22
    .line 23
    sget-object v8, Lb7;->l0:Lb7;

    .line 24
    .line 25
    iget-object v2, p0, Lqk2;->l:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-static/range {v2 .. v8}, Lqk2;->p(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    sget-object v4, Lb7;->g0:Lb7;

    .line 32
    .line 33
    sget-object v5, Lb7;->h0:Lb7;

    .line 34
    .line 35
    sget-object v6, Lb7;->i0:Lb7;

    .line 36
    .line 37
    sget-object v7, Lb7;->j0:Lb7;

    .line 38
    .line 39
    sget-object v8, Lb7;->k0:Lb7;

    .line 40
    .line 41
    new-instance v9, Lnk2;

    .line 42
    .line 43
    invoke-direct {v9, p0}, Lnk2;-><init>(Lqk2;)V

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lqk2;->k:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static/range {v3 .. v9}, Lqk2;->p(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {v2, v0}, Lqk2;->q(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {p0, v1}, Lqk2;->q(Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v1, Ljava/util/ArrayList;

    .line 61
    .line 62
    const/16 v2, 0xa

    .line 63
    .line 64
    invoke-static {v0, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Lrk2;

    .line 86
    .line 87
    new-instance v4, Ljl2;

    .line 88
    .line 89
    iget v5, v3, Lrk2;->b:I

    .line 90
    .line 91
    iget-object v6, v3, Lrk2;->a:Ljava/lang/Boolean;

    .line 92
    .line 93
    iget-object v3, v3, Lrk2;->c:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-direct {v4, v5, v6, v3}, Ljl2;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-static {p0, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_3

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, Lrk2;

    .line 126
    .line 127
    new-instance v3, Lll2;

    .line 128
    .line 129
    iget v4, v2, Lrk2;->b:I

    .line 130
    .line 131
    iget-object v5, v2, Lrk2;->a:Ljava/lang/Boolean;

    .line 132
    .line 133
    iget-object v2, v2, Lrk2;->c:Ljava/lang/Boolean;

    .line 134
    .line 135
    invoke-direct {v3, v4, v5, v2}, Lll2;-><init>(ILjava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    iget-object p0, p1, Lml2;->b:Ljava/util/List;

    .line 143
    .line 144
    new-instance p1, Lml2;

    .line 145
    .line 146
    sget-object v2, Lnd0;->a:Lnd0;

    .line 147
    .line 148
    invoke-direct {p1, v1, p0, v0, v2}, Lml2;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 149
    .line 150
    .line 151
    return-object p1
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lqk2;->j:Ljc2;

    .line 2
    .line 3
    iget-boolean v0, v0, Ljc2;->f:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-boolean v0, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->R:Z

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move v0, v1

    .line 19
    :goto_0
    iget-object p0, p0, Lqk2;->e:Lp91;

    .line 20
    .line 21
    iget-object p0, p0, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->b()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    return v1

    .line 33
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public final e()Ljava/util/List;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lqk2;->k()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 30
    .line 31
    iget-object v4, v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 32
    .line 33
    new-instance v5, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v6, 0xa

    .line 36
    .line 37
    invoke-static {v4, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_0

    .line 53
    .line 54
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    check-cast v7, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 59
    .line 60
    iget v7, v7, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 61
    .line 62
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 71
    .line 72
    .line 73
    iget-object v3, v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 74
    .line 75
    new-instance v4, Ljava/util/ArrayList;

    .line 76
    .line 77
    invoke-static {v3, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_1

    .line 93
    .line 94
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 99
    .line 100
    iget v5, v5, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 101
    .line 102
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_1
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    invoke-virtual {p0}, Lqk2;->h()Ljava/util/ArrayList;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_3

    .line 127
    .line 128
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 133
    .line 134
    iget-object v3, v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->d:Ljava/util/List;

    .line 135
    .line 136
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_3
    new-instance v2, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lqk2;->p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 152
    .line 153
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->c:Ljava/util/List;

    .line 154
    .line 155
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 156
    .line 157
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v2, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :cond_4
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-eqz v3, :cond_5

    .line 178
    .line 179
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    move-object v4, v3

    .line 184
    check-cast v4, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-nez v4, :cond_4

    .line 199
    .line 200
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_5
    invoke-virtual {p0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-boolean p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    .line 212
    .line 213
    if-eqz p0, :cond_6

    .line 214
    .line 215
    const/4 p0, 0x1

    .line 216
    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->s(ILjava/util/List;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    return-object p0

    .line 221
    :cond_6
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    return-object p0
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Q:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lqk2;->k()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    move-object v3, v2

    .line 38
    check-cast v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 39
    .line 40
    iget v3, v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 41
    .line 42
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    return-object v1
.end method

.method public final g()Ljava/util/List;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->U:Ljava/util/List;

    .line 9
    .line 10
    new-instance v1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lqk2;->k()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_3

    .line 33
    .line 34
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 39
    .line 40
    iget-object v4, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    .line 41
    .line 42
    new-instance v5, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    :cond_0
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    move-object v7, v6

    .line 62
    check-cast v7, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 63
    .line 64
    iget v7, v7, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 65
    .line 66
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_0

    .line 75
    .line 76
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    .line 81
    .line 82
    const/16 v6, 0xa

    .line 83
    .line 84
    invoke-static {v5, v6}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    if-eqz v6, :cond_2

    .line 100
    .line 101
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    check-cast v6, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 106
    .line 107
    iget v6, v6, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 108
    .line 109
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_2
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    invoke-virtual {p0}, Lqk2;->h()Ljava/util/ArrayList;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_6

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 140
    .line 141
    iget-object v3, v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->e:Ljava/util/List;

    .line 142
    .line 143
    new-instance v4, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    :cond_4
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_5

    .line 157
    .line 158
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    move-object v6, v5

    .line 163
    check-cast v6, Ljava/lang/Number;

    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v6

    .line 169
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    if-nez v6, :cond_4

    .line 178
    .line 179
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_5
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 196
    .line 197
    .line 198
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 199
    .line 200
    invoke-direct {v0, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0
.end method

.method public final h()Ljava/util/ArrayList;
    .locals 12

    .line 1
    iget-object v0, p0, Lqk2;->m:Lql2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Lql2;->b:Lwp0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, v1

    .line 10
    :goto_0
    invoke-virtual {p0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->U:Ljava/util/List;

    .line 18
    .line 19
    new-instance v3, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    invoke-virtual {p0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->S:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_5

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/lang/Number;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    iget-object v5, v0, Lwp0;->j:Ljava/util/Map;

    .line 56
    .line 57
    if-eqz v5, :cond_2

    .line 58
    .line 59
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Lcom/usercentrics/tcf/core/model/gvl/Stack;

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move-object v4, v1

    .line 71
    :goto_2
    if-eqz v4, :cond_1

    .line 72
    .line 73
    iget-object v6, v4, Lcom/usercentrics/tcf/core/model/gvl/Stack;->c:Ljava/lang/String;

    .line 74
    .line 75
    iget v7, v4, Lcom/usercentrics/tcf/core/model/gvl/Stack;->d:I

    .line 76
    .line 77
    iget-object v8, v4, Lcom/usercentrics/tcf/core/model/gvl/Stack;->e:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v9, v4, Lcom/usercentrics/tcf/core/model/gvl/Stack;->a:Ljava/util/List;

    .line 80
    .line 81
    iget-object v4, v4, Lcom/usercentrics/tcf/core/model/gvl/Stack;->b:Ljava/util/List;

    .line 82
    .line 83
    new-instance v10, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    :cond_3
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    if-eqz v5, :cond_4

    .line 97
    .line 98
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    move-object v11, v5

    .line 103
    check-cast v11, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v11

    .line 109
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    invoke-interface {v2, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-nez v11, :cond_3

    .line 118
    .line 119
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    new-instance v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 124
    .line 125
    invoke-direct/range {v5 .. v10}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    return-object v3
.end method

.method public final i()Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;
    .locals 2

    .line 1
    invoke-static {}, Ljb1;->h()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lqk2;->i:Lib1;

    .line 5
    .line 6
    invoke-virtual {v0}, Lib1;->a()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lqk2;->n:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lqk2;->w()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_2

    .line 19
    :catch_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    iget v1, v0, Lib1;->b:I

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    iput v1, v0, Lib1;->b:I

    .line 26
    .line 27
    iget-object p0, p0, Lqk2;->n:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-object p0

    .line 33
    :goto_1
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :goto_2
    iget v1, v0, Lib1;->b:I

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    iput v1, v0, Lib1;->b:I

    .line 39
    .line 40
    throw p0
.end method

.method public final j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;
    .locals 1

    .line 1
    iget-object p0, p0, Lqk2;->b:Lpc2;

    .line 2
    .line 3
    iget-object p0, p0, Lpc2;->d:Lkn1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v0

    .line 12
    :goto_0
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    return-object v0
.end method

.method public final k()Ljava/util/List;
    .locals 49

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lqk2;->k:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_39

    .line 10
    .line 11
    iget-object v2, v0, Lqk2;->m:Lql2;

    .line 12
    .line 13
    invoke-virtual {v0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v4, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v5, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    if-eqz v2, :cond_38

    .line 31
    .line 32
    iget-object v6, v2, Lql2;->b:Lwp0;

    .line 33
    .line 34
    iget-object v7, v6, Lwp0;->b:Ljava/util/Map;

    .line 35
    .line 36
    if-eqz v7, :cond_38

    .line 37
    .line 38
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-eqz v8, :cond_38

    .line 51
    .line 52
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    check-cast v8, Ljava/util/Map$Entry;

    .line 57
    .line 58
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    check-cast v9, Ljava/lang/String;

    .line 63
    .line 64
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    check-cast v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;

    .line 69
    .line 70
    iget-object v10, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->b:Ljava/util/List;

    .line 71
    .line 72
    iget-object v11, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->d:Ljava/util/List;

    .line 73
    .line 74
    iget-object v12, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->c:Ljava/util/List;

    .line 75
    .line 76
    iget-object v13, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->a:Ljava/util/List;

    .line 77
    .line 78
    iget v14, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->o:I

    .line 79
    .line 80
    new-instance v15, Ljava/util/ArrayList;

    .line 81
    .line 82
    move-object/from16 v16, v7

    .line 83
    .line 84
    const/16 v7, 0xa

    .line 85
    .line 86
    move-object/from16 v17, v9

    .line 87
    .line 88
    invoke-static {v10, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    invoke-direct {v15, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v18

    .line 103
    const-string v19, ""

    .line 104
    .line 105
    if-eqz v18, :cond_2

    .line 106
    .line 107
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v18

    .line 111
    check-cast v18, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    move-object/from16 v18, v9

    .line 118
    .line 119
    new-instance v9, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 120
    .line 121
    move-object/from16 v21, v1

    .line 122
    .line 123
    iget-object v1, v6, Lwp0;->f:Ljava/util/Map;

    .line 124
    .line 125
    move-object/from16 v22, v4

    .line 126
    .line 127
    if-eqz v1, :cond_0

    .line 128
    .line 129
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Lcom/usercentrics/tcf/core/model/gvl/Purpose;

    .line 138
    .line 139
    if-eqz v1, :cond_0

    .line 140
    .line 141
    iget-object v1, v1, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->c:Ljava/lang/String;

    .line 142
    .line 143
    if-nez v1, :cond_1

    .line 144
    .line 145
    :cond_0
    move-object/from16 v1, v19

    .line 146
    .line 147
    :cond_1
    invoke-direct {v9, v7, v1}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v15, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-object/from16 v9, v18

    .line 154
    .line 155
    move-object/from16 v1, v21

    .line 156
    .line 157
    move-object/from16 v4, v22

    .line 158
    .line 159
    const/16 v7, 0xa

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    move-object/from16 v21, v1

    .line 163
    .line 164
    move-object/from16 v22, v4

    .line 165
    .line 166
    new-instance v1, Ljava/util/ArrayList;

    .line 167
    .line 168
    const/16 v4, 0xa

    .line 169
    .line 170
    invoke-static {v13, v4}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_5

    .line 186
    .line 187
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    check-cast v7, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 194
    .line 195
    .line 196
    move-result v7

    .line 197
    new-instance v9, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 198
    .line 199
    move-object/from16 v18, v4

    .line 200
    .line 201
    iget-object v4, v6, Lwp0;->f:Ljava/util/Map;

    .line 202
    .line 203
    move/from16 v23, v14

    .line 204
    .line 205
    if-eqz v4, :cond_3

    .line 206
    .line 207
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v14

    .line 211
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    check-cast v4, Lcom/usercentrics/tcf/core/model/gvl/Purpose;

    .line 216
    .line 217
    if-eqz v4, :cond_3

    .line 218
    .line 219
    iget-object v4, v4, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->c:Ljava/lang/String;

    .line 220
    .line 221
    if-nez v4, :cond_4

    .line 222
    .line 223
    :cond_3
    move-object/from16 v4, v19

    .line 224
    .line 225
    :cond_4
    invoke-direct {v9, v7, v4}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-object/from16 v4, v18

    .line 232
    .line 233
    move/from16 v14, v23

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_5
    move/from16 v23, v14

    .line 237
    .line 238
    iget-boolean v4, v3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    .line 239
    .line 240
    const/4 v7, 0x1

    .line 241
    if-eqz v4, :cond_8

    .line 242
    .line 243
    new-instance v4, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v9

    .line 256
    if-eqz v9, :cond_7

    .line 257
    .line 258
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v9

    .line 262
    move-object v14, v9

    .line 263
    check-cast v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 264
    .line 265
    iget v14, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 266
    .line 267
    if-eq v14, v7, :cond_6

    .line 268
    .line 269
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 276
    .line 277
    .line 278
    :cond_8
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    new-instance v9, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    iget-object v14, v0, Lqk2;->m:Lql2;

    .line 288
    .line 289
    if-eqz v14, :cond_a

    .line 290
    .line 291
    iget-object v14, v14, Lql2;->C:Lxz1;

    .line 292
    .line 293
    if-eqz v14, :cond_a

    .line 294
    .line 295
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-virtual {v14, v4}, Lxz1;->b(Ljava/lang/Integer;)Ljava/util/ArrayList;

    .line 300
    .line 301
    .line 302
    move-result-object v4

    .line 303
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 308
    .line 309
    .line 310
    move-result v14

    .line 311
    if-eqz v14, :cond_a

    .line 312
    .line 313
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    check-cast v14, Lwz1;

    .line 318
    .line 319
    iget-object v7, v14, Lwz1;->a:Ljava/lang/Integer;

    .line 320
    .line 321
    move-object/from16 v18, v4

    .line 322
    .line 323
    if-eqz v7, :cond_9

    .line 324
    .line 325
    new-instance v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;

    .line 326
    .line 327
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v7

    .line 331
    invoke-virtual {v14}, Lwz1;->b()Ll42;

    .line 332
    .line 333
    .line 334
    move-result-object v14

    .line 335
    invoke-direct {v4, v7, v14}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;-><init>(ILl42;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    :cond_9
    move-object/from16 v4, v18

    .line 342
    .line 343
    const/4 v7, 0x1

    .line 344
    goto :goto_4

    .line 345
    :cond_a
    new-instance v4, Lh22;

    .line 346
    .line 347
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 348
    .line 349
    .line 350
    new-instance v7, Ljava/util/ArrayList;

    .line 351
    .line 352
    move-object/from16 v34, v9

    .line 353
    .line 354
    const/16 v14, 0xa

    .line 355
    .line 356
    invoke-static {v15, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v14

    .line 371
    if-eqz v14, :cond_b

    .line 372
    .line 373
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v14

    .line 377
    check-cast v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 378
    .line 379
    new-instance v15, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 380
    .line 381
    move-object/from16 v18, v9

    .line 382
    .line 383
    iget v9, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 384
    .line 385
    iget-object v14, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->b:Ljava/lang/String;

    .line 386
    .line 387
    invoke-direct {v15, v9, v14}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v7, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-object/from16 v9, v18

    .line 394
    .line 395
    goto :goto_5

    .line 396
    :cond_b
    new-instance v9, Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 399
    .line 400
    .line 401
    iput-object v9, v4, Lh22;->a:Ljava/lang/Object;

    .line 402
    .line 403
    new-instance v7, Lh22;

    .line 404
    .line 405
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 406
    .line 407
    .line 408
    new-instance v9, Ljava/util/ArrayList;

    .line 409
    .line 410
    const/16 v14, 0xa

    .line 411
    .line 412
    invoke-static {v1, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    invoke-direct {v9, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 417
    .line 418
    .line 419
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v14

    .line 427
    if-eqz v14, :cond_c

    .line 428
    .line 429
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v14

    .line 433
    check-cast v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 434
    .line 435
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    goto :goto_6

    .line 439
    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    .line 440
    .line 441
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 442
    .line 443
    .line 444
    iput-object v1, v7, Lh22;->a:Ljava/lang/Object;

    .line 445
    .line 446
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v9

    .line 454
    if-eqz v9, :cond_1a

    .line 455
    .line 456
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    check-cast v9, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;

    .line 461
    .line 462
    iget-object v14, v9, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->b:Ll42;

    .line 463
    .line 464
    iget v9, v9, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendorRestriction;->a:I

    .line 465
    .line 466
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 467
    .line 468
    .line 469
    move-result v14

    .line 470
    if-eqz v14, :cond_15

    .line 471
    .line 472
    const/4 v15, 0x1

    .line 473
    if-eq v14, v15, :cond_11

    .line 474
    .line 475
    const/4 v15, 0x2

    .line 476
    if-eq v14, v15, :cond_d

    .line 477
    .line 478
    move-object/from16 v18, v1

    .line 479
    .line 480
    move-object/from16 v48, v2

    .line 481
    .line 482
    goto/16 :goto_d

    .line 483
    .line 484
    :cond_d
    iget-object v14, v7, Lh22;->a:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v14, Ljava/lang/Iterable;

    .line 487
    .line 488
    new-instance v15, Ljava/util/ArrayList;

    .line 489
    .line 490
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 491
    .line 492
    .line 493
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 494
    .line 495
    .line 496
    move-result-object v14

    .line 497
    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 498
    .line 499
    .line 500
    move-result v18

    .line 501
    if-eqz v18, :cond_10

    .line 502
    .line 503
    move-object/from16 v18, v1

    .line 504
    .line 505
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    move-object/from16 v24, v14

    .line 510
    .line 511
    move-object v14, v1

    .line 512
    check-cast v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 513
    .line 514
    iget v0, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 515
    .line 516
    if-ne v0, v9, :cond_f

    .line 517
    .line 518
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-interface {v12, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move-result v0

    .line 526
    if-eqz v0, :cond_e

    .line 527
    .line 528
    iget-object v0, v4, Lh22;->a:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v0, Ljava/util/List;

    .line 531
    .line 532
    new-instance v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 533
    .line 534
    move-object/from16 v48, v2

    .line 535
    .line 536
    iget v2, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 537
    .line 538
    iget-object v14, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->b:Ljava/lang/String;

    .line 539
    .line 540
    invoke-direct {v1, v2, v14}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 541
    .line 542
    .line 543
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    goto :goto_9

    .line 547
    :cond_e
    move-object/from16 v48, v2

    .line 548
    .line 549
    :goto_9
    move-object/from16 v0, p0

    .line 550
    .line 551
    move-object/from16 v1, v18

    .line 552
    .line 553
    move-object/from16 v14, v24

    .line 554
    .line 555
    move-object/from16 v2, v48

    .line 556
    .line 557
    goto :goto_8

    .line 558
    :cond_f
    move-object/from16 v48, v2

    .line 559
    .line 560
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-object/from16 v0, p0

    .line 564
    .line 565
    move-object/from16 v1, v18

    .line 566
    .line 567
    move-object/from16 v14, v24

    .line 568
    .line 569
    goto :goto_8

    .line 570
    :cond_10
    move-object/from16 v18, v1

    .line 571
    .line 572
    move-object/from16 v48, v2

    .line 573
    .line 574
    new-instance v0, Ljava/util/ArrayList;

    .line 575
    .line 576
    invoke-direct {v0, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 577
    .line 578
    .line 579
    iput-object v0, v7, Lh22;->a:Ljava/lang/Object;

    .line 580
    .line 581
    goto/16 :goto_d

    .line 582
    .line 583
    :cond_11
    move-object/from16 v18, v1

    .line 584
    .line 585
    move-object/from16 v48, v2

    .line 586
    .line 587
    iget-object v0, v4, Lh22;->a:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v0, Ljava/lang/Iterable;

    .line 590
    .line 591
    new-instance v1, Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 594
    .line 595
    .line 596
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    :cond_12
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    if-eqz v2, :cond_14

    .line 605
    .line 606
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v2

    .line 610
    move-object v14, v2

    .line 611
    check-cast v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 612
    .line 613
    iget v15, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 614
    .line 615
    if-ne v15, v9, :cond_13

    .line 616
    .line 617
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    invoke-interface {v12, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v2

    .line 625
    if-eqz v2, :cond_12

    .line 626
    .line 627
    iget-object v2, v7, Lh22;->a:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v2, Ljava/util/List;

    .line 630
    .line 631
    invoke-interface {v2, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    goto :goto_a

    .line 635
    :cond_13
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 636
    .line 637
    .line 638
    goto :goto_a

    .line 639
    :cond_14
    new-instance v0, Ljava/util/ArrayList;

    .line 640
    .line 641
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 642
    .line 643
    .line 644
    iput-object v0, v4, Lh22;->a:Ljava/lang/Object;

    .line 645
    .line 646
    goto :goto_d

    .line 647
    :cond_15
    move-object/from16 v18, v1

    .line 648
    .line 649
    move-object/from16 v48, v2

    .line 650
    .line 651
    iget-object v0, v7, Lh22;->a:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v0, Ljava/lang/Iterable;

    .line 654
    .line 655
    new-instance v1, Ljava/util/ArrayList;

    .line 656
    .line 657
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 658
    .line 659
    .line 660
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 661
    .line 662
    .line 663
    move-result-object v0

    .line 664
    :cond_16
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    if-eqz v2, :cond_17

    .line 669
    .line 670
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v2

    .line 674
    move-object v14, v2

    .line 675
    check-cast v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 676
    .line 677
    iget v14, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 678
    .line 679
    if-eq v14, v9, :cond_16

    .line 680
    .line 681
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    goto :goto_b

    .line 685
    :cond_17
    new-instance v0, Ljava/util/ArrayList;

    .line 686
    .line 687
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 688
    .line 689
    .line 690
    iput-object v0, v7, Lh22;->a:Ljava/lang/Object;

    .line 691
    .line 692
    iget-object v0, v4, Lh22;->a:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v0, Ljava/lang/Iterable;

    .line 695
    .line 696
    new-instance v1, Ljava/util/ArrayList;

    .line 697
    .line 698
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 699
    .line 700
    .line 701
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    :cond_18
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    if-eqz v2, :cond_19

    .line 710
    .line 711
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    move-object v14, v2

    .line 716
    check-cast v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 717
    .line 718
    iget v14, v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 719
    .line 720
    if-eq v14, v9, :cond_18

    .line 721
    .line 722
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 723
    .line 724
    .line 725
    goto :goto_c

    .line 726
    :cond_19
    new-instance v0, Ljava/util/ArrayList;

    .line 727
    .line 728
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 729
    .line 730
    .line 731
    iput-object v0, v4, Lh22;->a:Ljava/lang/Object;

    .line 732
    .line 733
    :goto_d
    move-object/from16 v0, p0

    .line 734
    .line 735
    move-object/from16 v1, v18

    .line 736
    .line 737
    move-object/from16 v2, v48

    .line 738
    .line 739
    goto/16 :goto_7

    .line 740
    .line 741
    :cond_1a
    move-object/from16 v48, v2

    .line 742
    .line 743
    iget-object v0, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->e:Ljava/util/List;

    .line 744
    .line 745
    new-instance v1, Ljava/util/ArrayList;

    .line 746
    .line 747
    const/16 v14, 0xa

    .line 748
    .line 749
    invoke-static {v0, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 750
    .line 751
    .line 752
    move-result v2

    .line 753
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 754
    .line 755
    .line 756
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    if-eqz v2, :cond_1d

    .line 765
    .line 766
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    check-cast v2, Ljava/lang/Number;

    .line 771
    .line 772
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    new-instance v9, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 777
    .line 778
    iget-object v14, v6, Lwp0;->e:Ljava/util/Map;

    .line 779
    .line 780
    if-eqz v14, :cond_1b

    .line 781
    .line 782
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v15

    .line 786
    invoke-interface {v14, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v14

    .line 790
    check-cast v14, Lcom/usercentrics/tcf/core/model/gvl/Feature;

    .line 791
    .line 792
    if-eqz v14, :cond_1b

    .line 793
    .line 794
    iget-object v14, v14, Lcom/usercentrics/tcf/core/model/gvl/Feature;->c:Ljava/lang/String;

    .line 795
    .line 796
    if-nez v14, :cond_1c

    .line 797
    .line 798
    :cond_1b
    move-object/from16 v14, v19

    .line 799
    .line 800
    :cond_1c
    invoke-direct {v9, v2, v14}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 801
    .line 802
    .line 803
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    goto :goto_e

    .line 807
    :cond_1d
    new-instance v0, Ljava/util/ArrayList;

    .line 808
    .line 809
    const/16 v14, 0xa

    .line 810
    .line 811
    invoke-static {v12, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 812
    .line 813
    .line 814
    move-result v2

    .line 815
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 816
    .line 817
    .line 818
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 823
    .line 824
    .line 825
    move-result v9

    .line 826
    if-eqz v9, :cond_20

    .line 827
    .line 828
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v9

    .line 832
    check-cast v9, Ljava/lang/Number;

    .line 833
    .line 834
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 835
    .line 836
    .line 837
    move-result v9

    .line 838
    new-instance v12, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 839
    .line 840
    iget-object v14, v6, Lwp0;->f:Ljava/util/Map;

    .line 841
    .line 842
    if-eqz v14, :cond_1e

    .line 843
    .line 844
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v15

    .line 848
    invoke-interface {v14, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v14

    .line 852
    check-cast v14, Lcom/usercentrics/tcf/core/model/gvl/Purpose;

    .line 853
    .line 854
    if-eqz v14, :cond_1e

    .line 855
    .line 856
    iget-object v14, v14, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->c:Ljava/lang/String;

    .line 857
    .line 858
    if-nez v14, :cond_1f

    .line 859
    .line 860
    :cond_1e
    move-object/from16 v14, v19

    .line 861
    .line 862
    :cond_1f
    invoke-direct {v12, v9, v14}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    goto :goto_f

    .line 869
    :cond_20
    iget-object v2, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->f:Ljava/util/List;

    .line 870
    .line 871
    new-instance v9, Ljava/util/ArrayList;

    .line 872
    .line 873
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 874
    .line 875
    .line 876
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 877
    .line 878
    .line 879
    move-result-object v2

    .line 880
    :cond_21
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 881
    .line 882
    .line 883
    move-result v12

    .line 884
    if-eqz v12, :cond_22

    .line 885
    .line 886
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v12

    .line 890
    move-object v14, v12

    .line 891
    check-cast v14, Ljava/lang/Number;

    .line 892
    .line 893
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 894
    .line 895
    .line 896
    move-result v14

    .line 897
    iget-object v15, v3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->U:Ljava/util/List;

    .line 898
    .line 899
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 900
    .line 901
    .line 902
    move-result-object v14

    .line 903
    invoke-interface {v15, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v14

    .line 907
    if-nez v14, :cond_21

    .line 908
    .line 909
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    goto :goto_10

    .line 913
    :cond_22
    new-instance v2, Ljava/util/ArrayList;

    .line 914
    .line 915
    const/16 v14, 0xa

    .line 916
    .line 917
    invoke-static {v9, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 918
    .line 919
    .line 920
    move-result v12

    .line 921
    invoke-direct {v2, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 925
    .line 926
    .line 927
    move-result-object v9

    .line 928
    :goto_11
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 929
    .line 930
    .line 931
    move-result v12

    .line 932
    if-eqz v12, :cond_25

    .line 933
    .line 934
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v12

    .line 938
    check-cast v12, Ljava/lang/Number;

    .line 939
    .line 940
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 941
    .line 942
    .line 943
    move-result v12

    .line 944
    new-instance v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 945
    .line 946
    iget-object v15, v6, Lwp0;->h:Ljava/util/Map;

    .line 947
    .line 948
    move-object/from16 v27, v0

    .line 949
    .line 950
    if-eqz v15, :cond_23

    .line 951
    .line 952
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v0

    .line 956
    invoke-interface {v15, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    check-cast v0, Lcom/usercentrics/tcf/core/model/gvl/Feature;

    .line 961
    .line 962
    if-eqz v0, :cond_23

    .line 963
    .line 964
    iget-object v0, v0, Lcom/usercentrics/tcf/core/model/gvl/Feature;->c:Ljava/lang/String;

    .line 965
    .line 966
    if-nez v0, :cond_24

    .line 967
    .line 968
    :cond_23
    move-object/from16 v0, v19

    .line 969
    .line 970
    :cond_24
    invoke-direct {v14, v12, v0}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v2, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 974
    .line 975
    .line 976
    move-object/from16 v0, v27

    .line 977
    .line 978
    goto :goto_11

    .line 979
    :cond_25
    move-object/from16 v27, v0

    .line 980
    .line 981
    new-instance v0, Ljava/util/ArrayList;

    .line 982
    .line 983
    const/16 v14, 0xa

    .line 984
    .line 985
    invoke-static {v11, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 986
    .line 987
    .line 988
    move-result v9

    .line 989
    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 990
    .line 991
    .line 992
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 993
    .line 994
    .line 995
    move-result-object v9

    .line 996
    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 997
    .line 998
    .line 999
    move-result v12

    .line 1000
    if-eqz v12, :cond_28

    .line 1001
    .line 1002
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v12

    .line 1006
    check-cast v12, Ljava/lang/Number;

    .line 1007
    .line 1008
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 1009
    .line 1010
    .line 1011
    move-result v12

    .line 1012
    new-instance v14, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 1013
    .line 1014
    iget-object v15, v6, Lwp0;->i:Ljava/util/Map;

    .line 1015
    .line 1016
    move-object/from16 v26, v1

    .line 1017
    .line 1018
    if-eqz v15, :cond_26

    .line 1019
    .line 1020
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v1

    .line 1024
    invoke-interface {v15, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v1

    .line 1028
    check-cast v1, Lcom/usercentrics/tcf/core/model/gvl/Purpose;

    .line 1029
    .line 1030
    if-eqz v1, :cond_26

    .line 1031
    .line 1032
    iget-object v1, v1, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->c:Ljava/lang/String;

    .line 1033
    .line 1034
    if-nez v1, :cond_27

    .line 1035
    .line 1036
    :cond_26
    move-object/from16 v1, v19

    .line 1037
    .line 1038
    :cond_27
    invoke-direct {v14, v12, v1}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    move-object/from16 v1, v26

    .line 1045
    .line 1046
    goto :goto_12

    .line 1047
    :cond_28
    move-object/from16 v26, v1

    .line 1048
    .line 1049
    iget-object v1, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->s:Ljava/util/List;

    .line 1050
    .line 1051
    if-eqz v1, :cond_2c

    .line 1052
    .line 1053
    new-instance v12, Ljava/util/ArrayList;

    .line 1054
    .line 1055
    const/16 v14, 0xa

    .line 1056
    .line 1057
    invoke-static {v1, v14}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 1058
    .line 1059
    .line 1060
    move-result v14

    .line 1061
    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 1062
    .line 1063
    .line 1064
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1069
    .line 1070
    .line 1071
    move-result v14

    .line 1072
    if-eqz v14, :cond_2b

    .line 1073
    .line 1074
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v14

    .line 1078
    check-cast v14, Ljava/lang/Number;

    .line 1079
    .line 1080
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 1081
    .line 1082
    .line 1083
    move-result v14

    .line 1084
    new-instance v15, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 1085
    .line 1086
    iget-object v9, v6, Lwp0;->g:Ljava/util/Map;

    .line 1087
    .line 1088
    move-object/from16 v36, v0

    .line 1089
    .line 1090
    if-eqz v9, :cond_29

    .line 1091
    .line 1092
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    invoke-interface {v9, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    check-cast v0, Lcom/usercentrics/tcf/core/model/gvl/DataCategory;

    .line 1101
    .line 1102
    if-eqz v0, :cond_29

    .line 1103
    .line 1104
    iget-object v0, v0, Lcom/usercentrics/tcf/core/model/gvl/DataCategory;->b:Ljava/lang/String;

    .line 1105
    .line 1106
    if-nez v0, :cond_2a

    .line 1107
    .line 1108
    :cond_29
    move-object/from16 v0, v19

    .line 1109
    .line 1110
    :cond_2a
    invoke-direct {v15, v14, v0}, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;-><init>(ILjava/lang/String;)V

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1114
    .line 1115
    .line 1116
    move-object/from16 v0, v36

    .line 1117
    .line 1118
    goto :goto_13

    .line 1119
    :cond_2b
    :goto_14
    move-object/from16 v36, v0

    .line 1120
    .line 1121
    goto :goto_15

    .line 1122
    :cond_2c
    const/4 v12, 0x0

    .line 1123
    goto :goto_14

    .line 1124
    :goto_15
    iget-object v0, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->q:Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;

    .line 1125
    .line 1126
    invoke-static {v13, v10, v11}, Lqk2;->m(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    if-eqz v1, :cond_2d

    .line 1131
    .line 1132
    invoke-static/range {v23 .. v23}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1137
    .line 1138
    .line 1139
    :cond_2d
    move-object/from16 v1, v48

    .line 1140
    .line 1141
    iget-object v9, v1, Lql2;->y:Lu13;

    .line 1142
    .line 1143
    move/from16 v14, v23

    .line 1144
    .line 1145
    invoke-virtual {v9, v14}, Lu13;->a(I)Z

    .line 1146
    .line 1147
    .line 1148
    move-result v9

    .line 1149
    iget-object v15, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->j:Ljava/lang/Double;

    .line 1150
    .line 1151
    move-object/from16 v35, v2

    .line 1152
    .line 1153
    iget-object v2, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->l:Ljava/lang/String;

    .line 1154
    .line 1155
    move-object/from16 v41, v2

    .line 1156
    .line 1157
    iget v2, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->o:I

    .line 1158
    .line 1159
    move/from16 v28, v2

    .line 1160
    .line 1161
    move-object/from16 v19, v6

    .line 1162
    .line 1163
    move-object/from16 v2, p0

    .line 1164
    .line 1165
    iget-object v6, v2, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 1166
    .line 1167
    move/from16 v20, v9

    .line 1168
    .line 1169
    invoke-static/range {v28 .. v28}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v9

    .line 1173
    invoke-virtual {v6, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v6

    .line 1177
    const/4 v9, 0x0

    .line 1178
    if-eqz v6, :cond_30

    .line 1179
    .line 1180
    iget-object v6, v1, Lql2;->z:Lu13;

    .line 1181
    .line 1182
    invoke-virtual {v6, v14}, Lu13;->a(I)Z

    .line 1183
    .line 1184
    .line 1185
    move-result v6

    .line 1186
    if-nez v6, :cond_2f

    .line 1187
    .line 1188
    invoke-static {v13, v10, v11}, Lqk2;->m(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Z

    .line 1189
    .line 1190
    .line 1191
    move-result v6

    .line 1192
    if-eqz v6, :cond_2e

    .line 1193
    .line 1194
    goto :goto_16

    .line 1195
    :cond_2e
    move v6, v9

    .line 1196
    goto :goto_17

    .line 1197
    :cond_2f
    :goto_16
    const/4 v6, 0x1

    .line 1198
    :goto_17
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v6

    .line 1202
    move-object/from16 v29, v6

    .line 1203
    .line 1204
    goto :goto_18

    .line 1205
    :cond_30
    const/16 v29, 0x0

    .line 1206
    .line 1207
    :goto_18
    iget-object v6, v4, Lh22;->a:Ljava/lang/Object;

    .line 1208
    .line 1209
    move-object/from16 v30, v6

    .line 1210
    .line 1211
    check-cast v30, Ljava/util/List;

    .line 1212
    .line 1213
    iget-object v6, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->p:Ljava/lang/String;

    .line 1214
    .line 1215
    iget-object v10, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->g:Ljava/lang/String;

    .line 1216
    .line 1217
    iget-object v7, v7, Lh22;->a:Ljava/lang/Object;

    .line 1218
    .line 1219
    move-object/from16 v33, v7

    .line 1220
    .line 1221
    check-cast v33, Ljava/util/List;

    .line 1222
    .line 1223
    check-cast v7, Ljava/util/Collection;

    .line 1224
    .line 1225
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 1226
    .line 1227
    .line 1228
    move-result v7

    .line 1229
    if-nez v7, :cond_31

    .line 1230
    .line 1231
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a()Z

    .line 1232
    .line 1233
    .line 1234
    move-result v7

    .line 1235
    if-eqz v7, :cond_31

    .line 1236
    .line 1237
    const/16 v37, 0x1

    .line 1238
    .line 1239
    goto :goto_19

    .line 1240
    :cond_31
    move/from16 v37, v9

    .line 1241
    .line 1242
    :goto_19
    iget-object v4, v4, Lh22;->a:Ljava/lang/Object;

    .line 1243
    .line 1244
    check-cast v4, Ljava/util/Collection;

    .line 1245
    .line 1246
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 1247
    .line 1248
    .line 1249
    move-result v4

    .line 1250
    if-nez v4, :cond_32

    .line 1251
    .line 1252
    invoke-virtual {v3}, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a()Z

    .line 1253
    .line 1254
    .line 1255
    move-result v4

    .line 1256
    if-eqz v4, :cond_32

    .line 1257
    .line 1258
    iget-boolean v4, v3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 1259
    .line 1260
    if-nez v4, :cond_32

    .line 1261
    .line 1262
    const/16 v38, 0x1

    .line 1263
    .line 1264
    goto :goto_1a

    .line 1265
    :cond_32
    move/from16 v38, v9

    .line 1266
    .line 1267
    :goto_1a
    iget-boolean v4, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->k:Z

    .line 1268
    .line 1269
    iget-boolean v7, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->m:Z

    .line 1270
    .line 1271
    iget-object v9, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->n:Ljava/lang/Boolean;

    .line 1272
    .line 1273
    iget-object v11, v3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->K:Ljava/util/List;

    .line 1274
    .line 1275
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v13

    .line 1279
    invoke-interface {v11, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v11

    .line 1283
    new-instance v13, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 1284
    .line 1285
    if-eqz v0, :cond_33

    .line 1286
    .line 1287
    iget-object v14, v0, Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;->a:Ljava/lang/Integer;

    .line 1288
    .line 1289
    goto :goto_1b

    .line 1290
    :cond_33
    const/4 v14, 0x0

    .line 1291
    :goto_1b
    sget-object v17, Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;->Companion:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod$Companion;

    .line 1292
    .line 1293
    move-object/from16 v48, v1

    .line 1294
    .line 1295
    if-eqz v0, :cond_34

    .line 1296
    .line 1297
    iget-object v1, v0, Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;->b:Ljava/util/Map;

    .line 1298
    .line 1299
    goto :goto_1c

    .line 1300
    :cond_34
    const/4 v1, 0x0

    .line 1301
    :goto_1c
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1302
    .line 1303
    .line 1304
    invoke-static {v1}, Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod$Companion;->a(Ljava/util/Map;)Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v1

    .line 1308
    if-eqz v0, :cond_35

    .line 1309
    .line 1310
    iget-object v0, v0, Lcom/usercentrics/tcf/core/model/gvl/GvlDataRetention;->c:Ljava/util/Map;

    .line 1311
    .line 1312
    goto :goto_1d

    .line 1313
    :cond_35
    const/4 v0, 0x0

    .line 1314
    :goto_1d
    invoke-static {v0}, Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod$Companion;->a(Ljava/util/Map;)Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v0

    .line 1318
    invoke-direct {v13, v14, v1, v0}, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;-><init>(Ljava/lang/Integer;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)V

    .line 1319
    .line 1320
    .line 1321
    if-nez v12, :cond_36

    .line 1322
    .line 1323
    sget-object v12, Lnd0;->a:Lnd0;

    .line 1324
    .line 1325
    :cond_36
    move-object/from16 v46, v12

    .line 1326
    .line 1327
    iget-object v0, v8, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->r:Ljava/util/List;

    .line 1328
    .line 1329
    if-nez v0, :cond_37

    .line 1330
    .line 1331
    sget-object v0, Lnd0;->a:Lnd0;

    .line 1332
    .line 1333
    :cond_37
    move-object/from16 v47, v0

    .line 1334
    .line 1335
    new-instance v24, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 1336
    .line 1337
    invoke-static/range {v20 .. v20}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v25

    .line 1341
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v44

    .line 1345
    move/from16 v40, v4

    .line 1346
    .line 1347
    move-object/from16 v31, v6

    .line 1348
    .line 1349
    move/from16 v42, v7

    .line 1350
    .line 1351
    move-object/from16 v43, v9

    .line 1352
    .line 1353
    move-object/from16 v32, v10

    .line 1354
    .line 1355
    move-object/from16 v45, v13

    .line 1356
    .line 1357
    move-object/from16 v39, v15

    .line 1358
    .line 1359
    invoke-direct/range {v24 .. v47}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;-><init>(Ljava/lang/Boolean;Ljava/util/ArrayList;Ljava/util/ArrayList;ILjava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;ZZLjava/lang/Double;ZLjava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/usercentrics/tcf/core/model/gvl/DataRetention;Ljava/util/List;Ljava/util/List;)V

    .line 1360
    .line 1361
    .line 1362
    move-object/from16 v0, v22

    .line 1363
    .line 1364
    move-object/from16 v1, v24

    .line 1365
    .line 1366
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1367
    .line 1368
    .line 1369
    move-object v4, v0

    .line 1370
    move-object v0, v2

    .line 1371
    move-object/from16 v7, v16

    .line 1372
    .line 1373
    move-object/from16 v6, v19

    .line 1374
    .line 1375
    move-object/from16 v1, v21

    .line 1376
    .line 1377
    move-object/from16 v2, v48

    .line 1378
    .line 1379
    goto/16 :goto_0

    .line 1380
    .line 1381
    :cond_38
    move-object v2, v0

    .line 1382
    move-object/from16 v21, v1

    .line 1383
    .line 1384
    move-object v0, v4

    .line 1385
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->clear()V

    .line 1386
    .line 1387
    .line 1388
    sget-object v1, Lnk2;->d:Lnk2;

    .line 1389
    .line 1390
    invoke-static {v0, v1}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v0

    .line 1394
    move-object/from16 v1, v21

    .line 1395
    .line 1396
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1397
    .line 1398
    .line 1399
    iget-object v0, v2, Lqk2;->q:Ljava/util/ArrayList;

    .line 1400
    .line 1401
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1402
    .line 1403
    .line 1404
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1405
    .line 1406
    .line 1407
    :cond_39
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v0

    .line 1411
    return-object v0
.end method

.method public final l(Lql2;Ljava/util/LinkedHashMap;)V
    .locals 10

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const/4 v0, 0x7

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/16 v0, 0x8

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/16 v0, 0x9

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/16 v0, 0xa

    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const/16 v6, 0xb

    .line 30
    .line 31
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    filled-new-array/range {v1 .. v6}, [Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {v1}, Lpw;->e([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p0}, Lqk2;->k()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    check-cast v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 67
    .line 68
    iget-object v5, v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 69
    .line 70
    new-instance v6, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-static {v5, v0}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-eqz v7, :cond_0

    .line 88
    .line 89
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    check-cast v7, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 94
    .line 95
    iget v7, v7, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 96
    .line 97
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_0
    invoke-static {v3, v6}, Luw;->k(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    new-instance v4, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    :cond_2
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-eqz v5, :cond_5

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    move-object v6, v5

    .line 133
    check-cast v6, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz p2, :cond_3

    .line 148
    .line 149
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v6

    .line 163
    goto :goto_3

    .line 164
    :cond_3
    iget-object v8, p0, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    iget-object v9, p1, Lql2;->s:Lu13;

    .line 171
    .line 172
    invoke-virtual {v9, v6}, Lu13;->a(I)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-nez v8, :cond_4

    .line 177
    .line 178
    if-nez v6, :cond_4

    .line 179
    .line 180
    const/4 v6, 0x1

    .line 181
    goto :goto_3

    .line 182
    :cond_4
    const/4 v6, 0x0

    .line 183
    :goto_3
    if-eqz v7, :cond_2

    .line 184
    .line 185
    if-nez v6, :cond_2

    .line 186
    .line 187
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_2

    .line 191
    :cond_5
    iget-object p2, p1, Lql2;->s:Lu13;

    .line 192
    .line 193
    invoke-virtual {p0}, Lqk2;->e()Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {p2, v1}, Lu13;->e(Ljava/util/List;)V

    .line 198
    .line 199
    .line 200
    iget-object p2, p1, Lql2;->s:Lu13;

    .line 201
    .line 202
    invoke-virtual {p2, v4}, Lu13;->c(Ljava/util/List;)V

    .line 203
    .line 204
    .line 205
    iget-object p2, p1, Lql2;->z:Lu13;

    .line 206
    .line 207
    invoke-virtual {p2}, Lu13;->clear()V

    .line 208
    .line 209
    .line 210
    new-instance p2, Ljava/util/ArrayList;

    .line 211
    .line 212
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    if-eqz v2, :cond_7

    .line 224
    .line 225
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    move-object v3, v2

    .line 230
    check-cast v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 231
    .line 232
    iget-object v3, v3, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 233
    .line 234
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    if-nez v3, :cond_6

    .line 239
    .line 240
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-static {p2, v0}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_8

    .line 262
    .line 263
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 268
    .line 269
    iget v0, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 270
    .line 271
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_8
    iget-object p0, p0, Lqk2;->q:Ljava/util/ArrayList;

    .line 280
    .line 281
    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 286
    .line 287
    invoke-direct {p2, p0}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 288
    .line 289
    .line 290
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    iget-object p1, p1, Lql2;->z:Lu13;

    .line 295
    .line 296
    invoke-virtual {p1, p0}, Lu13;->c(Ljava/util/List;)V

    .line 297
    .line 298
    .line 299
    return-void
.end method

.method public final n(Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;Ld10;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, Lkk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lkk2;

    .line 7
    .line 8
    iget v1, v0, Lkk2;->i:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lkk2;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lkk2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lkk2;-><init>(Lqk2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lkk2;->e:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lkk2;->i:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v6, :cond_2

    .line 38
    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    iget-object p0, v0, Lkk2;->d:Lwp0;

    .line 42
    .line 43
    iget-object p1, v0, Lkk2;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 44
    .line 45
    iget-object p2, v0, Lkk2;->b:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 46
    .line 47
    iget-object v0, v0, Lkk2;->a:Lqk2;

    .line 48
    .line 49
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    check-cast p3, Lo42;

    .line 53
    .line 54
    iget-object p3, p3, Lo42;->a:Ljava/lang/Object;

    .line 55
    .line 56
    goto/16 :goto_6

    .line 57
    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v3

    .line 64
    :cond_2
    iget-object p0, v0, Lkk2;->d:Lwp0;

    .line 65
    .line 66
    iget-object p2, v0, Lkk2;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 67
    .line 68
    iget-object p1, v0, Lkk2;->b:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 69
    .line 70
    iget-object v2, v0, Lkk2;->a:Lqk2;

    .line 71
    .line 72
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    check-cast p3, Lo42;

    .line 76
    .line 77
    iget-object p3, p3, Lo42;->a:Ljava/lang/Object;

    .line 78
    .line 79
    move-object v10, p3

    .line 80
    move-object p3, p0

    .line 81
    move-object p0, v2

    .line 82
    move-object v2, v10

    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_3
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    new-instance p3, Lwp0;

    .line 89
    .line 90
    iget-object v2, p0, Lqk2;->g:Lfs0;

    .line 91
    .line 92
    invoke-direct {p3, v2}, Lwp0;-><init>(Lfs0;)V

    .line 93
    .line 94
    .line 95
    new-instance v2, Lql2;

    .line 96
    .line 97
    invoke-direct {v2, p3}, Lql2;-><init>(Lwp0;)V

    .line 98
    .line 99
    .line 100
    iput-object v2, p0, Lqk2;->m:Lql2;

    .line 101
    .line 102
    iget-object v2, p2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->a:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v2}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-nez v7, :cond_4

    .line 109
    .line 110
    :try_start_0
    sget-object v7, Lzl2;->Companion:Lyl2;

    .line 111
    .line 112
    iget-object v8, p0, Lqk2;->m:Lql2;

    .line 113
    .line 114
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v8}, Lyl2;->a(Ljava/lang/String;Lql2;)Lql2;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    iput-object v2, p0, Lqk2;->m:Lql2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :catchall_0
    move-exception v2

    .line 128
    sget-object v7, Lpl2;->a:[Lpl2;

    .line 129
    .line 130
    const-string v7, "Usercentrics: Unable to init TCF"

    .line 131
    .line 132
    iget-object v8, p0, Lqk2;->a:Li03;

    .line 133
    .line 134
    invoke-interface {v8, v7, v2}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 135
    .line 136
    .line 137
    :cond_4
    :goto_1
    iget-object v2, p0, Lqk2;->m:Lql2;

    .line 138
    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    new-instance v7, Luh2;

    .line 142
    .line 143
    iget v8, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->G:I

    .line 144
    .line 145
    invoke-direct {v7, v8}, Luh2;-><init>(I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v2, v7}, Lql2;->c(Luh2;)V

    .line 149
    .line 150
    .line 151
    new-instance v7, Luh2;

    .line 152
    .line 153
    iget v8, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->H:I

    .line 154
    .line 155
    invoke-direct {v7, v8}, Luh2;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v7}, Lql2;->d(Luh2;)V

    .line 159
    .line 160
    .line 161
    iget-object v7, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->T:Lpk2;

    .line 162
    .line 163
    sget-object v8, Lpk2;->a:Lpk2;

    .line 164
    .line 165
    if-ne v7, v8, :cond_5

    .line 166
    .line 167
    move v7, v6

    .line 168
    goto :goto_2

    .line 169
    :cond_5
    move v7, v4

    .line 170
    :goto_2
    iput-boolean v7, v2, Lql2;->c:Z

    .line 171
    .line 172
    iget-object v7, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->O:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v2, v7}, Lql2;->g(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    iget-boolean v7, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->P:Z

    .line 178
    .line 179
    iput-boolean v7, v2, Lql2;->e:Z

    .line 180
    .line 181
    :cond_6
    iput-object p0, v0, Lkk2;->a:Lqk2;

    .line 182
    .line 183
    iput-object p1, v0, Lkk2;->b:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 184
    .line 185
    iput-object p2, v0, Lkk2;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 186
    .line 187
    iput-object p3, v0, Lkk2;->d:Lwp0;

    .line 188
    .line 189
    iput v6, v0, Lkk2;->i:I

    .line 190
    .line 191
    invoke-virtual {p3, v0}, Lwp0;->b(Ld10;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    if-ne v2, v1, :cond_7

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_7
    :goto_3
    invoke-static {v2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    if-eqz v2, :cond_8

    .line 203
    .line 204
    new-instance p0, Ln42;

    .line 205
    .line 206
    invoke-direct {p0, v2}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    return-object p0

    .line 210
    :cond_8
    iget-object v2, p0, Lqk2;->b:Lpc2;

    .line 211
    .line 212
    iget-object v2, v2, Lpc2;->d:Lkn1;

    .line 213
    .line 214
    if-eqz v2, :cond_9

    .line 215
    .line 216
    iget-object v3, v2, Lkn1;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 217
    .line 218
    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    iget-object v2, v3, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->d:Ljava/lang/String;

    .line 222
    .line 223
    sget-object v3, Lfz;->a:Ljava/util/Set;

    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    sget-object v3, Lfz;->a:Ljava/util/Set;

    .line 229
    .line 230
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 231
    .line 232
    invoke-virtual {v2, v7}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v7

    .line 236
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_a

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_a
    invoke-static {v2}, Lfz;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    if-eqz v2, :cond_b

    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_b
    const-string v2, "en"

    .line 254
    .line 255
    :goto_4
    iput-object p0, v0, Lkk2;->a:Lqk2;

    .line 256
    .line 257
    iput-object p1, v0, Lkk2;->b:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 258
    .line 259
    iput-object p2, v0, Lkk2;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 260
    .line 261
    iput-object p3, v0, Lkk2;->d:Lwp0;

    .line 262
    .line 263
    iput v5, v0, Lkk2;->i:I

    .line 264
    .line 265
    invoke-virtual {p0, v2, v0}, Lqk2;->r(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-ne v0, v1, :cond_c

    .line 270
    .line 271
    :goto_5
    return-object v1

    .line 272
    :cond_c
    move-object v10, v0

    .line 273
    move-object v0, p0

    .line 274
    move-object p0, p3

    .line 275
    move-object p3, v10

    .line 276
    move-object v10, p2

    .line 277
    move-object p2, p1

    .line 278
    move-object p1, v10

    .line 279
    :goto_6
    invoke-static {p3}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 280
    .line 281
    .line 282
    move-result-object p3

    .line 283
    if-eqz p3, :cond_d

    .line 284
    .line 285
    new-instance p0, Ln42;

    .line 286
    .line 287
    invoke-direct {p0, p3}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 288
    .line 289
    .line 290
    return-object p0

    .line 291
    :cond_d
    invoke-virtual {v0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 292
    .line 293
    .line 294
    move-result-object p3

    .line 295
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    iget-object p3, p3, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->Q:Ljava/util/List;

    .line 299
    .line 300
    iget-object v1, v0, Lqk2;->m:Lql2;

    .line 301
    .line 302
    if-eqz v1, :cond_e

    .line 303
    .line 304
    iget-object v1, v1, Lql2;->b:Lwp0;

    .line 305
    .line 306
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, p3}, Lwp0;->c(Ljava/util/List;)V

    .line 310
    .line 311
    .line 312
    :cond_e
    iget-object p3, v0, Lqk2;->m:Lql2;

    .line 313
    .line 314
    if-eqz p3, :cond_10

    .line 315
    .line 316
    iget-object p3, p3, Lql2;->C:Lxz1;

    .line 317
    .line 318
    if-eqz p3, :cond_10

    .line 319
    .line 320
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    iget-object v1, p3, Lxz1;->d:Lwp0;

    .line 324
    .line 325
    if-eqz v1, :cond_f

    .line 326
    .line 327
    goto :goto_7

    .line 328
    :cond_f
    iput-object p0, p3, Lxz1;->d:Lwp0;

    .line 329
    .line 330
    :cond_10
    :goto_7
    iget-object p0, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->T:Lpk2;

    .line 331
    .line 332
    sget-object p3, Lpk2;->a:Lpk2;

    .line 333
    .line 334
    if-ne p0, p3, :cond_21

    .line 335
    .line 336
    iget-object p0, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->f0:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 337
    .line 338
    if-eqz p0, :cond_12

    .line 339
    .line 340
    iget-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->c:Ljava/util/List;

    .line 341
    .line 342
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 343
    .line 344
    .line 345
    move-result p3

    .line 346
    if-nez p3, :cond_11

    .line 347
    .line 348
    iput-object p0, v0, Lqk2;->p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_11
    sget-object p3, Lb13;->b:Ljava/util/ArrayList;

    .line 352
    .line 353
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->a:Ljava/util/List;

    .line 354
    .line 355
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->b:Ljava/util/List;

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    new-instance v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 367
    .line 368
    invoke-direct {v2, v1, p0, p3}, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 369
    .line 370
    .line 371
    iput-object v2, v0, Lqk2;->p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 372
    .line 373
    :cond_12
    :goto_8
    iget-object p0, v0, Lqk2;->p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 374
    .line 375
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->a:Ljava/util/List;

    .line 376
    .line 377
    new-instance p3, Ljava/util/ArrayList;

    .line 378
    .line 379
    const/16 v1, 0xa

    .line 380
    .line 381
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 386
    .line 387
    .line 388
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-eqz v2, :cond_13

    .line 397
    .line 398
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    check-cast v2, Ljava/lang/Number;

    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    new-instance v3, Lwz1;

    .line 409
    .line 410
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    sget-object v5, Ll42;->c:Ll42;

    .line 415
    .line 416
    invoke-direct {v3, v2, v5}, Lwz1;-><init>(Ljava/lang/Integer;Ll42;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v3}, Lwz1;->a()Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v2

    .line 423
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 424
    .line 425
    .line 426
    goto :goto_9

    .line 427
    :cond_13
    iget-object p0, v0, Lqk2;->p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 428
    .line 429
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->b:Ljava/util/List;

    .line 430
    .line 431
    new-instance v2, Ljava/util/ArrayList;

    .line 432
    .line 433
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 438
    .line 439
    .line 440
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    if-eqz v3, :cond_14

    .line 449
    .line 450
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    check-cast v3, Ljava/lang/Number;

    .line 455
    .line 456
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    new-instance v5, Lwz1;

    .line 461
    .line 462
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    sget-object v7, Ll42;->d:Ll42;

    .line 467
    .line 468
    invoke-direct {v5, v3, v7}, Lwz1;-><init>(Ljava/lang/Integer;Ll42;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v5}, Lwz1;->a()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_14
    iget-object p0, v0, Lqk2;->p:Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;

    .line 480
    .line 481
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;->c:Ljava/util/List;

    .line 482
    .line 483
    new-instance v3, Ljava/util/ArrayList;

    .line 484
    .line 485
    invoke-static {p0, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 486
    .line 487
    .line 488
    move-result v1

    .line 489
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 490
    .line 491
    .line 492
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 493
    .line 494
    .line 495
    move-result-object p0

    .line 496
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    if-eqz v1, :cond_15

    .line 501
    .line 502
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v1

    .line 506
    check-cast v1, Ljava/lang/Number;

    .line 507
    .line 508
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 509
    .line 510
    .line 511
    move-result v1

    .line 512
    new-instance v5, Lwz1;

    .line 513
    .line 514
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    sget-object v7, Ll42;->b:Ll42;

    .line 519
    .line 520
    invoke-direct {v5, v1, v7}, Lwz1;-><init>(Ljava/lang/Integer;Ll42;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v5}, Lwz1;->a()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v1

    .line 527
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 528
    .line 529
    .line 530
    goto :goto_b

    .line 531
    :cond_15
    invoke-static {p3, v2}, Lkotlin/collections/CollectionsKt;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 532
    .line 533
    .line 534
    move-result-object p0

    .line 535
    invoke-static {p0, v3}, Lkotlin/collections/CollectionsKt;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 536
    .line 537
    .line 538
    move-result-object p0

    .line 539
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 540
    .line 541
    .line 542
    move-result-object p0

    .line 543
    iget-object p3, v0, Lqk2;->m:Lql2;

    .line 544
    .line 545
    if-eqz p3, :cond_16

    .line 546
    .line 547
    iget-object p3, p3, Lql2;->C:Lxz1;

    .line 548
    .line 549
    if-eqz p3, :cond_16

    .line 550
    .line 551
    iget-object p3, p3, Lxz1;->b:Ljava/util/Map;

    .line 552
    .line 553
    if-eqz p3, :cond_16

    .line 554
    .line 555
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    .line 556
    .line 557
    .line 558
    move-result p3

    .line 559
    if-ne p3, v6, :cond_16

    .line 560
    .line 561
    goto/16 :goto_f

    .line 562
    .line 563
    :cond_16
    iget-object p3, v0, Lqk2;->m:Lql2;

    .line 564
    .line 565
    if-eqz p3, :cond_17

    .line 566
    .line 567
    iget-object p3, p3, Lql2;->C:Lxz1;

    .line 568
    .line 569
    if-eqz p3, :cond_17

    .line 570
    .line 571
    iget-object p3, p3, Lxz1;->b:Ljava/util/Map;

    .line 572
    .line 573
    if-eqz p3, :cond_17

    .line 574
    .line 575
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 576
    .line 577
    .line 578
    move-result-object p3

    .line 579
    if-eqz p3, :cond_17

    .line 580
    .line 581
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 582
    .line 583
    .line 584
    move-result-object p3

    .line 585
    if-nez p3, :cond_18

    .line 586
    .line 587
    :cond_17
    sget-object p3, Lqd0;->a:Lqd0;

    .line 588
    .line 589
    :cond_18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    if-eqz v1, :cond_19

    .line 600
    .line 601
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->N(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 602
    .line 603
    .line 604
    move-result-object p3

    .line 605
    goto :goto_d

    .line 606
    :cond_19
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 607
    .line 608
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 609
    .line 610
    .line 611
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 612
    .line 613
    .line 614
    move-result-object p3

    .line 615
    :cond_1a
    :goto_c
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 616
    .line 617
    .line 618
    move-result v2

    .line 619
    if-eqz v2, :cond_1b

    .line 620
    .line 621
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    invoke-interface {p0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    move-result v3

    .line 629
    if-nez v3, :cond_1a

    .line 630
    .line 631
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    goto :goto_c

    .line 635
    :cond_1b
    move-object p3, v1

    .line 636
    :goto_d
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 637
    .line 638
    .line 639
    move-result-object p3

    .line 640
    :cond_1c
    :goto_e
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 641
    .line 642
    .line 643
    move-result v1

    .line 644
    if-eqz v1, :cond_1d

    .line 645
    .line 646
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    check-cast v1, Ljava/lang/String;

    .line 651
    .line 652
    iget-object v2, v0, Lqk2;->m:Lql2;

    .line 653
    .line 654
    if-eqz v2, :cond_1c

    .line 655
    .line 656
    iget-object v2, v2, Lql2;->C:Lxz1;

    .line 657
    .line 658
    if-eqz v2, :cond_1c

    .line 659
    .line 660
    iget-object v2, v2, Lxz1;->b:Ljava/util/Map;

    .line 661
    .line 662
    if-eqz v2, :cond_1c

    .line 663
    .line 664
    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    check-cast v1, Lrf2;

    .line 669
    .line 670
    goto :goto_e

    .line 671
    :cond_1d
    :goto_f
    iget-object p3, v0, Lqk2;->m:Lql2;

    .line 672
    .line 673
    if-eqz p3, :cond_21

    .line 674
    .line 675
    iget-object p3, p3, Lql2;->C:Lxz1;

    .line 676
    .line 677
    if-eqz p3, :cond_21

    .line 678
    .line 679
    iget-object v1, p3, Lxz1;->c:Ljava/util/LinkedHashSet;

    .line 680
    .line 681
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    iget-object v2, p3, Lxz1;->d:Lwp0;

    .line 685
    .line 686
    if-eqz v2, :cond_21

    .line 687
    .line 688
    iget-object v2, v2, Lwp0;->c:Ljava/util/List;

    .line 689
    .line 690
    if-nez v2, :cond_1e

    .line 691
    .line 692
    goto :goto_12

    .line 693
    :cond_1e
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 694
    .line 695
    .line 696
    move-result-object p0

    .line 697
    :cond_1f
    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 698
    .line 699
    .line 700
    move-result v3

    .line 701
    if-eqz v3, :cond_21

    .line 702
    .line 703
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    check-cast v3, Ljava/lang/String;

    .line 708
    .line 709
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 710
    .line 711
    .line 712
    move-result v5

    .line 713
    if-nez v5, :cond_1f

    .line 714
    .line 715
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 716
    .line 717
    .line 718
    iget-object v5, p3, Lxz1;->b:Ljava/util/Map;

    .line 719
    .line 720
    new-instance v6, Lrf2;

    .line 721
    .line 722
    invoke-direct {v6}, Lrf2;-><init>()V

    .line 723
    .line 724
    .line 725
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    :goto_11
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 730
    .line 731
    .line 732
    move-result v8

    .line 733
    if-eqz v8, :cond_20

    .line 734
    .line 735
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v8

    .line 739
    check-cast v8, Ljava/lang/Number;

    .line 740
    .line 741
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 742
    .line 743
    .line 744
    move-result v8

    .line 745
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 746
    .line 747
    .line 748
    move-result-object v8

    .line 749
    iget-object v9, v6, Lrf2;->a:Ljava/util/TreeSet;

    .line 750
    .line 751
    invoke-virtual {v9, v8}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    goto :goto_11

    .line 755
    :cond_20
    invoke-interface {v5, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    iput v4, p3, Lxz1;->a:I

    .line 759
    .line 760
    goto :goto_10

    .line 761
    :cond_21
    :goto_12
    iget-object p0, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->b:Ljava/util/Map;

    .line 762
    .line 763
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 764
    .line 765
    .line 766
    move-result p0

    .line 767
    if-nez p0, :cond_22

    .line 768
    .line 769
    iget-object p0, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->b:Ljava/util/Map;

    .line 770
    .line 771
    invoke-virtual {v0, p2, p0}, Lqk2;->v(Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Ljava/util/Map;)V

    .line 772
    .line 773
    .line 774
    :cond_22
    sget-object p0, Lo42;->b:Lm42;

    .line 775
    .line 776
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 777
    .line 778
    return-object p0
.end method

.method public final o(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Llk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Llk2;

    .line 7
    .line 8
    iget v1, v0, Llk2;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Llk2;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Llk2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Llk2;-><init>(Lqk2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Llk2;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Llk2;->f:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const-string v4, ""

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v5, :cond_1

    .line 38
    .line 39
    iget-object p0, v0, Llk2;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 40
    .line 41
    iget-object p1, v0, Llk2;->b:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v0, v0, Llk2;->a:Lqk2;

    .line 44
    .line 45
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    check-cast p2, Lo42;

    .line 49
    .line 50
    iget-object p2, p2, Lo42;->a:Ljava/lang/Object;

    .line 51
    .line 52
    move-object v2, p0

    .line 53
    move-object p0, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    if-nez p2, :cond_3

    .line 69
    .line 70
    sget-object p0, Lo42;->b:Lm42;

    .line 71
    .line 72
    new-instance p0, Lvz2;

    .line 73
    .line 74
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string p2, "TCF Options are empty"

    .line 80
    .line 81
    invoke-direct {p0, p2, p1}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    new-instance p1, Ln42;

    .line 85
    .line 86
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_3
    iget-object v2, p0, Lqk2;->c:Lg80;

    .line 91
    .line 92
    check-cast v2, Lpz2;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v6, v2, Lpz2;->e:Lod2;

    .line 101
    .line 102
    sget-object v7, Lfh2;->a:[Lfh2;

    .line 103
    .line 104
    const-string v7, "tcf-"

    .line 105
    .line 106
    invoke-virtual {v7, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v6, v6, Lod2;->a:Landroid/content/SharedPreferences;

    .line 114
    .line 115
    invoke-interface {v6, v7, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    if-nez v3, :cond_4

    .line 120
    .line 121
    move-object v3, v4

    .line 122
    :cond_4
    invoke-static {v3}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    if-nez v6, :cond_5

    .line 127
    .line 128
    sget-object v6, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF$Companion;

    .line 129
    .line 130
    invoke-virtual {v6}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    iget-object v7, v2, Lpz2;->b:Li03;

    .line 135
    .line 136
    sget-object v8, Lb21;->a:Lr11;

    .line 137
    .line 138
    invoke-static {v8, v6, v3, v7}, Lb21;->a(Lb11;Lkotlinx/serialization/KSerializer;Ljava/lang/String;Li03;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    check-cast v3, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 143
    .line 144
    if-eqz v3, :cond_5

    .line 145
    .line 146
    iput-object v3, v2, Lpz2;->g:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 147
    .line 148
    :cond_5
    iget-object v2, v2, Lpz2;->g:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 149
    .line 150
    iput-object p0, v0, Llk2;->a:Lqk2;

    .line 151
    .line 152
    iput-object p1, v0, Llk2;->b:Ljava/lang/String;

    .line 153
    .line 154
    iput-object v2, v0, Llk2;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 155
    .line 156
    iput v5, v0, Llk2;->f:I

    .line 157
    .line 158
    invoke-virtual {p0, p2, v2, v0}, Lqk2;->n(Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;Ld10;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    if-ne p2, v1, :cond_6

    .line 163
    .line 164
    return-object v1

    .line 165
    :cond_6
    :goto_1
    invoke-static {p2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    if-eqz p2, :cond_7

    .line 170
    .line 171
    new-instance p0, Ln42;

    .line 172
    .line 173
    invoke-direct {p0, p2}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :cond_7
    iget-object p2, p0, Lqk2;->c:Lg80;

    .line 178
    .line 179
    iget-object v0, p0, Lqk2;->j:Ljc2;

    .line 180
    .line 181
    iget-boolean v0, v0, Ljc2;->f:Z

    .line 182
    .line 183
    if-eqz v0, :cond_8

    .line 184
    .line 185
    sget-object v0, Lbv0;->Companion:Lav0;

    .line 186
    .line 187
    const/4 v0, 0x0

    .line 188
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    new-instance v1, Lkotlin/Pair;

    .line 193
    .line 194
    const-string v3, "IABTCF_gdprApplies"

    .line 195
    .line 196
    invoke-direct {v1, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v1}, Lnc1;->d(Lkotlin/Pair;)Ljava/util/Map;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    move-object v1, p2

    .line 204
    check-cast v1, Lpz2;

    .line 205
    .line 206
    invoke-virtual {v1, v0}, Lpz2;->h(Ljava/util/Map;)V

    .line 207
    .line 208
    .line 209
    :cond_8
    check-cast p2, Lpz2;

    .line 210
    .line 211
    iget-object v0, p2, Lpz2;->e:Lod2;

    .line 212
    .line 213
    sget-object v1, Lfh2;->a:[Lfh2;

    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    iget-object v0, v0, Lod2;->a:Landroid/content/SharedPreferences;

    .line 219
    .line 220
    const-string v1, "actual_tcf"

    .line 221
    .line 222
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-nez v0, :cond_9

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_9
    move-object v4, v0

    .line 230
    :goto_2
    invoke-static {v4}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-nez v0, :cond_d

    .line 235
    .line 236
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_a

    .line 241
    .line 242
    goto :goto_3

    .line 243
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    iget-object v0, p2, Lpz2;->e:Lod2;

    .line 247
    .line 248
    invoke-virtual {v0, v1, p1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p2}, Lpz2;->b()V

    .line 252
    .line 253
    .line 254
    iget-object p1, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->a:Ljava/lang/String;

    .line 255
    .line 256
    invoke-virtual {p0, p1}, Lqk2;->x(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    iget-object p1, v2, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->c:Ljava/lang/String;

    .line 260
    .line 261
    if-eqz p1, :cond_d

    .line 262
    .line 263
    invoke-static {p1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 264
    .line 265
    .line 266
    move-result p2

    .line 267
    xor-int/2addr p2, v5

    .line 268
    if-ne p2, v5, :cond_d

    .line 269
    .line 270
    iget-object p0, p0, Lqk2;->f:Ly3;

    .line 271
    .line 272
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-static {p1}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 276
    .line 277
    .line 278
    move-result p2

    .line 279
    if-eqz p2, :cond_b

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_b
    iput-object p1, p0, Ly3;->e:Ljava/lang/String;

    .line 283
    .line 284
    iget-object p2, p0, Ly3;->b:Lg80;

    .line 285
    .line 286
    check-cast p2, Lpz2;

    .line 287
    .line 288
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    iget-object p2, p2, Lpz2;->d:Lod2;

    .line 292
    .line 293
    sget-object v0, Lbv0;->Companion:Lav0;

    .line 294
    .line 295
    const-string v0, "IABTCF_AddtlConsent"

    .line 296
    .line 297
    invoke-virtual {p2, v0, p1}, Lod2;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    iget-object p1, p0, Ly3;->d:Ljava/util/List;

    .line 301
    .line 302
    if-eqz p1, :cond_d

    .line 303
    .line 304
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    if-eqz p1, :cond_c

    .line 309
    .line 310
    goto :goto_3

    .line 311
    :cond_c
    invoke-virtual {p0}, Ly3;->d()Ljava/util/List;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    invoke-virtual {p0, p1}, Ly3;->g(Ljava/util/List;)V

    .line 316
    .line 317
    .line 318
    :cond_d
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object p0
.end method

.method public final r(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lmk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lmk2;

    .line 7
    .line 8
    iget v1, v0, Lmk2;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lmk2;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmk2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lmk2;-><init>(Lqk2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lmk2;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lmk2;->c:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    check-cast p2, Lo42;

    .line 41
    .line 42
    iget-object p0, p2, Lo42;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :try_start_1
    iget-object p0, p0, Lqk2;->m:Lql2;

    .line 55
    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    iget-object v3, p0, Lql2;->b:Lwp0;

    .line 59
    .line 60
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iput v4, v0, Lmk2;->c:I

    .line 64
    .line 65
    invoke-virtual {v3, p1, v0}, Lwp0;->a(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-ne p0, v1, :cond_4

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_4
    :goto_1
    invoke-static {p0}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    if-nez p0, :cond_5

    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_5
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    :catchall_0
    move-exception p0

    .line 83
    sget-object p1, Lo42;->b:Lm42;

    .line 84
    .line 85
    new-instance p1, Lvz2;

    .line 86
    .line 87
    sget-object p2, Lpl2;->a:[Lpl2;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    const-string v0, "Usercentrics: Unable to reset Global Vendor List: "

    .line 94
    .line 95
    invoke-static {v0, p2}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-direct {p1, p2, p0}, Lvz2;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    new-instance p0, Ln42;

    .line 103
    .line 104
    invoke-direct {p0, p1}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    return-object p0
.end method

.method public final s()V
    .locals 1

    .line 1
    iget-object v0, p0, Lqk2;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqk2;->l:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lqk2;->n:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 13
    .line 14
    iget-object p0, p0, Lqk2;->q:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final t(Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljl2;

    .line 16
    .line 17
    iget-object v1, v0, Ljl2;->b:Ljava/lang/Boolean;

    .line 18
    .line 19
    iget v2, v0, Ljl2;->a:I

    .line 20
    .line 21
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iget-object v4, p0, Lqk2;->m:Lql2;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    iget-object v1, v4, Lql2;->r:Lu13;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lu13;->b(I)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    if-eqz v4, :cond_2

    .line 42
    .line 43
    iget-object v1, v4, Lql2;->r:Lu13;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lu13;->d(I)V

    .line 48
    .line 49
    .line 50
    :cond_2
    :goto_1
    iget-object v0, v0, Ljl2;->c:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v1, p0, Lqk2;->m:Lql2;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v0, v1, Lql2;->s:Lu13;

    .line 63
    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Lu13;->b(I)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    if-eqz v1, :cond_0

    .line 71
    .line 72
    iget-object v0, v1, Lql2;->s:Lu13;

    .line 73
    .line 74
    if-eqz v0, :cond_0

    .line 75
    .line 76
    invoke-virtual {v0, v2}, Lu13;->d(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    return-void
.end method

.method public final u(Ljava/util/List;)V
    .locals 8

    .line 1
    iget-object p0, p0, Lqk2;->m:Lql2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Lll2;

    .line 41
    .line 42
    iget-object v5, v4, Lll2;->b:Ljava/lang/Boolean;

    .line 43
    .line 44
    iget v6, v4, Lll2;->a:I

    .line 45
    .line 46
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :goto_1
    iget-object v4, v4, Lll2;->c:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    iget-object p1, p0, Lql2;->y:Lu13;

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lu13;->c(Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lql2;->y:Lu13;

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Lu13;->e(Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Lql2;->z:Lu13;

    .line 104
    .line 105
    invoke-virtual {p1, v2}, Lu13;->c(Ljava/util/List;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, Lql2;->z:Lu13;

    .line 109
    .line 110
    invoke-virtual {p0, v3}, Lu13;->e(Ljava/util/List;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final v(Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;Ljava/util/Map;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->T:Lpk2;

    .line 10
    .line 11
    sget-object v0, Lpk2;->a:Lpk2;

    .line 12
    .line 13
    if-ne p1, v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p0, p0, Lqk2;->m:Lql2;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lql2;->A:Lu13;

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lu13;->c(Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final w()V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ljb1;->h()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lqk2;->k()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/16 v5, 0xa

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 34
    .line 35
    iget-object v4, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

    .line 36
    .line 37
    new-instance v6, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-static {v4, v5}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    check-cast v5, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 61
    .line 62
    iget v5, v5, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 63
    .line 64
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 77
    .line 78
    invoke-direct {v3, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    new-instance v3, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_4

    .line 99
    .line 100
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, Ljava/lang/Number;

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    iget-object v7, v0, Lqk2;->m:Lql2;

    .line 111
    .line 112
    if-eqz v7, :cond_3

    .line 113
    .line 114
    iget-object v7, v7, Lql2;->b:Lwp0;

    .line 115
    .line 116
    iget-object v7, v7, Lwp0;->e:Ljava/util/Map;

    .line 117
    .line 118
    if-eqz v7, :cond_3

    .line 119
    .line 120
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-interface {v7, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    move-object v6, v4

    .line 129
    check-cast v6, Lcom/usercentrics/tcf/core/model/gvl/Feature;

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_3
    const/4 v6, 0x0

    .line 133
    :goto_3
    if-eqz v6, :cond_2

    .line 134
    .line 135
    new-instance v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;

    .line 136
    .line 137
    iget-object v7, v6, Lcom/usercentrics/tcf/core/model/gvl/Feature;->a:Ljava/lang/String;

    .line 138
    .line 139
    iget-object v8, v6, Lcom/usercentrics/tcf/core/model/gvl/Feature;->d:Ljava/util/List;

    .line 140
    .line 141
    iget v9, v6, Lcom/usercentrics/tcf/core/model/gvl/Feature;->b:I

    .line 142
    .line 143
    iget-object v6, v6, Lcom/usercentrics/tcf/core/model/gvl/Feature;->c:Ljava/lang/String;

    .line 144
    .line 145
    invoke-direct {v4, v9, v7, v6, v8}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFFeature;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_4
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    sget-object v3, Lb7;->n0:Lb7;

    .line 157
    .line 158
    invoke-static {v2, v3}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iget-object v3, v0, Lqk2;->l:Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_1b

    .line 169
    .line 170
    invoke-virtual {v0}, Lqk2;->e()Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v0}, Lqk2;->h()Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    move-result-object v9

    .line 178
    invoke-virtual {v0}, Lqk2;->k()Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    invoke-virtual {v0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    new-instance v12, Ljava/util/ArrayList;

    .line 190
    .line 191
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 192
    .line 193
    .line 194
    new-instance v13, Ljava/util/ArrayList;

    .line 195
    .line 196
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 197
    .line 198
    .line 199
    new-instance v14, Ljava/util/ArrayList;

    .line 200
    .line 201
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 202
    .line 203
    .line 204
    new-instance v15, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-static {v10, v5}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    invoke-direct {v15, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 211
    .line 212
    .line 213
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v16

    .line 221
    if-eqz v16, :cond_6

    .line 222
    .line 223
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v16

    .line 227
    move-object/from16 v8, v16

    .line 228
    .line 229
    check-cast v8, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 230
    .line 231
    iget-object v8, v8, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 232
    .line 233
    new-instance v7, Ljava/util/ArrayList;

    .line 234
    .line 235
    move-object/from16 v17, v1

    .line 236
    .line 237
    invoke-static {v8, v5}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v8

    .line 252
    if-eqz v8, :cond_5

    .line 253
    .line 254
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    check-cast v8, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 259
    .line 260
    iget v8, v8, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 261
    .line 262
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_5
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-object/from16 v1, v17

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_6
    move-object/from16 v17, v1

    .line 277
    .line 278
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 283
    .line 284
    .line 285
    move-result v6

    .line 286
    if-eqz v6, :cond_7

    .line 287
    .line 288
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    check-cast v6, Ljava/util/List;

    .line 293
    .line 294
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 295
    .line 296
    .line 297
    goto :goto_6

    .line 298
    :cond_7
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 299
    .line 300
    invoke-direct {v1, v13}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 301
    .line 302
    .line 303
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    new-instance v6, Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-static {v10, v5}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 318
    .line 319
    .line 320
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-eqz v8, :cond_9

    .line 329
    .line 330
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    check-cast v8, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 335
    .line 336
    iget-object v8, v8, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 337
    .line 338
    new-instance v13, Ljava/util/ArrayList;

    .line 339
    .line 340
    invoke-static {v8, v5}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 341
    .line 342
    .line 343
    move-result v15

    .line 344
    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 345
    .line 346
    .line 347
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v8

    .line 351
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v15

    .line 355
    if-eqz v15, :cond_8

    .line 356
    .line 357
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v15

    .line 361
    check-cast v15, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 362
    .line 363
    iget v15, v15, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 364
    .line 365
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 366
    .line 367
    .line 368
    move-result-object v15

    .line 369
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_8

    .line 373
    :cond_8
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    if-eqz v7, :cond_a

    .line 386
    .line 387
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v7

    .line 391
    check-cast v7, Ljava/util/List;

    .line 392
    .line 393
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 394
    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_a
    new-instance v6, Ljava/util/LinkedHashSet;

    .line 398
    .line 399
    invoke-direct {v6, v12}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 400
    .line 401
    .line 402
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v7

    .line 418
    if-eqz v7, :cond_1a

    .line 419
    .line 420
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v7

    .line 424
    check-cast v7, Ljava/lang/Number;

    .line 425
    .line 426
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 427
    .line 428
    .line 429
    move-result v7

    .line 430
    iget-object v8, v0, Lqk2;->m:Lql2;

    .line 431
    .line 432
    if-eqz v8, :cond_b

    .line 433
    .line 434
    iget-object v8, v8, Lql2;->b:Lwp0;

    .line 435
    .line 436
    iget-object v8, v8, Lwp0;->f:Ljava/util/Map;

    .line 437
    .line 438
    if-eqz v8, :cond_b

    .line 439
    .line 440
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v12

    .line 444
    invoke-interface {v8, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v8

    .line 448
    check-cast v8, Lcom/usercentrics/tcf/core/model/gvl/Purpose;

    .line 449
    .line 450
    goto :goto_b

    .line 451
    :cond_b
    const/4 v8, 0x0

    .line 452
    :goto_b
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v12

    .line 456
    :goto_c
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v13

    .line 460
    if-eqz v13, :cond_d

    .line 461
    .line 462
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v13

    .line 466
    move-object v15, v13

    .line 467
    check-cast v15, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 468
    .line 469
    iget-object v15, v15, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->d:Ljava/util/List;

    .line 470
    .line 471
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 472
    .line 473
    .line 474
    move-result-object v5

    .line 475
    invoke-interface {v15, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v5

    .line 479
    if-eqz v5, :cond_c

    .line 480
    .line 481
    goto :goto_d

    .line 482
    :cond_c
    const/16 v5, 0xa

    .line 483
    .line 484
    goto :goto_c

    .line 485
    :cond_d
    const/4 v13, 0x0

    .line 486
    :goto_d
    check-cast v13, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 487
    .line 488
    if-eqz v8, :cond_19

    .line 489
    .line 490
    iget-object v5, v0, Lqk2;->m:Lql2;

    .line 491
    .line 492
    if-eqz v5, :cond_e

    .line 493
    .line 494
    iget-object v5, v5, Lql2;->r:Lu13;

    .line 495
    .line 496
    if-eqz v5, :cond_e

    .line 497
    .line 498
    invoke-virtual {v5, v7}, Lu13;->a(I)Z

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 503
    .line 504
    .line 505
    move-result-object v5

    .line 506
    move-object/from16 v23, v5

    .line 507
    .line 508
    goto :goto_e

    .line 509
    :cond_e
    const/16 v23, 0x0

    .line 510
    .line 511
    :goto_e
    iget-object v5, v8, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->a:Ljava/lang/String;

    .line 512
    .line 513
    iget v12, v8, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->b:I

    .line 514
    .line 515
    if-eqz v13, :cond_f

    .line 516
    .line 517
    const/16 v24, 0x1

    .line 518
    .line 519
    goto :goto_f

    .line 520
    :cond_f
    const/16 v24, 0x0

    .line 521
    .line 522
    :goto_f
    iget-object v15, v0, Lqk2;->o:Ljava/util/LinkedHashMap;

    .line 523
    .line 524
    invoke-interface {v15}, Ljava/util/Map;->isEmpty()Z

    .line 525
    .line 526
    .line 527
    move-result v15

    .line 528
    if-nez v15, :cond_10

    .line 529
    .line 530
    iget-object v15, v0, Lqk2;->m:Lql2;

    .line 531
    .line 532
    if-eqz v15, :cond_10

    .line 533
    .line 534
    iget-object v15, v15, Lql2;->s:Lu13;

    .line 535
    .line 536
    if-eqz v15, :cond_10

    .line 537
    .line 538
    invoke-virtual {v15, v7}, Lu13;->a(I)Z

    .line 539
    .line 540
    .line 541
    move-result v15

    .line 542
    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 543
    .line 544
    .line 545
    move-result-object v15

    .line 546
    move-object/from16 v25, v15

    .line 547
    .line 548
    goto :goto_10

    .line 549
    :cond_10
    const/16 v25, 0x0

    .line 550
    .line 551
    :goto_10
    iget-object v15, v8, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->c:Ljava/lang/String;

    .line 552
    .line 553
    move-object/from16 v30, v2

    .line 554
    .line 555
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    move-result v2

    .line 563
    if-eqz v2, :cond_11

    .line 564
    .line 565
    invoke-virtual {v11}, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a()Z

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    if-eqz v2, :cond_11

    .line 570
    .line 571
    const/16 v26, 0x1

    .line 572
    .line 573
    goto :goto_11

    .line 574
    :cond_11
    const/16 v26, 0x0

    .line 575
    .line 576
    :goto_11
    iget v2, v8, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->b:I

    .line 577
    .line 578
    move-object/from16 v31, v4

    .line 579
    .line 580
    const/4 v4, 0x1

    .line 581
    if-eq v2, v4, :cond_12

    .line 582
    .line 583
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    if-eqz v2, :cond_12

    .line 592
    .line 593
    invoke-virtual {v11}, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a()Z

    .line 594
    .line 595
    .line 596
    move-result v2

    .line 597
    if-eqz v2, :cond_12

    .line 598
    .line 599
    iget-boolean v2, v11, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 600
    .line 601
    if-nez v2, :cond_12

    .line 602
    .line 603
    move/from16 v27, v4

    .line 604
    .line 605
    goto :goto_12

    .line 606
    :cond_12
    const/16 v27, 0x0

    .line 607
    .line 608
    :goto_12
    if-eqz v13, :cond_13

    .line 609
    .line 610
    iget v2, v13, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->b:I

    .line 611
    .line 612
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 613
    .line 614
    .line 615
    move-result-object v2

    .line 616
    move-object/from16 v28, v2

    .line 617
    .line 618
    goto :goto_13

    .line 619
    :cond_13
    const/16 v28, 0x0

    .line 620
    .line 621
    :goto_13
    iget-object v2, v8, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->d:Ljava/util/List;

    .line 622
    .line 623
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 624
    .line 625
    .line 626
    move-result-object v8

    .line 627
    const/4 v13, 0x0

    .line 628
    :goto_14
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 629
    .line 630
    .line 631
    move-result v16

    .line 632
    if-eqz v16, :cond_18

    .line 633
    .line 634
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object v16

    .line 638
    move-object/from16 v4, v16

    .line 639
    .line 640
    check-cast v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 641
    .line 642
    move-object/from16 v16, v1

    .line 643
    .line 644
    iget-object v1, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 645
    .line 646
    iget-object v4, v4, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 647
    .line 648
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 653
    .line 654
    .line 655
    move-result v4

    .line 656
    if-eqz v4, :cond_14

    .line 657
    .line 658
    const/4 v4, 0x0

    .line 659
    goto :goto_16

    .line 660
    :cond_14
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 661
    .line 662
    .line 663
    move-result-object v1

    .line 664
    const/4 v4, 0x0

    .line 665
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 666
    .line 667
    .line 668
    move-result v18

    .line 669
    if-eqz v18, :cond_17

    .line 670
    .line 671
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v18

    .line 675
    move-object/from16 v19, v1

    .line 676
    .line 677
    move-object/from16 v1, v18

    .line 678
    .line 679
    check-cast v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 680
    .line 681
    iget v1, v1, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 682
    .line 683
    if-ne v1, v7, :cond_15

    .line 684
    .line 685
    add-int/lit8 v4, v4, 0x1

    .line 686
    .line 687
    if-ltz v4, :cond_16

    .line 688
    .line 689
    :cond_15
    move-object/from16 v1, v19

    .line 690
    .line 691
    goto :goto_15

    .line 692
    :cond_16
    new-instance v0, Ljava/lang/ArithmeticException;

    .line 693
    .line 694
    const-string v1, "Count overflow has happened."

    .line 695
    .line 696
    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    throw v0

    .line 700
    :cond_17
    :goto_16
    add-int/2addr v13, v4

    .line 701
    move-object/from16 v1, v16

    .line 702
    .line 703
    const/4 v4, 0x1

    .line 704
    goto :goto_14

    .line 705
    :cond_18
    move-object/from16 v16, v1

    .line 706
    .line 707
    new-instance v18, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 708
    .line 709
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 710
    .line 711
    .line 712
    move-result-object v29

    .line 713
    move-object/from16 v20, v2

    .line 714
    .line 715
    move-object/from16 v19, v5

    .line 716
    .line 717
    move/from16 v21, v12

    .line 718
    .line 719
    move-object/from16 v22, v15

    .line 720
    .line 721
    invoke-direct/range {v18 .. v29}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;-><init>(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Boolean;ZZLjava/lang/Integer;Ljava/lang/Integer;)V

    .line 722
    .line 723
    .line 724
    move-object/from16 v1, v18

    .line 725
    .line 726
    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 727
    .line 728
    .line 729
    goto :goto_17

    .line 730
    :cond_19
    move-object/from16 v16, v1

    .line 731
    .line 732
    move-object/from16 v30, v2

    .line 733
    .line 734
    move-object/from16 v31, v4

    .line 735
    .line 736
    :goto_17
    move-object/from16 v1, v16

    .line 737
    .line 738
    move-object/from16 v2, v30

    .line 739
    .line 740
    move-object/from16 v4, v31

    .line 741
    .line 742
    const/16 v5, 0xa

    .line 743
    .line 744
    goto/16 :goto_a

    .line 745
    .line 746
    :cond_1a
    move-object/from16 v30, v2

    .line 747
    .line 748
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 749
    .line 750
    .line 751
    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    sget-object v2, Lb7;->m0:Lb7;

    .line 756
    .line 757
    invoke-static {v1, v2}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 762
    .line 763
    .line 764
    goto :goto_18

    .line 765
    :cond_1b
    move-object/from16 v17, v1

    .line 766
    .line 767
    move-object/from16 v30, v2

    .line 768
    .line 769
    :goto_18
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->M(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 774
    .line 775
    .line 776
    move-result-object v3

    .line 777
    invoke-virtual {v0}, Lqk2;->g()Ljava/util/List;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-virtual {v0}, Lqk2;->h()Ljava/util/ArrayList;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    invoke-virtual {v0}, Lqk2;->j()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 786
    .line 787
    .line 788
    move-result-object v4

    .line 789
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    new-instance v5, Ljava/util/ArrayList;

    .line 793
    .line 794
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 795
    .line 796
    .line 797
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    :cond_1c
    :goto_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 802
    .line 803
    .line 804
    move-result v6

    .line 805
    if-eqz v6, :cond_23

    .line 806
    .line 807
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v6

    .line 811
    check-cast v6, Ljava/lang/Number;

    .line 812
    .line 813
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 814
    .line 815
    .line 816
    move-result v6

    .line 817
    iget-object v7, v0, Lqk2;->m:Lql2;

    .line 818
    .line 819
    if-eqz v7, :cond_1d

    .line 820
    .line 821
    iget-object v7, v7, Lql2;->b:Lwp0;

    .line 822
    .line 823
    iget-object v7, v7, Lwp0;->h:Ljava/util/Map;

    .line 824
    .line 825
    if-eqz v7, :cond_1d

    .line 826
    .line 827
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v8

    .line 831
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v7

    .line 835
    check-cast v7, Lcom/usercentrics/tcf/core/model/gvl/Feature;

    .line 836
    .line 837
    goto :goto_1a

    .line 838
    :cond_1d
    const/4 v7, 0x0

    .line 839
    :goto_1a
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 840
    .line 841
    .line 842
    move-result-object v8

    .line 843
    :cond_1e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 844
    .line 845
    .line 846
    move-result v9

    .line 847
    if-eqz v9, :cond_1f

    .line 848
    .line 849
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v9

    .line 853
    move-object v10, v9

    .line 854
    check-cast v10, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 855
    .line 856
    iget-object v10, v10, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->e:Ljava/util/List;

    .line 857
    .line 858
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 859
    .line 860
    .line 861
    move-result-object v11

    .line 862
    invoke-interface {v10, v11}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 863
    .line 864
    .line 865
    move-result v10

    .line 866
    if-eqz v10, :cond_1e

    .line 867
    .line 868
    goto :goto_1b

    .line 869
    :cond_1f
    const/4 v9, 0x0

    .line 870
    :goto_1b
    check-cast v9, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 871
    .line 872
    if-eqz v7, :cond_1c

    .line 873
    .line 874
    iget-object v8, v0, Lqk2;->m:Lql2;

    .line 875
    .line 876
    if-eqz v8, :cond_20

    .line 877
    .line 878
    iget-object v8, v8, Lql2;->q:Lu13;

    .line 879
    .line 880
    if-eqz v8, :cond_20

    .line 881
    .line 882
    invoke-virtual {v8, v6}, Lu13;->a(I)Z

    .line 883
    .line 884
    .line 885
    move-result v6

    .line 886
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 887
    .line 888
    .line 889
    move-result-object v6

    .line 890
    move-object/from16 v23, v6

    .line 891
    .line 892
    goto :goto_1c

    .line 893
    :cond_20
    const/16 v23, 0x0

    .line 894
    .line 895
    :goto_1c
    iget-object v6, v7, Lcom/usercentrics/tcf/core/model/gvl/Feature;->a:Ljava/lang/String;

    .line 896
    .line 897
    iget-object v8, v7, Lcom/usercentrics/tcf/core/model/gvl/Feature;->d:Ljava/util/List;

    .line 898
    .line 899
    iget v10, v7, Lcom/usercentrics/tcf/core/model/gvl/Feature;->b:I

    .line 900
    .line 901
    if-eqz v9, :cond_21

    .line 902
    .line 903
    const/16 v24, 0x1

    .line 904
    .line 905
    goto :goto_1d

    .line 906
    :cond_21
    const/16 v24, 0x0

    .line 907
    .line 908
    :goto_1d
    iget-object v7, v7, Lcom/usercentrics/tcf/core/model/gvl/Feature;->c:Ljava/lang/String;

    .line 909
    .line 910
    invoke-virtual {v4}, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->a()Z

    .line 911
    .line 912
    .line 913
    move-result v26

    .line 914
    if-eqz v9, :cond_22

    .line 915
    .line 916
    iget v9, v9, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->b:I

    .line 917
    .line 918
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 919
    .line 920
    .line 921
    move-result-object v9

    .line 922
    move-object/from16 v25, v9

    .line 923
    .line 924
    goto :goto_1e

    .line 925
    :cond_22
    const/16 v25, 0x0

    .line 926
    .line 927
    :goto_1e
    new-instance v18, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;

    .line 928
    .line 929
    move-object/from16 v19, v6

    .line 930
    .line 931
    move-object/from16 v22, v7

    .line 932
    .line 933
    move-object/from16 v20, v8

    .line 934
    .line 935
    move/from16 v21, v10

    .line 936
    .line 937
    invoke-direct/range {v18 .. v26}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;-><init>(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/Boolean;ZLjava/lang/Integer;Z)V

    .line 938
    .line 939
    .line 940
    move-object/from16 v6, v18

    .line 941
    .line 942
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 943
    .line 944
    .line 945
    goto/16 :goto_19

    .line 946
    .line 947
    :cond_23
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    sget-object v2, Lb7;->o0:Lb7;

    .line 952
    .line 953
    invoke-static {v1, v2}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 954
    .line 955
    .line 956
    move-result-object v4

    .line 957
    new-instance v1, Ljava/util/ArrayList;

    .line 958
    .line 959
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v0}, Lqk2;->k()Ljava/util/List;

    .line 963
    .line 964
    .line 965
    move-result-object v2

    .line 966
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 967
    .line 968
    .line 969
    move-result-object v2

    .line 970
    :goto_1f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 971
    .line 972
    .line 973
    move-result v5

    .line 974
    if-eqz v5, :cond_25

    .line 975
    .line 976
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v5

    .line 980
    check-cast v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 981
    .line 982
    iget-object v5, v5, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 983
    .line 984
    new-instance v6, Ljava/util/ArrayList;

    .line 985
    .line 986
    const/16 v7, 0xa

    .line 987
    .line 988
    invoke-static {v5, v7}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 989
    .line 990
    .line 991
    move-result v8

    .line 992
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 993
    .line 994
    .line 995
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 996
    .line 997
    .line 998
    move-result-object v5

    .line 999
    :goto_20
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1000
    .line 1001
    .line 1002
    move-result v8

    .line 1003
    if-eqz v8, :cond_24

    .line 1004
    .line 1005
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v8

    .line 1009
    check-cast v8, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;

    .line 1010
    .line 1011
    iget v8, v8, Lcom/usercentrics/sdk/services/tcf/interfaces/IdAndName;->a:I

    .line 1012
    .line 1013
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v8

    .line 1017
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1018
    .line 1019
    .line 1020
    goto :goto_20

    .line 1021
    :cond_24
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1022
    .line 1023
    .line 1024
    goto :goto_1f

    .line 1025
    :cond_25
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 1026
    .line 1027
    invoke-direct {v2, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 1028
    .line 1029
    .line 1030
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    new-instance v2, Ljava/util/ArrayList;

    .line 1035
    .line 1036
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1037
    .line 1038
    .line 1039
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v1

    .line 1043
    :cond_26
    :goto_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1044
    .line 1045
    .line 1046
    move-result v5

    .line 1047
    if-eqz v5, :cond_28

    .line 1048
    .line 1049
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v5

    .line 1053
    check-cast v5, Ljava/lang/Number;

    .line 1054
    .line 1055
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 1056
    .line 1057
    .line 1058
    move-result v5

    .line 1059
    iget-object v6, v0, Lqk2;->m:Lql2;

    .line 1060
    .line 1061
    if-eqz v6, :cond_27

    .line 1062
    .line 1063
    iget-object v6, v6, Lql2;->b:Lwp0;

    .line 1064
    .line 1065
    iget-object v6, v6, Lwp0;->i:Ljava/util/Map;

    .line 1066
    .line 1067
    if-eqz v6, :cond_27

    .line 1068
    .line 1069
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v5

    .line 1073
    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v5

    .line 1077
    check-cast v5, Lcom/usercentrics/tcf/core/model/gvl/Purpose;

    .line 1078
    .line 1079
    goto :goto_22

    .line 1080
    :cond_27
    const/4 v5, 0x0

    .line 1081
    :goto_22
    if-eqz v5, :cond_26

    .line 1082
    .line 1083
    new-instance v6, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;

    .line 1084
    .line 1085
    iget-object v7, v5, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->a:Ljava/lang/String;

    .line 1086
    .line 1087
    iget-object v8, v5, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->d:Ljava/util/List;

    .line 1088
    .line 1089
    iget v9, v5, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->b:I

    .line 1090
    .line 1091
    iget-object v5, v5, Lcom/usercentrics/tcf/core/model/gvl/Purpose;->c:Ljava/lang/String;

    .line 1092
    .line 1093
    invoke-direct {v6, v9, v7, v5, v8}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    goto :goto_21

    .line 1100
    :cond_28
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v1

    .line 1104
    sget-object v2, Lb7;->p0:Lb7;

    .line 1105
    .line 1106
    invoke-static {v1, v2}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v5

    .line 1110
    invoke-virtual {v0}, Lqk2;->h()Ljava/util/ArrayList;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v1

    .line 1114
    sget-object v2, Lnk2;->b:Lnk2;

    .line 1115
    .line 1116
    invoke-static {v1, v2}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v6

    .line 1120
    invoke-virtual {v0}, Lqk2;->k()Ljava/util/List;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v1

    .line 1124
    sget-object v2, Lnk2;->c:Lnk2;

    .line 1125
    .line 1126
    invoke-static {v1, v2}, Lhu0;->D0(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v7

    .line 1130
    iget-object v1, v0, Lqk2;->c:Lg80;

    .line 1131
    .line 1132
    check-cast v1, Lpz2;

    .line 1133
    .line 1134
    iget-object v1, v1, Lpz2;->g:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;

    .line 1135
    .line 1136
    iget-object v8, v1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageTCF;->a:Ljava/lang/String;

    .line 1137
    .line 1138
    iget-object v1, v0, Lqk2;->b:Lpc2;

    .line 1139
    .line 1140
    iget-object v1, v1, Lpc2;->d:Lkn1;

    .line 1141
    .line 1142
    if-eqz v1, :cond_29

    .line 1143
    .line 1144
    iget v1, v1, Lkn1;->c:I

    .line 1145
    .line 1146
    goto :goto_23

    .line 1147
    :cond_29
    const/4 v1, 0x0

    .line 1148
    :goto_23
    iget-object v2, v0, Lqk2;->f:Ly3;

    .line 1149
    .line 1150
    iget-object v2, v2, Ly3;->d:Ljava/util/List;

    .line 1151
    .line 1152
    if-eqz v2, :cond_2a

    .line 1153
    .line 1154
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1155
    .line 1156
    .line 1157
    move-result v2

    .line 1158
    goto :goto_24

    .line 1159
    :cond_2a
    const/4 v2, 0x0

    .line 1160
    :goto_24
    iget-object v9, v0, Lqk2;->k:Ljava/util/ArrayList;

    .line 1161
    .line 1162
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1163
    .line 1164
    .line 1165
    move-result v9

    .line 1166
    add-int/2addr v9, v1

    .line 1167
    add-int/2addr v9, v2

    .line 1168
    move-object/from16 v1, v17

    .line 1169
    .line 1170
    move-object/from16 v2, v30

    .line 1171
    .line 1172
    invoke-direct/range {v1 .. v9}, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;-><init>(Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;I)V

    .line 1173
    .line 1174
    .line 1175
    iput-object v1, v0, Lqk2;->n:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 1176
    .line 1177
    return-void
.end method

.method public final x(Ljava/lang/String;)V
    .locals 42

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljb1;->h()V

    .line 7
    .line 8
    .line 9
    iget-object v1, v0, Lqk2;->m:Lql2;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-virtual {v0}, Lqk2;->d()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    sget-object v3, Lod0;->a:Lod0;

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v4, Lg92;->Companion:Lf92;

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lf92;->a(Lql2;)Lql2;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v5, v4, Lql2;->g:I

    .line 33
    .line 34
    const/4 v6, 0x2

    .line 35
    if-ne v5, v6, :cond_18

    .line 36
    .line 37
    sget-object v5, Lt82;->b:Lt82;

    .line 38
    .line 39
    invoke-static {v5}, Lkotlin/collections/a;->b(Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v6, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    sget-object v5, Lt82;->c:Lt82;

    .line 52
    .line 53
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    iget-boolean v4, v4, Lql2;->c:Z

    .line 57
    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    sget-object v4, Lt82;->e:Lt82;

    .line 61
    .line 62
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->K(Ljava/lang/Iterable;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const-string v6, "AA"

    .line 77
    .line 78
    const-string v8, ""

    .line 79
    .line 80
    move-object v9, v8

    .line 81
    move-object v10, v9

    .line 82
    move-object v11, v10

    .line 83
    move-object v12, v11

    .line 84
    move-object v13, v12

    .line 85
    move-object v14, v13

    .line 86
    move-object v15, v14

    .line 87
    move-object/from16 v16, v15

    .line 88
    .line 89
    move-object/from16 v17, v16

    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    const/16 v19, 0x0

    .line 94
    .line 95
    const/16 v20, 0x0

    .line 96
    .line 97
    const/16 v21, 0x0

    .line 98
    .line 99
    const/16 v22, 0x0

    .line 100
    .line 101
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v23

    .line 105
    if-eqz v23, :cond_11

    .line 106
    .line 107
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v23

    .line 111
    move-object/from16 v7, v23

    .line 112
    .line 113
    check-cast v7, Lt82;

    .line 114
    .line 115
    const-string v5, "->"

    .line 116
    .line 117
    move/from16 v24, v2

    .line 118
    .line 119
    const-string v2, "Error encoding "

    .line 120
    .line 121
    sget-object v25, Lv82;->Companion:Lu82;

    .line 122
    .line 123
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-object/from16 v25, v3

    .line 127
    .line 128
    sget-object v3, Lv82;->a:Ld52;

    .line 129
    .line 130
    iget-object v3, v3, Ld52;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v3, Lfs0;

    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v3, v3, Lfs0;->b:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v3, Ljava/util/Map;

    .line 140
    .line 141
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, Ljava/util/List;

    .line 146
    .line 147
    if-eqz v3, :cond_10

    .line 148
    .line 149
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 154
    .line 155
    .line 156
    move-result v26

    .line 157
    if-eqz v26, :cond_f

    .line 158
    .line 159
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v26

    .line 163
    move-object/from16 v27, v3

    .line 164
    .line 165
    move-object/from16 v3, v26

    .line 166
    .line 167
    check-cast v3, Ljava/lang/String;

    .line 168
    .line 169
    move-object/from16 v26, v4

    .line 170
    .line 171
    invoke-virtual {v1, v3}, Lql2;->a(Ljava/lang/String;)Lb40;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    sget-object v28, Lrj;->Companion:Lqj;

    .line 176
    .line 177
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    move-object/from16 v28, v1

    .line 181
    .line 182
    invoke-static {v3}, Lqj;->a(Ljava/lang/String;)Lrj;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-nez v1, :cond_3

    .line 187
    .line 188
    sget-object v1, Lv82;->Companion:Lu82;

    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-static {v3}, Lu82;->a(Ljava/lang/String;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_2

    .line 198
    .line 199
    invoke-virtual/range {v28 .. v28}, Lql2;->b()Luh2;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    iget v1, v1, Luh2;->a:I

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_2
    const/4 v1, 0x0

    .line 207
    goto :goto_2

    .line 208
    :cond_3
    iget v1, v1, Lrj;->a:I

    .line 209
    .line 210
    :goto_2
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 211
    .line 212
    .line 213
    move-result v29
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 214
    move-object/from16 v30, v6

    .line 215
    .line 216
    const-string v6, "cmpVersion"

    .line 217
    .line 218
    move-object/from16 v31, v8

    .line 219
    .line 220
    const-string v8, "policyVersion"

    .line 221
    .line 222
    move-object/from16 v32, v9

    .line 223
    .line 224
    const-string v9, "publisherCountryCode"

    .line 225
    .line 226
    move-object/from16 v33, v10

    .line 227
    .line 228
    const-string v10, "consentScreen"

    .line 229
    .line 230
    move-object/from16 v34, v11

    .line 231
    .line 232
    const-string v11, "isServiceSpecific"

    .line 233
    .line 234
    move-object/from16 v35, v12

    .line 235
    .line 236
    const-string v12, "cmpId"

    .line 237
    .line 238
    move-object/from16 v36, v13

    .line 239
    .line 240
    const-string v13, "version"

    .line 241
    .line 242
    move-object/from16 v37, v14

    .line 243
    .line 244
    const-string v14, "useNonStandardStacks"

    .line 245
    .line 246
    move-object/from16 v38, v15

    .line 247
    .line 248
    const-string v15, "purposeOneTreatment"

    .line 249
    .line 250
    const-string v0, "consentLanguage"

    .line 251
    .line 252
    move-object/from16 v39, v4

    .line 253
    .line 254
    const-string v4, "created"

    .line 255
    .line 256
    move-object/from16 v40, v5

    .line 257
    .line 258
    const-string v5, "lastUpdated"

    .line 259
    .line 260
    move-object/from16 v41, v7

    .line 261
    .line 262
    const-string v7, "vendorListVersion"

    .line 263
    .line 264
    sparse-switch v29, :sswitch_data_0

    .line 265
    .line 266
    .line 267
    goto/16 :goto_13

    .line 268
    .line 269
    :sswitch_0
    :try_start_1
    const-string v0, "vendorsAllowed"

    .line 270
    .line 271
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_e

    .line 276
    .line 277
    move-object/from16 v4, v39

    .line 278
    .line 279
    check-cast v4, Lxl2;

    .line 280
    .line 281
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 282
    .line 283
    move-object/from16 v4, v39

    .line 284
    .line 285
    check-cast v4, Lxl2;

    .line 286
    .line 287
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    const/4 v0, 0x0

    .line 293
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    :cond_4
    :goto_3
    move-object/from16 v6, v30

    .line 297
    .line 298
    :goto_4
    move-object/from16 v8, v31

    .line 299
    .line 300
    move-object/from16 v9, v32

    .line 301
    .line 302
    :goto_5
    move-object/from16 v10, v33

    .line 303
    .line 304
    :goto_6
    move-object/from16 v11, v34

    .line 305
    .line 306
    :goto_7
    move-object/from16 v12, v35

    .line 307
    .line 308
    :goto_8
    move-object/from16 v13, v36

    .line 309
    .line 310
    :goto_9
    move-object/from16 v14, v37

    .line 311
    .line 312
    :goto_a
    move-object/from16 v15, v38

    .line 313
    .line 314
    :goto_b
    const/4 v0, 0x0

    .line 315
    goto/16 :goto_12

    .line 316
    .line 317
    :goto_c
    move-object/from16 v5, v40

    .line 318
    .line 319
    move-object/from16 v4, v41

    .line 320
    .line 321
    goto/16 :goto_14

    .line 322
    .line 323
    :catchall_0
    move-exception v0

    .line 324
    goto :goto_c

    .line 325
    :sswitch_1
    const-string v0, "vendorsDisclosed"

    .line 326
    .line 327
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_e

    .line 332
    .line 333
    move-object/from16 v4, v39

    .line 334
    .line 335
    check-cast v4, Lxl2;

    .line 336
    .line 337
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 338
    .line 339
    move-object/from16 v4, v39

    .line 340
    .line 341
    check-cast v4, Lxl2;

    .line 342
    .line 343
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    const/4 v0, 0x0

    .line 349
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    move-object/from16 v17, v1

    .line 354
    .line 355
    goto :goto_3

    .line 356
    :sswitch_2
    const-string v0, "specialFeatureOptins"

    .line 357
    .line 358
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    if-eqz v0, :cond_e

    .line 363
    .line 364
    move-object/from16 v4, v39

    .line 365
    .line 366
    check-cast v4, Lxl2;

    .line 367
    .line 368
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 369
    .line 370
    move-object/from16 v4, v39

    .line 371
    .line 372
    check-cast v4, Lxl2;

    .line 373
    .line 374
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    const/4 v0, 0x0

    .line 380
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    move-object v12, v1

    .line 385
    move-object/from16 v6, v30

    .line 386
    .line 387
    move-object/from16 v8, v31

    .line 388
    .line 389
    move-object/from16 v9, v32

    .line 390
    .line 391
    move-object/from16 v10, v33

    .line 392
    .line 393
    move-object/from16 v11, v34

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :sswitch_3
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    if-eqz v0, :cond_e

    .line 401
    .line 402
    goto/16 :goto_11

    .line 403
    .line 404
    :sswitch_4
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    if-eqz v0, :cond_e

    .line 409
    .line 410
    goto :goto_d

    .line 411
    :sswitch_5
    const-string v0, "publisherLegitimateInterests"

    .line 412
    .line 413
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    if-eqz v0, :cond_e

    .line 418
    .line 419
    move-object/from16 v4, v39

    .line 420
    .line 421
    check-cast v4, Lxl2;

    .line 422
    .line 423
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 424
    .line 425
    move-object/from16 v4, v39

    .line 426
    .line 427
    check-cast v4, Lxl2;

    .line 428
    .line 429
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    const/4 v0, 0x0

    .line 435
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    move-object v14, v1

    .line 440
    move-object/from16 v6, v30

    .line 441
    .line 442
    move-object/from16 v8, v31

    .line 443
    .line 444
    move-object/from16 v9, v32

    .line 445
    .line 446
    move-object/from16 v10, v33

    .line 447
    .line 448
    move-object/from16 v11, v34

    .line 449
    .line 450
    move-object/from16 v12, v35

    .line 451
    .line 452
    move-object/from16 v13, v36

    .line 453
    .line 454
    goto/16 :goto_a

    .line 455
    .line 456
    :sswitch_6
    const-string v0, "publisherCustomLegitimateInterests"

    .line 457
    .line 458
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-eqz v0, :cond_e

    .line 463
    .line 464
    move-object/from16 v4, v39

    .line 465
    .line 466
    check-cast v4, Lxl2;

    .line 467
    .line 468
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 469
    .line 470
    move-object/from16 v4, v39

    .line 471
    .line 472
    check-cast v4, Lxl2;

    .line 473
    .line 474
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 475
    .line 476
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    const/4 v0, 0x0

    .line 480
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    move-object/from16 v16, v1

    .line 485
    .line 486
    goto/16 :goto_3

    .line 487
    .line 488
    :sswitch_7
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    if-eqz v0, :cond_e

    .line 493
    .line 494
    :goto_d
    move-object/from16 v0, v39

    .line 495
    .line 496
    check-cast v0, Lsl2;

    .line 497
    .line 498
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 499
    .line 500
    .line 501
    move-result v0

    .line 502
    if-eqz v0, :cond_5

    .line 503
    .line 504
    sget-object v0, Ld50;->Companion:Lc50;

    .line 505
    .line 506
    move-object/from16 v4, v39

    .line 507
    .line 508
    check-cast v4, Lsl2;

    .line 509
    .line 510
    iget-object v4, v4, Lsl2;->g:Ljava/lang/Long;

    .line 511
    .line 512
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 516
    .line 517
    .line 518
    move-result-wide v6

    .line 519
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    invoke-static {v1, v6, v7}, Lc50;->a(IJ)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    :cond_5
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-eqz v0, :cond_4

    .line 530
    .line 531
    sget-object v0, Ld50;->Companion:Lc50;

    .line 532
    .line 533
    move-object/from16 v4, v39

    .line 534
    .line 535
    check-cast v4, Lsl2;

    .line 536
    .line 537
    iget-object v4, v4, Lsl2;->g:Ljava/lang/Long;

    .line 538
    .line 539
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 543
    .line 544
    .line 545
    move-result-wide v4

    .line 546
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-static {v1, v4, v5}, Lc50;->a(IJ)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    goto/16 :goto_3

    .line 553
    .line 554
    :sswitch_8
    const-string v0, "vendorLegitimateInterests"

    .line 555
    .line 556
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 557
    .line 558
    .line 559
    move-result v0

    .line 560
    if-eqz v0, :cond_e

    .line 561
    .line 562
    move-object/from16 v4, v39

    .line 563
    .line 564
    check-cast v4, Lxl2;

    .line 565
    .line 566
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 567
    .line 568
    move-object/from16 v4, v39

    .line 569
    .line 570
    check-cast v4, Lxl2;

    .line 571
    .line 572
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 573
    .line 574
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    const/4 v0, 0x0

    .line 578
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    move-object v9, v1

    .line 583
    move-object/from16 v6, v30

    .line 584
    .line 585
    move-object/from16 v8, v31

    .line 586
    .line 587
    goto/16 :goto_5

    .line 588
    .line 589
    :sswitch_9
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    if-eqz v1, :cond_e

    .line 594
    .line 595
    goto/16 :goto_f

    .line 596
    .line 597
    :sswitch_a
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    if-eqz v0, :cond_e

    .line 602
    .line 603
    goto/16 :goto_e

    .line 604
    .line 605
    :sswitch_b
    const-string v0, "publisherConsents"

    .line 606
    .line 607
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-eqz v0, :cond_e

    .line 612
    .line 613
    move-object/from16 v4, v39

    .line 614
    .line 615
    check-cast v4, Lxl2;

    .line 616
    .line 617
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 618
    .line 619
    move-object/from16 v4, v39

    .line 620
    .line 621
    check-cast v4, Lxl2;

    .line 622
    .line 623
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 624
    .line 625
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    const/4 v0, 0x0

    .line 629
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    move-object v13, v1

    .line 634
    move-object/from16 v6, v30

    .line 635
    .line 636
    move-object/from16 v8, v31

    .line 637
    .line 638
    move-object/from16 v9, v32

    .line 639
    .line 640
    move-object/from16 v10, v33

    .line 641
    .line 642
    move-object/from16 v11, v34

    .line 643
    .line 644
    move-object/from16 v12, v35

    .line 645
    .line 646
    goto/16 :goto_9

    .line 647
    .line 648
    :sswitch_c
    const-string v0, "purposeLegitimateInterests"

    .line 649
    .line 650
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v0

    .line 654
    if-eqz v0, :cond_e

    .line 655
    .line 656
    move-object/from16 v4, v39

    .line 657
    .line 658
    check-cast v4, Lxl2;

    .line 659
    .line 660
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 661
    .line 662
    move-object/from16 v4, v39

    .line 663
    .line 664
    check-cast v4, Lxl2;

    .line 665
    .line 666
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 667
    .line 668
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 669
    .line 670
    .line 671
    const/4 v0, 0x0

    .line 672
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    move-object v11, v1

    .line 677
    move-object/from16 v6, v30

    .line 678
    .line 679
    move-object/from16 v8, v31

    .line 680
    .line 681
    move-object/from16 v9, v32

    .line 682
    .line 683
    move-object/from16 v10, v33

    .line 684
    .line 685
    goto/16 :goto_7

    .line 686
    .line 687
    :sswitch_d
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v0

    .line 691
    if-eqz v0, :cond_e

    .line 692
    .line 693
    goto :goto_e

    .line 694
    :sswitch_e
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    if-eqz v0, :cond_e

    .line 699
    .line 700
    goto/16 :goto_10

    .line 701
    .line 702
    :sswitch_f
    const-string v0, "publisherRestrictions"

    .line 703
    .line 704
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    if-eqz v0, :cond_e

    .line 709
    .line 710
    move-object/from16 v4, v39

    .line 711
    .line 712
    check-cast v4, Lul2;

    .line 713
    .line 714
    sget-object v0, Lrz1;->Companion:Lqz1;

    .line 715
    .line 716
    move-object/from16 v4, v39

    .line 717
    .line 718
    check-cast v4, Lul2;

    .line 719
    .line 720
    iget-object v1, v4, Lul2;->g:Lxz1;

    .line 721
    .line 722
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    invoke-static {v1}, Lqz1;->a(Lxz1;)Ljava/util/LinkedHashMap;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    move-object/from16 v25, v0

    .line 730
    .line 731
    goto/16 :goto_3

    .line 732
    .line 733
    :sswitch_10
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-eqz v0, :cond_e

    .line 738
    .line 739
    goto/16 :goto_11

    .line 740
    .line 741
    :sswitch_11
    invoke-virtual {v3, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-eqz v0, :cond_e

    .line 746
    .line 747
    :goto_e
    move-object/from16 v4, v39

    .line 748
    .line 749
    check-cast v4, Lrl2;

    .line 750
    .line 751
    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 752
    .line 753
    .line 754
    move-result v0

    .line 755
    if-eqz v0, :cond_6

    .line 756
    .line 757
    sget-object v0, Lek;->Companion:Ldk;

    .line 758
    .line 759
    move-object/from16 v4, v39

    .line 760
    .line 761
    check-cast v4, Lrl2;

    .line 762
    .line 763
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    :cond_6
    invoke-virtual {v3, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 767
    .line 768
    .line 769
    move-result v0

    .line 770
    if-eqz v0, :cond_7

    .line 771
    .line 772
    sget-object v0, Lek;->Companion:Ldk;

    .line 773
    .line 774
    move-object/from16 v4, v39

    .line 775
    .line 776
    check-cast v4, Lrl2;

    .line 777
    .line 778
    iget-boolean v1, v4, Lrl2;->g:Z

    .line 779
    .line 780
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    invoke-static {v1}, Ldk;->a(Z)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 788
    .line 789
    .line 790
    move-result v0

    .line 791
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 792
    .line 793
    .line 794
    move-result-object v22

    .line 795
    :cond_7
    invoke-virtual {v3, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    if-eqz v0, :cond_4

    .line 800
    .line 801
    sget-object v0, Lek;->Companion:Ldk;

    .line 802
    .line 803
    move-object/from16 v4, v39

    .line 804
    .line 805
    check-cast v4, Lrl2;

    .line 806
    .line 807
    iget-boolean v1, v4, Lrl2;->g:Z

    .line 808
    .line 809
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 810
    .line 811
    .line 812
    invoke-static {v1}, Ldk;->a(Z)Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v0

    .line 816
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 821
    .line 822
    .line 823
    move-result-object v0

    .line 824
    move-object/from16 v21, v0

    .line 825
    .line 826
    goto/16 :goto_3

    .line 827
    .line 828
    :sswitch_12
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    move-result v0

    .line 832
    if-eqz v0, :cond_e

    .line 833
    .line 834
    goto/16 :goto_11

    .line 835
    .line 836
    :sswitch_13
    const-string v0, "publisherCustomConsents"

    .line 837
    .line 838
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 839
    .line 840
    .line 841
    move-result v0

    .line 842
    if-eqz v0, :cond_e

    .line 843
    .line 844
    move-object/from16 v4, v39

    .line 845
    .line 846
    check-cast v4, Lxl2;

    .line 847
    .line 848
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 849
    .line 850
    move-object/from16 v4, v39

    .line 851
    .line 852
    check-cast v4, Lxl2;

    .line 853
    .line 854
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    const/4 v0, 0x0

    .line 860
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 861
    .line 862
    .line 863
    move-result-object v1

    .line 864
    move-object v15, v1

    .line 865
    move-object/from16 v6, v30

    .line 866
    .line 867
    move-object/from16 v8, v31

    .line 868
    .line 869
    move-object/from16 v9, v32

    .line 870
    .line 871
    move-object/from16 v10, v33

    .line 872
    .line 873
    move-object/from16 v11, v34

    .line 874
    .line 875
    move-object/from16 v12, v35

    .line 876
    .line 877
    move-object/from16 v13, v36

    .line 878
    .line 879
    move-object/from16 v14, v37

    .line 880
    .line 881
    goto/16 :goto_b

    .line 882
    .line 883
    :sswitch_14
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v1

    .line 887
    if-eqz v1, :cond_e

    .line 888
    .line 889
    :goto_f
    move-object/from16 v4, v39

    .line 890
    .line 891
    check-cast v4, Lvl2;

    .line 892
    .line 893
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v0

    .line 897
    if-eqz v0, :cond_8

    .line 898
    .line 899
    move-object/from16 v4, v39

    .line 900
    .line 901
    check-cast v4, Lvl2;

    .line 902
    .line 903
    :cond_8
    invoke-virtual {v3, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 904
    .line 905
    .line 906
    move-result v0

    .line 907
    if-eqz v0, :cond_4

    .line 908
    .line 909
    move-object/from16 v4, v39

    .line 910
    .line 911
    check-cast v4, Lvl2;

    .line 912
    .line 913
    iget-object v0, v4, Lvl2;->g:Ljava/lang/String;

    .line 914
    .line 915
    move-object v6, v0

    .line 916
    goto/16 :goto_4

    .line 917
    .line 918
    :sswitch_15
    const-string v0, "purposeConsents"

    .line 919
    .line 920
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    if-eqz v0, :cond_e

    .line 925
    .line 926
    move-object/from16 v4, v39

    .line 927
    .line 928
    check-cast v4, Lxl2;

    .line 929
    .line 930
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 931
    .line 932
    move-object/from16 v4, v39

    .line 933
    .line 934
    check-cast v4, Lxl2;

    .line 935
    .line 936
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 937
    .line 938
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    const/4 v0, 0x0

    .line 942
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v1

    .line 946
    move-object v10, v1

    .line 947
    move-object/from16 v6, v30

    .line 948
    .line 949
    move-object/from16 v8, v31

    .line 950
    .line 951
    move-object/from16 v9, v32

    .line 952
    .line 953
    goto/16 :goto_6

    .line 954
    .line 955
    :sswitch_16
    const-string v0, "segmentType"

    .line 956
    .line 957
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 958
    .line 959
    .line 960
    move-result v0

    .line 961
    if-eqz v0, :cond_e

    .line 962
    .line 963
    move-object/from16 v4, v39

    .line 964
    .line 965
    check-cast v4, Lwl2;

    .line 966
    .line 967
    sget-object v0, Lvy0;->Companion:Luy0;

    .line 968
    .line 969
    move-object/from16 v4, v39

    .line 970
    .line 971
    check-cast v4, Lwl2;

    .line 972
    .line 973
    iget-object v4, v4, Lwl2;->g:Luh2;

    .line 974
    .line 975
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 976
    .line 977
    .line 978
    invoke-static {v4, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 979
    .line 980
    .line 981
    goto/16 :goto_3

    .line 982
    .line 983
    :sswitch_17
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result v0

    .line 987
    if-eqz v0, :cond_e

    .line 988
    .line 989
    goto :goto_11

    .line 990
    :sswitch_18
    const-string v0, "numCustomPurposes"

    .line 991
    .line 992
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    if-eqz v0, :cond_e

    .line 997
    .line 998
    :goto_10
    move-object/from16 v4, v39

    .line 999
    .line 1000
    check-cast v4, Ltl2;

    .line 1001
    .line 1002
    invoke-virtual {v3, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1003
    .line 1004
    .line 1005
    move-result v0

    .line 1006
    if-eqz v0, :cond_9

    .line 1007
    .line 1008
    move-object/from16 v4, v39

    .line 1009
    .line 1010
    check-cast v4, Ltl2;

    .line 1011
    .line 1012
    goto/16 :goto_3

    .line 1013
    .line 1014
    :cond_9
    sget-object v0, Lvy0;->Companion:Luy0;

    .line 1015
    .line 1016
    new-instance v4, Luh2;

    .line 1017
    .line 1018
    move-object/from16 v5, v39

    .line 1019
    .line 1020
    check-cast v5, Ltl2;

    .line 1021
    .line 1022
    iget v5, v5, Ltl2;->g:I

    .line 1023
    .line 1024
    invoke-direct {v4, v5}, Luh2;-><init>(I)V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    invoke-static {v4, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    goto/16 :goto_3

    .line 1034
    .line 1035
    :sswitch_19
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    move-result v0

    .line 1039
    if-eqz v0, :cond_e

    .line 1040
    .line 1041
    :goto_11
    move-object/from16 v4, v39

    .line 1042
    .line 1043
    check-cast v4, Lwl2;

    .line 1044
    .line 1045
    move-object/from16 v4, v39

    .line 1046
    .line 1047
    check-cast v4, Lwl2;

    .line 1048
    .line 1049
    iget-object v0, v4, Lwl2;->g:Luh2;

    .line 1050
    .line 1051
    invoke-virtual {v3, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result v4

    .line 1055
    if-eqz v4, :cond_a

    .line 1056
    .line 1057
    iget v4, v0, Luh2;->a:I

    .line 1058
    .line 1059
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v18

    .line 1063
    :cond_a
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1064
    .line 1065
    .line 1066
    move-result v4

    .line 1067
    if-eqz v4, :cond_b

    .line 1068
    .line 1069
    iget v4, v0, Luh2;->a:I

    .line 1070
    .line 1071
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v19

    .line 1075
    :cond_b
    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v4

    .line 1079
    if-eqz v4, :cond_c

    .line 1080
    .line 1081
    sget-object v4, Lvy0;->Companion:Luy0;

    .line 1082
    .line 1083
    new-instance v5, Luh2;

    .line 1084
    .line 1085
    iget v6, v0, Luh2;->a:I

    .line 1086
    .line 1087
    invoke-direct {v5, v6}, Luh2;-><init>(I)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1091
    .line 1092
    .line 1093
    invoke-static {v5, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    :cond_c
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v4

    .line 1100
    if-eqz v4, :cond_d

    .line 1101
    .line 1102
    sget-object v4, Lvy0;->Companion:Luy0;

    .line 1103
    .line 1104
    new-instance v5, Luh2;

    .line 1105
    .line 1106
    iget v6, v0, Luh2;->a:I

    .line 1107
    .line 1108
    invoke-direct {v5, v6}, Luh2;-><init>(I)V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1112
    .line 1113
    .line 1114
    invoke-static {v5, v1}, Luy0;->b(Luh2;I)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    :cond_d
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v1

    .line 1121
    if-eqz v1, :cond_4

    .line 1122
    .line 1123
    iget v0, v0, Luh2;->a:I

    .line 1124
    .line 1125
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v0

    .line 1129
    move-object/from16 v20, v0

    .line 1130
    .line 1131
    goto/16 :goto_3

    .line 1132
    .line 1133
    :sswitch_1a
    const-string v0, "vendorConsents"

    .line 1134
    .line 1135
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1136
    .line 1137
    .line 1138
    move-result v0

    .line 1139
    if-eqz v0, :cond_e

    .line 1140
    .line 1141
    move-object/from16 v4, v39

    .line 1142
    .line 1143
    check-cast v4, Lxl2;

    .line 1144
    .line 1145
    sget-object v0, Ljj0;->Companion:Lij0;

    .line 1146
    .line 1147
    move-object/from16 v4, v39

    .line 1148
    .line 1149
    check-cast v4, Lxl2;

    .line 1150
    .line 1151
    iget-object v1, v4, Lxl2;->g:Lu13;

    .line 1152
    .line 1153
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1154
    .line 1155
    .line 1156
    const/4 v0, 0x0

    .line 1157
    invoke-static {v1, v0}, Lij0;->b(Lu13;Ljava/lang/Integer;)Ljava/lang/String;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v1

    .line 1161
    move-object v8, v1

    .line 1162
    move-object/from16 v6, v30

    .line 1163
    .line 1164
    move-object/from16 v9, v32

    .line 1165
    .line 1166
    move-object/from16 v10, v33

    .line 1167
    .line 1168
    move-object/from16 v11, v34

    .line 1169
    .line 1170
    move-object/from16 v12, v35

    .line 1171
    .line 1172
    move-object/from16 v13, v36

    .line 1173
    .line 1174
    move-object/from16 v14, v37

    .line 1175
    .line 1176
    move-object/from16 v15, v38

    .line 1177
    .line 1178
    :goto_12
    move-object/from16 v0, p0

    .line 1179
    .line 1180
    move-object/from16 v4, v26

    .line 1181
    .line 1182
    move-object/from16 v3, v27

    .line 1183
    .line 1184
    move-object/from16 v1, v28

    .line 1185
    .line 1186
    move-object/from16 v5, v40

    .line 1187
    .line 1188
    move-object/from16 v7, v41

    .line 1189
    .line 1190
    goto/16 :goto_1

    .line 1191
    .line 1192
    :cond_e
    :goto_13
    new-instance v0, Lf0;

    .line 1193
    .line 1194
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1195
    .line 1196
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1200
    .line 1201
    .line 1202
    move-object/from16 v4, v41

    .line 1203
    .line 1204
    :try_start_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1205
    .line 1206
    .line 1207
    move-object/from16 v5, v40

    .line 1208
    .line 1209
    :try_start_3
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1213
    .line 1214
    .line 1215
    const-string v6, ", value: "

    .line 1216
    .line 1217
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1218
    .line 1219
    .line 1220
    move-object/from16 v6, v39

    .line 1221
    .line 1222
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v1

    .line 1229
    const/4 v6, 0x3

    .line 1230
    invoke-direct {v0, v1, v6}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1231
    .line 1232
    .line 1233
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1234
    :catchall_1
    move-exception v0

    .line 1235
    goto :goto_14

    .line 1236
    :catchall_2
    move-exception v0

    .line 1237
    move-object/from16 v5, v40

    .line 1238
    .line 1239
    goto :goto_14

    .line 1240
    :catchall_3
    move-exception v0

    .line 1241
    move-object v4, v7

    .line 1242
    :goto_14
    new-instance v1, Lf0;

    .line 1243
    .line 1244
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1249
    .line 1250
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1260
    .line 1261
    .line 1262
    const-string v2, ": "

    .line 1263
    .line 1264
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    const/4 v6, 0x3

    .line 1275
    invoke-direct {v1, v0, v6}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1276
    .line 1277
    .line 1278
    throw v1

    .line 1279
    :cond_f
    move-object/from16 v30, v6

    .line 1280
    .line 1281
    move-object/from16 v31, v8

    .line 1282
    .line 1283
    move-object/from16 v32, v9

    .line 1284
    .line 1285
    move-object/from16 v33, v10

    .line 1286
    .line 1287
    move-object/from16 v34, v11

    .line 1288
    .line 1289
    move-object/from16 v35, v12

    .line 1290
    .line 1291
    move-object/from16 v36, v13

    .line 1292
    .line 1293
    move-object/from16 v37, v14

    .line 1294
    .line 1295
    move-object/from16 v38, v15

    .line 1296
    .line 1297
    :cond_10
    move-object/from16 v28, v1

    .line 1298
    .line 1299
    move-object/from16 v26, v4

    .line 1300
    .line 1301
    const/4 v0, 0x0

    .line 1302
    move-object/from16 v3, v25

    .line 1303
    .line 1304
    move-object/from16 v0, p0

    .line 1305
    .line 1306
    move/from16 v2, v24

    .line 1307
    .line 1308
    move-object/from16 v4, v26

    .line 1309
    .line 1310
    move-object/from16 v1, v28

    .line 1311
    .line 1312
    goto/16 :goto_0

    .line 1313
    .line 1314
    :cond_11
    move/from16 v24, v2

    .line 1315
    .line 1316
    move-object/from16 v25, v3

    .line 1317
    .line 1318
    invoke-static/range {v24 .. v24}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v0

    .line 1322
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1323
    .line 1324
    .line 1325
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 1326
    .line 1327
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1328
    .line 1329
    .line 1330
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1331
    .line 1332
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 1333
    .line 1334
    .line 1335
    move-object/from16 v5, v18

    .line 1336
    .line 1337
    if-eqz v5, :cond_12

    .line 1338
    .line 1339
    sget-object v3, Lbv0;->Companion:Lav0;

    .line 1340
    .line 1341
    const-string v3, "IABTCF_CmpSdkID"

    .line 1342
    .line 1343
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1344
    .line 1345
    .line 1346
    :cond_12
    move-object/from16 v5, v19

    .line 1347
    .line 1348
    if-eqz v5, :cond_13

    .line 1349
    .line 1350
    sget-object v3, Lbv0;->Companion:Lav0;

    .line 1351
    .line 1352
    const-string v3, "IABTCF_CmpSdkVersion"

    .line 1353
    .line 1354
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    :cond_13
    move-object/from16 v5, v20

    .line 1358
    .line 1359
    if-eqz v5, :cond_14

    .line 1360
    .line 1361
    sget-object v3, Lbv0;->Companion:Lav0;

    .line 1362
    .line 1363
    const-string v3, "IABTCF_PolicyVersion"

    .line 1364
    .line 1365
    invoke-interface {v2, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    :cond_14
    sget-object v3, Lbv0;->Companion:Lav0;

    .line 1369
    .line 1370
    const-string v3, "IABTCF_gdprApplies"

    .line 1371
    .line 1372
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1373
    .line 1374
    .line 1375
    move-object/from16 v5, v21

    .line 1376
    .line 1377
    if-eqz v5, :cond_15

    .line 1378
    .line 1379
    const-string v0, "IABTCF_PurposeOneTreatment"

    .line 1380
    .line 1381
    invoke-interface {v2, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    :cond_15
    const-string v0, "IABTCF_TCString"

    .line 1385
    .line 1386
    move-object/from16 v3, p1

    .line 1387
    .line 1388
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    const-string v0, "IABTCF_PublisherCC"

    .line 1392
    .line 1393
    invoke-interface {v1, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-object/from16 v5, v22

    .line 1397
    .line 1398
    if-eqz v5, :cond_16

    .line 1399
    .line 1400
    const-string v0, "IABTCF_UseNonStandardStacks"

    .line 1401
    .line 1402
    invoke-interface {v2, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    :cond_16
    const-string v0, "IABTCF_VendorConsents"

    .line 1406
    .line 1407
    invoke-interface {v1, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1408
    .line 1409
    .line 1410
    const-string v0, "IABTCF_VendorLegitimateInterests"

    .line 1411
    .line 1412
    invoke-interface {v1, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1413
    .line 1414
    .line 1415
    const-string v0, "IABTCF_PurposeConsents"

    .line 1416
    .line 1417
    invoke-interface {v1, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    const-string v0, "IABTCF_PurposeLegitimateInterests"

    .line 1421
    .line 1422
    invoke-interface {v1, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    const-string v0, "IABTCF_SpecialFeaturesOptIns"

    .line 1426
    .line 1427
    invoke-interface {v1, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1428
    .line 1429
    .line 1430
    const-string v0, "IABTCF_PublisherConsent"

    .line 1431
    .line 1432
    invoke-interface {v1, v0, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1433
    .line 1434
    .line 1435
    const-string v0, "IABTCF_PublisherLegitimateInterests"

    .line 1436
    .line 1437
    invoke-interface {v1, v0, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    const-string v0, "IABTCF_PublisherCustomPurposesConsents"

    .line 1441
    .line 1442
    invoke-interface {v1, v0, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    const-string v0, "IABTCF_PublisherCustomPurposesLegitimateInterests"

    .line 1446
    .line 1447
    move-object/from16 v8, v16

    .line 1448
    .line 1449
    invoke-interface {v1, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    const-string v0, "IABTCF_EnableAdvertiserConsentMode"

    .line 1453
    .line 1454
    const/4 v3, 0x1

    .line 1455
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v3

    .line 1459
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1460
    .line 1461
    .line 1462
    const-string v0, "IABTCF_DisclosedVendors"

    .line 1463
    .line 1464
    move-object/from16 v8, v17

    .line 1465
    .line 1466
    invoke-interface {v1, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1467
    .line 1468
    .line 1469
    invoke-interface/range {v25 .. v25}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v0

    .line 1473
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v0

    .line 1477
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1478
    .line 1479
    .line 1480
    move-result v3

    .line 1481
    if-eqz v3, :cond_17

    .line 1482
    .line 1483
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v3

    .line 1487
    check-cast v3, Ljava/util/Map$Entry;

    .line 1488
    .line 1489
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v4

    .line 1493
    check-cast v4, Ljava/lang/Number;

    .line 1494
    .line 1495
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 1496
    .line 1497
    .line 1498
    move-result v4

    .line 1499
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v3

    .line 1503
    check-cast v3, Ljava/lang/String;

    .line 1504
    .line 1505
    sget-object v5, Lbv0;->Companion:Lav0;

    .line 1506
    .line 1507
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1508
    .line 1509
    .line 1510
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1511
    .line 1512
    const-string v6, "IABTCF_PublisherRestrictions"

    .line 1513
    .line 1514
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1518
    .line 1519
    .line 1520
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1521
    .line 1522
    .line 1523
    move-result-object v4

    .line 1524
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1525
    .line 1526
    .line 1527
    goto :goto_15

    .line 1528
    :cond_17
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 1529
    .line 1530
    invoke-direct {v0, v2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 1531
    .line 1532
    .line 1533
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 1534
    .line 1535
    .line 1536
    move-object/from16 v1, p0

    .line 1537
    .line 1538
    iget-object v1, v1, Lqk2;->c:Lg80;

    .line 1539
    .line 1540
    check-cast v1, Lpz2;

    .line 1541
    .line 1542
    invoke-virtual {v1, v0}, Lpz2;->h(Ljava/util/Map;)V

    .line 1543
    .line 1544
    .line 1545
    return-void

    .line 1546
    :cond_18
    new-instance v0, Lf0;

    .line 1547
    .line 1548
    const-string v1, "Error encoding TCF String. Invalid version: "

    .line 1549
    .line 1550
    invoke-static {v5, v1}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v1

    .line 1554
    const/4 v6, 0x3

    .line 1555
    invoke-direct {v0, v1, v6}, Lf0;-><init>(Ljava/lang/String;I)V

    .line 1556
    .line 1557
    .line 1558
    throw v0

    .line 1559
    :sswitch_data_0
    .sparse-switch
        -0x7e1b7aff -> :sswitch_1a
        -0x7bc4a74e -> :sswitch_19
        -0x78169534 -> :sswitch_18
        -0x65f8ccba -> :sswitch_17
        -0x38cc2ef3 -> :sswitch_16
        -0x34705929 -> :sswitch_15
        -0x2c2610f9 -> :sswitch_14
        -0x1a5888ba -> :sswitch_13
        -0x8ac8eda -> :sswitch_12
        -0x700ff83 -> :sswitch_11
        0x5a65101 -> :sswitch_10
        0xc304243 -> :sswitch_f
        0x14f51cd8 -> :sswitch_e
        0x1a393d6e -> :sswitch_d
        0x1de6d536 -> :sswitch_c
        0x206d8db5 -> :sswitch_b
        0x21df50f0 -> :sswitch_a
        0x2896fd92 -> :sswitch_9
        0x3ba058cc -> :sswitch_8
        0x3d4e7ee8 -> :sswitch_7
        0x4bd3b967 -> :sswitch_6
        0x538a9798 -> :sswitch_5
        0x6254f145 -> :sswitch_4
        0x66a71bf2 -> :sswitch_3
        0x707002b8 -> :sswitch_2
        0x762fdf8f -> :sswitch_1
        0x76f69efd -> :sswitch_0
    .end sparse-switch
.end method

.method public final y(Lwk2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqk2;->m:Lql2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Luh2;

    .line 6
    .line 7
    iget p1, p1, Lwk2;->a:I

    .line 8
    .line 9
    invoke-direct {v1, p1}, Luh2;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lql2;->e(Luh2;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p1, p0, Lqk2;->m:Lql2;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lh50;

    .line 20
    .line 21
    invoke-direct {v0}, Lh50;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lh50;->b()Lh50;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lh50;->c()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, p1, Lql2;->p:Ljava/lang/Long;

    .line 37
    .line 38
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p1, Lql2;->o:Ljava/lang/Long;

    .line 43
    .line 44
    :cond_1
    invoke-virtual {p0}, Lqk2;->s()V

    .line 45
    .line 46
    .line 47
    new-instance p1, Lmj;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    const/4 v1, 0x7

    .line 51
    invoke-direct {p1, p0, v0, v1}, Lmj;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lqk2;->h:Lx80;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, Lok2;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-direct {v0, p0, v1}, Lok2;-><init>(Lqk2;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lec;->H(Lkotlin/jvm/functions/Function1;)V

    .line 67
    .line 68
    .line 69
    new-instance v0, Lok2;

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-direct {v0, p0, v1}, Lok2;-><init>(Lqk2;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lec;->G(Lkotlin/jvm/functions/Function1;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
