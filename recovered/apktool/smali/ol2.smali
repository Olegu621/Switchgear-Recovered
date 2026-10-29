.class public final Lol2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

.field public final b:Lac1;

.field public final c:Lcl2;

.field public final d:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

.field public final e:Llv1;

.field public final f:Llv1;

.field public final g:Llv1;

.field public final h:Llv1;

.field public final i:Llv1;

.field public final j:Llv1;

.field public final k:Llv1;


# direct methods
.method public constructor <init>(Lb23;Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lac1;)V
    .locals 4

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lol2;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 14
    .line 15
    iput-object p3, p0, Lol2;->b:Lac1;

    .line 16
    .line 17
    new-instance p3, Lcl2;

    .line 18
    .line 19
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-boolean p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->A:Z

    .line 25
    .line 26
    invoke-direct {p3, p1, p2}, Lcl2;-><init>(Lb23;Z)V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lol2;->c:Lcl2;

    .line 30
    .line 31
    iget-object p1, p1, Lb23;->c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 32
    .line 33
    iput-object p1, p0, Lol2;->d:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 34
    .line 35
    invoke-virtual {p0}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->l:Ljava/lang/String;

    .line 40
    .line 41
    iget-object p3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->i:Ljava/util/List;

    .line 42
    .line 43
    iget-object v0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->u:Lcom/usercentrics/tcf/core/model/gvl/DataRetention;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    iget-object v2, v0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->b:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v2, v1

    .line 52
    :goto_0
    invoke-virtual {p0, p2, p3, v2}, Lol2;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)Llv1;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    iput-object p2, p0, Lol2;->e:Llv1;

    .line 57
    .line 58
    invoke-virtual {p0}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->B:Ljava/lang/String;

    .line 63
    .line 64
    iget-object p3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->v:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {p0, p2, p3, v1}, Lol2;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)Llv1;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iput-object p2, p0, Lol2;->f:Llv1;

    .line 71
    .line 72
    invoke-virtual {p0}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->C:Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    iget-object p3, v0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->a:Ljava/lang/Integer;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move-object p3, v1

    .line 84
    :goto_1
    if-nez p3, :cond_2

    .line 85
    .line 86
    move-object v2, v1

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v3, "\u2022 "

    .line 91
    .line 92
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    new-instance v2, Llv1;

    .line 103
    .line 104
    new-instance v3, Lrv1;

    .line 105
    .line 106
    invoke-direct {v3, p3}, Lrv1;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-direct {v2, p2, v3}, Llv1;-><init>(Ljava/lang/String;Lw11;)V

    .line 110
    .line 111
    .line 112
    :goto_2
    iput-object v2, p0, Lol2;->g:Llv1;

    .line 113
    .line 114
    invoke-virtual {p0}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->k:Ljava/lang/String;

    .line 119
    .line 120
    iget-object p3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->f:Ljava/util/List;

    .line 121
    .line 122
    invoke-virtual {p0, p2, p3, v1}, Lol2;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)Llv1;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    iput-object p2, p0, Lol2;->h:Llv1;

    .line 127
    .line 128
    invoke-virtual {p0}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->n:Ljava/lang/String;

    .line 133
    .line 134
    iget-object p3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->l:Ljava/util/List;

    .line 135
    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    iget-object v0, v0, Lcom/usercentrics/tcf/core/model/gvl/DataRetention;->c:Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_3
    move-object v0, v1

    .line 142
    :goto_3
    invoke-virtual {p0, p2, p3, v0}, Lol2;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)Llv1;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    iput-object p2, p0, Lol2;->i:Llv1;

    .line 147
    .line 148
    invoke-virtual {p0}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->j:Ljava/lang/String;

    .line 153
    .line 154
    iget-object p3, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->b:Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {p0, p2, p3, v1}, Lol2;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)Llv1;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    iput-object p2, p0, Lol2;->j:Llv1;

    .line 161
    .line 162
    invoke-virtual {p0}, Lol2;->b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    iget-object p2, p2, Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;->m:Ljava/lang/String;

    .line 167
    .line 168
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->k:Ljava/util/List;

    .line 169
    .line 170
    invoke-virtual {p0, p2, p1, v1}, Lol2;->a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)Llv1;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iput-object p1, p0, Lol2;->k:Llv1;

    .line 175
    .line 176
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/List;Lcom/usercentrics/tcf/core/model/gvl/RetentionPeriod;)Llv1;
    .locals 6

    .line 1
    new-instance v4, Loc;

    .line 2
    .line 3
    const/16 v0, 0x9

    .line 4
    .line 5
    invoke-direct {v4, v0, p3, p0}, Loc;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/16 v5, 0x1e

    .line 9
    .line 10
    const-string v1, "\n"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v0, p2

    .line 15
    invoke-static/range {v0 .. v5}, Lkotlin/collections/CollectionsKt;->x(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lkotlin/text/StringsKt;->D(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_0
    new-instance p2, Llv1;

    .line 28
    .line 29
    new-instance p3, Lrv1;

    .line 30
    .line 31
    invoke-direct {p3, p0}, Lrv1;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, p1, p3}, Llv1;-><init>(Ljava/lang/String;Lw11;)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method

.method public final b()Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;
    .locals 0

    .line 1
    iget-object p0, p0, Lol2;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->t:Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method
