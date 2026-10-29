.class public final Lk51;
.super Len1;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic d:I

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld7;La21;Li03;Lse0;Lfn1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lk51;->d:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    invoke-direct {p0, p3, p4, p5}, Len1;-><init>(Li03;Lse0;Lfn1;)V

    .line 25
    iput-object p1, p0, Lk51;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr3;La21;Li03;Lse0;Lfn1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk51;->d:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    invoke-direct {p0, p3, p4, p5}, Len1;-><init>(Li03;Lse0;Lfn1;)V

    .line 23
    iput-object p1, p0, Lk51;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr3;La21;Li03;Lse0;Lfn1;B)V
    .locals 0

    .line 1
    const/4 p6, 0x2

    .line 2
    iput p6, p0, Lk51;->d:I

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
    iput-object p1, p0, Lk51;->e:Ljava/lang/Object;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lk51;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "tcf-vendorlist"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "ruleSet"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "languages"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;ZLd10;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p4, Lj51;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lj51;

    .line 7
    .line 8
    iget v1, v0, Lj51;->e:I

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
    iput v1, v0, Lj51;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lj51;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lj51;-><init>(Lk51;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lj51;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lj51;->e:I

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
    iget-boolean p3, v0, Lj51;->b:Z

    .line 37
    .line 38
    iget-object p0, v0, Lj51;->a:Lk51;

    .line 39
    .line 40
    invoke-static {p4}, Lpg3;->A(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    return-object p0

    .line 51
    :cond_2
    invoke-static {p4}, Lpg3;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance v4, Lf7;

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v9, 0x1

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
    iput-object v5, v0, Lj51;->a:Lk51;

    .line 65
    .line 66
    iput-boolean p3, v0, Lj51;->b:Z

    .line 67
    .line 68
    iput v3, v0, Lj51;->e:I

    .line 69
    .line 70
    invoke-virtual {v5, p3, v4, v0}, Len1;->g(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p4

    .line 74
    if-ne p4, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object p0, v5

    .line 78
    :goto_1
    check-cast p4, Lzu0;

    .line 79
    .line 80
    iget-object p1, p4, Lzu0;->b:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object p0, Lb21;->a:Lr11;

    .line 86
    .line 87
    iget-object p2, p0, Lb11;->b:Lb5;

    .line 88
    .line 89
    const-class v0, Lcom/usercentrics/sdk/v2/language/data/LanguageData;

    .line 90
    .line 91
    invoke-static {v0}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {p2, v0}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p0, p1, p2}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    check-cast p0, Lcom/usercentrics/sdk/v2/language/data/LanguageData;

    .line 104
    .line 105
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/language/data/LanguageData;->a:Ljava/util/List;

    .line 106
    .line 107
    new-instance p1, Lk91;

    .line 108
    .line 109
    invoke-virtual {p4}, Lzu0;->a()Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    if-eqz p3, :cond_4

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    iget p3, p4, Lzu0;->c:I

    .line 117
    .line 118
    const/16 p4, 0xc8

    .line 119
    .line 120
    if-ne p3, p4, :cond_5

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    const/4 v3, 0x0

    .line 124
    :goto_2
    invoke-direct {p1, p0, p2, v3}, Lk91;-><init>(Ljava/lang/Object;Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;Z)V

    .line 125
    .line 126
    .line 127
    return-object p1
.end method

.method public j(Ljava/lang/String;ZLd10;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p3, Lk52;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lk52;

    .line 7
    .line 8
    iget v1, v0, Lk52;->d:I

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
    iput v1, v0, Lk52;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lk52;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lk52;-><init>(Lk51;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lk52;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lk52;->d:I

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
    iget-object p0, v0, Lk52;->a:Lk51;

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
    new-instance p3, Lv40;

    .line 53
    .line 54
    invoke-direct {p3, p0, p1, v3, v4}, Lv40;-><init>(Len1;Ljava/lang/String;Lc10;I)V

    .line 55
    .line 56
    .line 57
    iput-object p0, v0, Lk52;->a:Lk51;

    .line 58
    .line 59
    iput v4, v0, Lk52;->d:I

    .line 60
    .line 61
    invoke-virtual {p0, p2, p3, v0}, Len1;->g(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    if-ne p3, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p3, Lzu0;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object p0, p3, Lzu0;->b:Ljava/lang/String;

    .line 74
    .line 75
    sget-object p1, Lb21;->a:Lr11;

    .line 76
    .line 77
    iget-object p2, p1, Lb11;->b:Lb5;

    .line 78
    .line 79
    const-class v0, Lcom/usercentrics/sdk/v2/ruleset/data/RuleSet;

    .line 80
    .line 81
    invoke-static {v0}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {p2, v0}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p1, p0, p2}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Lcom/usercentrics/sdk/v2/ruleset/data/RuleSet;

    .line 94
    .line 95
    new-instance p1, Lkotlin/Pair;

    .line 96
    .line 97
    invoke-virtual {p3}, Lzu0;->a()Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    invoke-direct {p1, p0, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    return-object p1
.end method

.method public k(Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lnl2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lnl2;

    .line 7
    .line 8
    iget v1, v0, Lnl2;->d:I

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
    iput v1, v0, Lnl2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lnl2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lnl2;-><init>(Lk51;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lnl2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lnl2;->d:I

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
    iget-object p0, v0, Lnl2;->a:Lk51;

    .line 38
    .line 39
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

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
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p1, Lu3;

    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    invoke-direct {p1, p0, v3, v2}, Lu3;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 56
    .line 57
    .line 58
    iput-object p0, v0, Lnl2;->a:Lk51;

    .line 59
    .line 60
    iput v4, v0, Lnl2;->d:I

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-virtual {p0, v2, p1, v0}, Len1;->h(ZLkotlin/jvm/functions/Function1;Ld10;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v1, :cond_3

    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object p0, Lb21;->a:Lr11;

    .line 76
    .line 77
    iget-object v0, p0, Lb11;->b:Lb5;

    .line 78
    .line 79
    const-class v1, Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    .line 80
    .line 81
    invoke-static {v1}, Lj22;->b(Ljava/lang/Class;)Ljs2;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-static {v0, v1}, Ljb1;->z(Lb5;Lv21;)Lkotlinx/serialization/KSerializer;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {p0, p1, v0}, Lb11;->a(Ljava/lang/String;Lkotlinx/serialization/KSerializer;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    .line 94
    .line 95
    return-object p0
.end method
