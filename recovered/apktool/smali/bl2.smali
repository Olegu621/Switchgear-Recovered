.class public final Lbl2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lal2;

.field public static final i:Lej0;


# instance fields
.field public final a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

.field public final b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

.field public final c:Lur3;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Z

.field public final h:Lhk2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lal2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbl2;->Companion:Lal2;

    .line 7
    .line 8
    sget-object v0, Lej0;->a:Lej0;

    .line 9
    .line 10
    sput-object v0, Lbl2;->i:Lej0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;Lur3;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lbl2;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 14
    .line 15
    iput-object p2, p0, Lbl2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;

    .line 16
    .line 17
    iput-object p3, p0, Lbl2;->c:Lur3;

    .line 18
    .line 19
    iput-object p4, p0, Lbl2;->d:Ljava/util/List;

    .line 20
    .line 21
    iput-object p5, p0, Lbl2;->e:Ljava/util/List;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-boolean p2, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->y:Z

    .line 29
    .line 30
    xor-int/lit8 p2, p2, 0x1

    .line 31
    .line 32
    iput-boolean p2, p0, Lbl2;->f:Z

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-boolean p1, p1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 38
    .line 39
    iput-boolean p1, p0, Lbl2;->g:Z

    .line 40
    .line 41
    new-instance p1, Lf8;

    .line 42
    .line 43
    const/16 p2, 0xa

    .line 44
    .line 45
    invoke-direct {p1, p0, p2}, Lf8;-><init>(Ljava/lang/Object;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lr51;->b(Lkotlin/jvm/functions/Function0;)Lhk2;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lbl2;->h:Lhk2;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lbl2;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->M:Ljava/lang/Boolean;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-boolean p0, p0, Lbl2;->f:Z

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    goto :goto_3

    .line 17
    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    iget-object p0, v0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 27
    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->L:Ljava/lang/Boolean;

    .line 31
    .line 32
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    goto :goto_1

    .line 39
    :cond_3
    move p0, v2

    .line 40
    :goto_1
    if-eqz p0, :cond_4

    .line 41
    .line 42
    :goto_2
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_4
    :goto_3
    return v2
.end method

.method public final b(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)Ldu1;
    .locals 5

    .line 1
    invoke-static {p2, p3}, Lkotlin/collections/CollectionsKt;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcl2;

    .line 26
    .line 27
    iget-boolean v2, v0, Lcl2;->d:Z

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v2, p0, Lbl2;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 33
    .line 34
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-boolean v2, v2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->V:Z

    .line 40
    .line 41
    if-eqz v2, :cond_1

    .line 42
    .line 43
    new-instance v2, Lqv1;

    .line 44
    .line 45
    iget-object v3, v0, Lcl2;->h:Ljava/lang/String;

    .line 46
    .line 47
    const-string v4, ""

    .line 48
    .line 49
    invoke-direct {v2, v4, v4, v3}, Lqv1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move-object v2, v1

    .line 54
    :goto_1
    new-instance v3, Lcu1;

    .line 55
    .line 56
    invoke-direct {v3, v0, v2, v1}, Lcu1;-><init>(Lcl2;Lpg3;Ljava/util/ArrayList;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    new-instance p0, Ldu1;

    .line 64
    .line 65
    invoke-direct {p0, p1, p3, v1}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;Lfu1;)V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public final c(Leg2;Ljava/util/List;Ljava/util/ArrayList;)Lcl2;
    .locals 6

    .line 1
    new-instance v0, Lcl2;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lcl2;

    .line 24
    .line 25
    iget-boolean v4, v3, Lcl2;->d:Z

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    iget v3, v3, Lcl2;->b:I

    .line 30
    .line 31
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-interface {p2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    .line 46
    .line 47
    const/16 p3, 0xa

    .line 48
    .line 49
    invoke-static {v1, p3}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lcl2;

    .line 71
    .line 72
    new-instance v2, Lpu1;

    .line 73
    .line 74
    iget-object v3, v1, Lcl2;->a:Ljava/lang/String;

    .line 75
    .line 76
    new-instance v4, Lvv1;

    .line 77
    .line 78
    iget-boolean v1, v1, Lcl2;->e:Z

    .line 79
    .line 80
    const/4 v5, 0x0

    .line 81
    invoke-direct {v4, v5, v1}, Lvv1;-><init>(ZZ)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v2, v3, v4}, Lpu1;-><init>(Ljava/lang/String;Lvv1;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    iget-boolean p0, p0, Lbl2;->f:Z

    .line 92
    .line 93
    invoke-direct {v0, p1, p0, p2}, Lcl2;-><init>(Leg2;ZLjava/util/ArrayList;)V

    .line 94
    .line 95
    .line 96
    return-object v0
.end method
