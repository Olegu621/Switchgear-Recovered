.class public final Lwp0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Ltp0;


# instance fields
.field public final a:Lfs0;

.field public b:Ljava/util/Map;

.field public c:Ljava/util/List;

.field public d:Ljava/lang/Integer;

.field public e:Ljava/util/Map;

.field public f:Ljava/util/Map;

.field public g:Ljava/util/Map;

.field public h:Ljava/util/Map;

.field public i:Ljava/util/Map;

.field public j:Ljava/util/Map;

.field public k:Z

.field public l:Ljava/util/Map;

.field public m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ltp0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lwp0;->Companion:Ltp0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lfs0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwp0;->a:Lfs0;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lwp0;->b:Ljava/util/Map;

    .line 8
    .line 9
    iput-object p1, p0, Lwp0;->d:Ljava/lang/Integer;

    .line 10
    .line 11
    iput-object p1, p0, Lwp0;->e:Ljava/util/Map;

    .line 12
    .line 13
    iput-object p1, p0, Lwp0;->f:Ljava/util/Map;

    .line 14
    .line 15
    iput-object p1, p0, Lwp0;->g:Ljava/util/Map;

    .line 16
    .line 17
    iput-object p1, p0, Lwp0;->h:Ljava/util/Map;

    .line 18
    .line 19
    iput-object p1, p0, Lwp0;->i:Ljava/util/Map;

    .line 20
    .line 21
    iput-object p1, p0, Lwp0;->j:Ljava/util/Map;

    .line 22
    .line 23
    sget-object p1, Lod0;->a:Lod0;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lwp0;->l:Ljava/util/Map;

    .line 29
    .line 30
    const-string p1, "EN"

    .line 31
    .line 32
    iput-object p1, p0, Lwp0;->m:Ljava/lang/String;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lup0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lup0;

    .line 7
    .line 8
    iget v1, v0, Lup0;->e:I

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
    iput v1, v0, Lup0;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lup0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lup0;-><init>(Lwp0;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lup0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lup0;->e:I

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
    iget-object p1, v0, Lup0;->b:Ljava/lang/String;

    .line 38
    .line 39
    iget-object p0, v0, Lup0;->a:Lwp0;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    check-cast p2, Lo42;

    .line 45
    .line 46
    iget-object p2, p2, Lo42;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catch_0
    move-exception p0

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 61
    .line 62
    invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lwp0;->m:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_3

    .line 76
    .line 77
    sget-object p0, Lo42;->b:Lm42;

    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_3
    :try_start_1
    iget-object p2, p0, Lwp0;->a:Lfs0;

    .line 83
    .line 84
    iput-object p0, v0, Lup0;->a:Lwp0;

    .line 85
    .line 86
    iput-object p1, v0, Lup0;->b:Ljava/lang/String;

    .line 87
    .line 88
    iput v4, v0, Lup0;->e:I

    .line 89
    .line 90
    invoke-virtual {p2, p1, v0}, Lfs0;->p(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    if-ne p2, v1, :cond_4

    .line 95
    .line 96
    return-object v1

    .line 97
    :cond_4
    :goto_1
    invoke-static {p2}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-nez v0, :cond_6

    .line 102
    .line 103
    iput-object p1, p0, Lwp0;->m:Ljava/lang/String;

    .line 104
    .line 105
    instance-of v0, p2, Ln42;

    .line 106
    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    move-object v3, p2

    .line 111
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast v3, Lcom/usercentrics/tcf/core/model/gvl/Declarations;

    .line 115
    .line 116
    iget-object p2, v3, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->a:Ljava/util/Map;

    .line 117
    .line 118
    iput-object p2, p0, Lwp0;->f:Ljava/util/Map;

    .line 119
    .line 120
    iget-object p2, v3, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->b:Ljava/util/Map;

    .line 121
    .line 122
    iput-object p2, p0, Lwp0;->i:Ljava/util/Map;

    .line 123
    .line 124
    iget-object p2, v3, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->c:Ljava/util/Map;

    .line 125
    .line 126
    iput-object p2, p0, Lwp0;->e:Ljava/util/Map;

    .line 127
    .line 128
    iget-object p2, v3, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->d:Ljava/util/Map;

    .line 129
    .line 130
    iput-object p2, p0, Lwp0;->h:Ljava/util/Map;

    .line 131
    .line 132
    iget-object p2, v3, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->e:Ljava/util/Map;

    .line 133
    .line 134
    iput-object p2, p0, Lwp0;->j:Ljava/util/Map;

    .line 135
    .line 136
    iget-object p2, v3, Lcom/usercentrics/tcf/core/model/gvl/Declarations;->f:Ljava/util/Map;

    .line 137
    .line 138
    iput-object p2, p0, Lwp0;->g:Ljava/util/Map;

    .line 139
    .line 140
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :cond_6
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 144
    :goto_3
    sget-object p2, Lo42;->b:Lm42;

    .line 145
    .line 146
    new-instance p2, Lxp0;

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    const-string v1, "Unable to fetch language ("

    .line 153
    .line 154
    const-string v2, ") declarations: "

    .line 155
    .line 156
    invoke-static {v1, p1, v2, v0}, Len;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-direct {p2, p1, p0}, Lxp0;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 161
    .line 162
    .line 163
    new-instance p0, Ln42;

    .line 164
    .line 165
    invoke-direct {p0, p2}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    return-object p0
.end method

.method public final b(Ld10;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lvp0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lvp0;

    .line 7
    .line 8
    iget v1, v0, Lvp0;->d:I

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
    iput v1, v0, Lvp0;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvp0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lvp0;-><init>(Lwp0;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lvp0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lvp0;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p0, v0, Lvp0;->a:Lwp0;

    .line 38
    .line 39
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    check-cast p1, Lo42;

    .line 43
    .line 44
    iget-object p1, p1, Lo42;->a:Ljava/lang/Object;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v4

    .line 53
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object p0, v0, Lvp0;->a:Lwp0;

    .line 57
    .line 58
    iput v3, v0, Lvp0;->d:I

    .line 59
    .line 60
    iget-object p1, p0, Lwp0;->a:Lfs0;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lfs0;->s(Ld10;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    sget-object v0, Lo42;->b:Lm42;

    .line 70
    .line 71
    instance-of v0, p1, Ln42;

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    move-object v0, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    move-object v0, p1

    .line 78
    :goto_2
    check-cast v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    .line 79
    .line 80
    if-nez v0, :cond_6

    .line 81
    .line 82
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-nez p0, :cond_5

    .line 87
    .line 88
    new-instance p0, Lvz2;

    .line 89
    .line 90
    const-string p1, "Error when initializing TCF #111"

    .line 91
    .line 92
    invoke-direct {p0, p1}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_5
    new-instance p1, Ln42;

    .line 96
    .line 97
    invoke-direct {p1, p0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    return-object p1

    .line 101
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object p1, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->f:Ljava/util/Map;

    .line 105
    .line 106
    iput-object p1, p0, Lwp0;->f:Ljava/util/Map;

    .line 107
    .line 108
    iget-object p1, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->i:Ljava/util/Map;

    .line 109
    .line 110
    iput-object p1, p0, Lwp0;->i:Ljava/util/Map;

    .line 111
    .line 112
    iget-object p1, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->g:Ljava/util/Map;

    .line 113
    .line 114
    iput-object p1, p0, Lwp0;->e:Ljava/util/Map;

    .line 115
    .line 116
    iget-object p1, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->h:Ljava/util/Map;

    .line 117
    .line 118
    iput-object p1, p0, Lwp0;->h:Ljava/util/Map;

    .line 119
    .line 120
    iget-object p1, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->j:Ljava/util/Map;

    .line 121
    .line 122
    iput-object p1, p0, Lwp0;->j:Ljava/util/Map;

    .line 123
    .line 124
    iget-object p1, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->k:Ljava/util/Map;

    .line 125
    .line 126
    iput-object p1, p0, Lwp0;->g:Ljava/util/Map;

    .line 127
    .line 128
    iget-object p1, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->c:Ljava/lang/Integer;

    .line 129
    .line 130
    iput-object p1, p0, Lwp0;->d:Ljava/lang/Integer;

    .line 131
    .line 132
    iget-object p1, v0, Lcom/usercentrics/tcf/core/model/gvl/VendorList;->e:Ljava/util/Map;

    .line 133
    .line 134
    iput-object p1, p0, Lwp0;->b:Ljava/util/Map;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iput-object p1, p0, Lwp0;->l:Ljava/util/Map;

    .line 140
    .line 141
    invoke-virtual {p0, v4}, Lwp0;->c(Ljava/util/List;)V

    .line 142
    .line 143
    .line 144
    iput-boolean v3, p0, Lwp0;->k:Z

    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0
.end method

.method public final c(Ljava/util/List;)V
    .locals 6

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lwp0;->l:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-static {p1, v1}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object p1, v0

    .line 49
    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object v1, p0, Lwp0;->b:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_4

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    check-cast v4, Lcom/usercentrics/tcf/core/model/gvl/Vendor;

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    const/4 v4, 0x0

    .line 90
    :goto_2
    if-eqz v4, :cond_2

    .line 91
    .line 92
    iget-object v5, v4, Lcom/usercentrics/tcf/core/model/gvl/Vendor;->h:Ljava/lang/String;

    .line 93
    .line 94
    if-nez v5, :cond_2

    .line 95
    .line 96
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    iput-object v0, p0, Lwp0;->b:Ljava/util/Map;

    .line 105
    .line 106
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->D(Ljava/util/List;)Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, Lwp0;->c:Ljava/util/List;

    .line 111
    .line 112
    return-void
.end method
