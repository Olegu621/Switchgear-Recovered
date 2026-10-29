.class public final Lm52;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lk51;

.field public final b:Lp91;


# direct methods
.method public constructor <init>(Lk51;Lp91;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm52;->a:Lk51;

    .line 8
    .line 9
    iput-object p2, p0, Lm52;->b:Lp91;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Ll52;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ll52;

    .line 7
    .line 8
    iget v1, v0, Ll52;->e:I

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
    iput v1, v0, Ll52;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ll52;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ll52;-><init>(Lm52;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ll52;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Ll52;->e:I

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
    iget-boolean p0, v0, Ll52;->b:Z

    .line 38
    .line 39
    iget-object p1, v0, Ll52;->a:Lm52;

    .line 40
    .line 41
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 42
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
    iget-object p2, p0, Lm52;->b:Lp91;

    .line 55
    .line 56
    invoke-virtual {p2}, Lp91;->a()Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    xor-int/lit8 v2, p2, 0x1

    .line 61
    .line 62
    iput-object p0, v0, Ll52;->a:Lm52;

    .line 63
    .line 64
    iput-boolean p2, v0, Ll52;->b:Z

    .line 65
    .line 66
    iput v4, v0, Ll52;->e:I

    .line 67
    .line 68
    iget-object v5, p0, Lm52;->a:Lk51;

    .line 69
    .line 70
    invoke-virtual {v5, p1, v2, v0}, Lk51;->j(Ljava/lang/String;ZLd10;)Ljava/io/Serializable;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object v7, p1

    .line 78
    move-object p1, p0

    .line 79
    move p0, p2

    .line 80
    move-object p2, v7

    .line 81
    :goto_1
    check-cast p2, Lkotlin/Pair;

    .line 82
    .line 83
    iget-object v0, p2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_5

    .line 92
    .line 93
    if-eqz p0, :cond_4

    .line 94
    .line 95
    iget-object p0, p1, Lm52;->b:Lp91;

    .line 96
    .line 97
    iget-object v0, p0, Lp91;->b:Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    new-instance p0, Lvz2;

    .line 101
    .line 102
    const-string p1, "Unable to initialise because location is not available; check permission or connectivity."

    .line 103
    .line 104
    invoke-direct {p0, p1}, Lvz2;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :cond_5
    :goto_2
    iget-object p0, p2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p0, Lcom/usercentrics/sdk/v2/ruleset/data/RuleSet;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/usercentrics/sdk/v2/ruleset/data/RuleSet;->a:Ljava/util/List;

    .line 116
    .line 117
    iget-object p2, p0, Lcom/usercentrics/sdk/v2/ruleset/data/RuleSet;->b:Lcom/usercentrics/sdk/v2/ruleset/data/DefaultGeoRule;

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    move-object v1, v3

    .line 124
    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_8

    .line 129
    .line 130
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Lcom/usercentrics/sdk/v2/ruleset/data/GeoRule;

    .line 135
    .line 136
    iget-object v5, v2, Lcom/usercentrics/sdk/v2/ruleset/data/GeoRule;->b:Ljava/util/List;

    .line 137
    .line 138
    iget-object v6, v0, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->b:Ljava/lang/String;

    .line 139
    .line 140
    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_7

    .line 145
    .line 146
    move-object v3, v2

    .line 147
    goto :goto_4

    .line 148
    :cond_7
    iget-object v5, v2, Lcom/usercentrics/sdk/v2/ruleset/data/GeoRule;->b:Ljava/util/List;

    .line 149
    .line 150
    iget-object v6, v0, Lcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;->a:Ljava/lang/String;

    .line 151
    .line 152
    invoke-interface {v5, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    move-object v1, v2

    .line 159
    goto :goto_3

    .line 160
    :cond_8
    :goto_4
    if-nez v3, :cond_9

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_9
    move-object v1, v3

    .line 164
    :goto_5
    if-nez v1, :cond_a

    .line 165
    .line 166
    iget-boolean p1, p2, Lcom/usercentrics/sdk/v2/ruleset/data/DefaultGeoRule;->b:Z

    .line 167
    .line 168
    iget-object v1, p2, Lcom/usercentrics/sdk/v2/ruleset/data/DefaultGeoRule;->a:Ljava/lang/String;

    .line 169
    .line 170
    goto :goto_6

    .line 171
    :cond_a
    iget-object v1, v1, Lcom/usercentrics/sdk/v2/ruleset/data/GeoRule;->a:Ljava/lang/String;

    .line 172
    .line 173
    const/4 p1, 0x0

    .line 174
    :goto_6
    new-instance v2, Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;

    .line 175
    .line 176
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/ruleset/data/DefaultGeoRule;->a:Ljava/lang/String;

    .line 177
    .line 178
    filled-new-array {p2}, [Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    new-instance v3, Ljava/util/HashSet;

    .line 183
    .line 184
    invoke-static {v4}, Lnc1;->c(I)I

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-static {p2, v3}, Lqd;->l([Ljava/lang/Object;Ljava/util/AbstractSet;)V

    .line 192
    .line 193
    .line 194
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/ruleset/data/RuleSet;->a:Ljava/util/List;

    .line 195
    .line 196
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    if-eqz p2, :cond_b

    .line 205
    .line 206
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p2

    .line 210
    check-cast p2, Lcom/usercentrics/sdk/v2/ruleset/data/GeoRule;

    .line 211
    .line 212
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/ruleset/data/GeoRule;->a:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v3, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_b
    invoke-direct {v2, v1, p1, v0, v3}, Lcom/usercentrics/sdk/v2/ruleset/data/SessionGeoRule;-><init>(Ljava/lang/String;ZLcom/usercentrics/sdk/v2/location/data/UsercentricsLocation;Ljava/util/HashSet;)V

    .line 219
    .line 220
    .line 221
    return-object v2
.end method
