.class public final Lv3;
.super Len1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld7;La21;Li03;Lse0;Lfn1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lv3;->d:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-direct {p0, p3, p4, p5}, Len1;-><init>(Li03;Lse0;Lfn1;)V

    .line 33
    iput-object p1, p0, Lv3;->e:Ljava/lang/Object;

    .line 34
    const-string p1, "en"

    iput-object p1, p0, Lv3;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr3;La21;Li03;Lse0;Lfn1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lv3;->d:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-direct {p0, p3, p4, p5}, Len1;-><init>(Li03;Lse0;Lfn1;)V

    .line 27
    iput-object p1, p0, Lv3;->e:Ljava/lang/Object;

    .line 28
    iput-object p2, p0, Lv3;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr3;La21;Li03;Lse0;Lfn1;B)V
    .locals 0

    .line 1
    const/4 p6, 0x2

    .line 2
    iput p6, p0, Lv3;->d:I

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
    invoke-direct {p0, p3, p4, p5}, Len1;-><init>(Li03;Lse0;Lfn1;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lv3;->e:Ljava/lang/Object;

    .line 20
    .line 21
    const-string p1, "en"

    .line 22
    .line 23
    iput-object p1, p0, Lv3;->f:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lr3;La21;Li03;Lse0;Lfn1;C)V
    .locals 0

    const/4 p6, 0x3

    iput p6, p0, Lv3;->d:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    invoke-direct {p0, p3, p4, p5}, Len1;-><init>(Li03;Lse0;Lfn1;)V

    .line 30
    iput-object p1, p0, Lv3;->e:Ljava/lang/Object;

    .line 31
    const-string p1, "en"

    iput-object p1, p0, Lv3;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lv3;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lv3;->f:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ljava/lang/String;

    .line 9
    .line 10
    const-string v0, "translations-"

    .line 11
    .line 12
    invoke-static {v0, p0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    iget-object p0, p0, Lv3;->f:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Ljava/lang/String;

    .line 20
    .line 21
    const-string v0, "tcf-declarations-"

    .line 22
    .line 23
    invoke-static {v0, p0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    iget-object p0, p0, Lv3;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/lang/String;

    .line 31
    .line 32
    const-string v0, "aggregator-"

    .line 33
    .line 34
    invoke-static {v0, p0}, Len;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_2
    const-string p0, "acp"

    .line 40
    .line 41
    return-object p0

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lxk2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lxk2;

    .line 7
    .line 8
    iget v1, v0, Lxk2;->d:I

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
    iput v1, v0, Lxk2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxk2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lxk2;-><init>(Lv3;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lxk2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lxk2;->d:I

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
    iget-object p0, v0, Lxk2;->a:Lv3;

    .line 38
    .line 39
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lv3;->f:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance p2, Lv40;

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    invoke-direct {p2, p0, p1, v3, v2}, Lv40;-><init>(Len1;Ljava/lang/String;Lc10;I)V

    .line 58
    .line 59
    .line 60
    iput-object p0, v0, Lxk2;->a:Lv3;

    .line 61
    .line 62
    iput v4, v0, Lxk2;->d:I

    .line 63
    .line 64
    const/4 p1, 0x0

    .line 65
    invoke-virtual {p0, p1, p2, v0}, Len1;->h(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    if-ne p2, v1, :cond_3

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/String;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    sget-object p0, Lb21;->a:Lr11;

    .line 78
    .line 79
    iget-object p1, p0, Lb11;->b:Lb5;

    .line 80
    .line 81
    const-class v0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;

    .line 82
    .line 83
    invoke-static {v0}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {p1, v0}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p2, p1}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Lcom/usercentrics/tcf/core/model/gvl/Declarations;

    .line 96
    .line 97
    return-object p0
.end method

.method public j(Ljava/lang/String;Ljava/util/List;ZLd10;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Le7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Le7;

    .line 7
    .line 8
    iget v1, v0, Le7;->d:I

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
    iput v1, v0, Le7;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Le7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Le7;-><init>(Lv3;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Le7;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Le7;->d:I

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
    iget-object p0, v0, Le7;->a:Lv3;

    .line 37
    .line 38
    invoke-static {p4}, Lpg3;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p4}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lv3;->f:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v4, Lf7;

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x0

    .line 58
    move-object v5, p0

    .line 59
    move-object v6, p1

    .line 60
    move-object v7, p2

    .line 61
    invoke-direct/range {v4 .. v9}, Lf7;-><init>(Len1;Ljava/lang/String;Ljava/lang/Object;Lc10;I)V

    .line 62
    .line 63
    .line 64
    iput-object v5, v0, Le7;->a:Lv3;

    .line 65
    .line 66
    iput v3, v0, Le7;->d:I

    .line 67
    .line 68
    invoke-virtual {v5, p3, v4, v0}, Len1;->h(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    if-ne p4, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    move-object p0, v5

    .line 76
    :goto_1
    check-cast p4, Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object p0, Lb21;->a:Lr11;

    .line 82
    .line 83
    iget-object p1, p0, Lb11;->b:Lb5;

    .line 84
    .line 85
    const-class p2, Lcom/usercentrics/sdk/services/api/NewServiceTemplates;

    .line 86
    .line 87
    invoke-static {p2}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p1, p2}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0, p4, p1}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lcom/usercentrics/sdk/services/api/NewServiceTemplates;

    .line 100
    .line 101
    iget-object p0, p0, Lcom/usercentrics/sdk/services/api/NewServiceTemplates;->a:Ljava/util/List;

    .line 102
    .line 103
    return-object p0
.end method

.method public k(Ljava/lang/String;ZLd10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lqr2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lqr2;

    .line 7
    .line 8
    iget v1, v0, Lqr2;->d:I

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
    iput v1, v0, Lqr2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lqr2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lqr2;-><init>(Lv3;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lqr2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lqr2;->d:I

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
    iget-object p0, v0, Lqr2;->a:Lv3;

    .line 38
    .line 39
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v3

    .line 49
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lv3;->f:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance p3, Lv40;

    .line 55
    .line 56
    const/4 v2, 0x3

    .line 57
    invoke-direct {p3, p0, p1, v3, v2}, Lv40;-><init>(Len1;Ljava/lang/String;Lc10;I)V

    .line 58
    .line 59
    .line 60
    iput-object p0, v0, Lqr2;->a:Lv3;

    .line 61
    .line 62
    iput v4, v0, Lqr2;->d:I

    .line 63
    .line 64
    invoke-virtual {p0, p2, p3, v0}, Len1;->h(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    if-ne p3, v1, :cond_3

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    sget-object p0, Lb21;->a:Lr11;

    .line 77
    .line 78
    iget-object p1, p0, Lb11;->b:Lb5;

    .line 79
    .line 80
    const-class p2, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 81
    .line 82
    invoke-static {p2}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-static {p1, p2}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0, p3, p1}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 95
    .line 96
    return-object p0
.end method

.method public l(Ljava/util/List;Ljava/util/List;Ld10;)Ljava/io/Serializable;
    .locals 8

    .line 1
    instance-of v0, p3, Lt3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lt3;

    .line 7
    .line 8
    iget v1, v0, Lt3;->f:I

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
    iput v1, v0, Lt3;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lt3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lt3;-><init>(Lv3;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lt3;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lt3;->f:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v5, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, Lt3;->c:Ljava/lang/Object;

    .line 39
    .line 40
    move-object p2, p0

    .line 41
    check-cast p2, Ljava/util/List;

    .line 42
    .line 43
    iget-object p1, v0, Lt3;->b:Ljava/util/List;

    .line 44
    .line 45
    iget-object p0, v0, Lt3;->a:Lv3;

    .line 46
    .line 47
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v4

    .line 57
    :cond_2
    invoke-static {p3}, Lpg3;->A(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p3, Lu3;

    .line 61
    .line 62
    invoke-direct {p3, p0, v4, v3}, Lu3;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 63
    .line 64
    .line 65
    iput-object p0, v0, Lt3;->a:Lv3;

    .line 66
    .line 67
    iput-object p1, v0, Lt3;->b:Ljava/util/List;

    .line 68
    .line 69
    iput-object p2, v0, Lt3;->c:Ljava/lang/Object;

    .line 70
    .line 71
    iput v5, v0, Lt3;->f:I

    .line 72
    .line 73
    invoke-virtual {p0, v3, p3, v0}, Len1;->g(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    if-ne p3, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    :goto_1
    check-cast p3, Lzu0;

    .line 81
    .line 82
    iget-object p0, p0, Lv3;->f:Ljava/lang/Object;

    .line 83
    .line 84
    iget-object p0, p3, Lzu0;->b:Ljava/lang/String;

    .line 85
    .line 86
    sget-object p3, Lb21;->a:Lr11;

    .line 87
    .line 88
    iget-object v0, p3, Lb11;->b:Lb5;

    .line 89
    .line 90
    const-class v1, Lcom/usercentrics/sdk/acm/data/AdditionalConsentModeListResponse;

    .line 91
    .line 92
    invoke-static {v1}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v0, v1}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p3, p0, v0}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Lcom/usercentrics/sdk/acm/data/AdditionalConsentModeListResponse;

    .line 105
    .line 106
    iget-object p0, p0, Lcom/usercentrics/sdk/acm/data/AdditionalConsentModeListResponse;->a:Ljava/util/Map;

    .line 107
    .line 108
    new-instance p3, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    check-cast v0, Ljava/util/Map$Entry;

    .line 132
    .line 133
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_5

    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_5
    new-instance v2, Lcom/usercentrics/sdk/AdTechProvider;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    check-cast v7, Ljava/util/List;

    .line 163
    .line 164
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    check-cast v7, Ljava/lang/String;

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, Ljava/lang/String;

    .line 181
    .line 182
    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    invoke-direct {v2, v6, v7, v0, v1}, Lcom/usercentrics/sdk/AdTechProvider;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_6
    :goto_3
    move-object v2, v4

    .line 191
    :goto_4
    if-eqz v2, :cond_4

    .line 192
    .line 193
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_7
    return-object p3
.end method
