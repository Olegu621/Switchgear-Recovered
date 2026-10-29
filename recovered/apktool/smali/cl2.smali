.class public final Lcl2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Lvv1;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/util/List;

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/util/ArrayList;

.field public final m:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lb23;Z)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    iget-object v0, p1, Lb23;->c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;

    .line 146
    sget-object v1, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    invoke-virtual {v1, v0}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcl2;->a:Ljava/lang/String;

    .line 147
    iget v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->d:I

    .line 148
    iput v1, p0, Lcl2;->b:I

    .line 149
    iget-object v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->g:Ljava/lang/String;

    .line 150
    iput-object v1, p0, Lcl2;->c:Ljava/lang/String;

    const/4 v1, 0x0

    .line 151
    iput-boolean v1, p0, Lcl2;->d:Z

    .line 152
    iget-boolean v2, p1, Lb23;->a:Z

    .line 153
    iput-boolean v2, p0, Lcl2;->e:Z

    .line 154
    iget-boolean p1, p1, Lb23;->b:Z

    .line 155
    iput-boolean p1, p0, Lcl2;->f:Z

    const/4 p1, 0x0

    .line 156
    iput-object p1, p0, Lcl2;->g:Lvv1;

    .line 157
    const-string v2, ""

    iput-object v2, p0, Lcl2;->h:Ljava/lang/String;

    .line 158
    sget-object v2, Lnd0;->a:Lnd0;

    .line 159
    iput-object v2, p0, Lcl2;->i:Ljava/util/List;

    .line 160
    iget-boolean v2, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->m:Z

    .line 161
    iput-boolean v2, p0, Lcl2;->j:Z

    .line 162
    iget-boolean v0, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;->n:Z

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    const/4 v1, 0x1

    .line 163
    :cond_0
    iput-boolean v1, p0, Lcl2;->k:Z

    .line 164
    iput-object p1, p0, Lcl2;->l:Ljava/util/ArrayList;

    .line 165
    iput-object p1, p0, Lcl2;->m:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Leg2;ZLjava/util/ArrayList;)V
    .locals 3

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    iget-object v0, p1, Leg2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;

    .line 125
    sget-object v1, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    invoke-virtual {v1, v0}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcl2;->a:Ljava/lang/String;

    .line 126
    iget v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->b:I

    .line 127
    iput v1, p0, Lcl2;->b:I

    .line 128
    iget-object v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->c:Ljava/lang/String;

    .line 129
    iput-object v1, p0, Lcl2;->c:Ljava/lang/String;

    const/4 v1, 0x0

    .line 130
    iput-boolean v1, p0, Lcl2;->d:Z

    .line 131
    iget-boolean p1, p1, Leg2;->a:Z

    .line 132
    iput-boolean p1, p0, Lcl2;->e:Z

    .line 133
    iput-boolean v1, p0, Lcl2;->f:Z

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    .line 134
    new-instance p2, Lvv1;

    invoke-direct {p2, v1, p1}, Lvv1;-><init>(ZZ)V

    goto :goto_0

    :cond_0
    move-object p2, v2

    .line 135
    :goto_0
    iput-object p2, p0, Lcl2;->g:Lvv1;

    .line 136
    iput-object p3, p0, Lcl2;->l:Ljava/util/ArrayList;

    .line 137
    iget-object p1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFStack;->a:Ljava/lang/String;

    .line 138
    iput-object p1, p0, Lcl2;->h:Ljava/lang/String;

    .line 139
    sget-object p1, Lnd0;->a:Lnd0;

    .line 140
    iput-object p1, p0, Lcl2;->i:Ljava/util/List;

    .line 141
    iput-boolean v1, p0, Lcl2;->j:Z

    .line 142
    iput-boolean v1, p0, Lcl2;->k:Z

    .line 143
    iput-object v2, p0, Lcl2;->m:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Luz1;ZZ)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p1, Luz1;->c:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;

    .line 8
    .line 9
    sget-object v1, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, Lcl2;->a:Ljava/lang/String;

    .line 16
    .line 17
    iget v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->c:I

    .line 18
    .line 19
    iput v1, p0, Lcl2;->b:I

    .line 20
    .line 21
    iget-object v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->d:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v1, p0, Lcl2;->c:Ljava/lang/String;

    .line 24
    .line 25
    iget-boolean v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->f:Z

    .line 26
    .line 27
    iput-boolean v1, p0, Lcl2;->d:Z

    .line 28
    .line 29
    iget-boolean v1, p1, Luz1;->a:Z

    .line 30
    .line 31
    iput-boolean v1, p0, Lcl2;->e:Z

    .line 32
    .line 33
    iget-boolean p1, p1, Luz1;->b:Z

    .line 34
    .line 35
    iput-boolean p1, p0, Lcl2;->f:Z

    .line 36
    .line 37
    iget-boolean p1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->h:Z

    .line 38
    .line 39
    iput-boolean p1, p0, Lcl2;->j:Z

    .line 40
    .line 41
    iget-boolean v2, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->i:Z

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    if-nez p3, :cond_0

    .line 47
    .line 48
    const/4 p3, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move p3, v3

    .line 51
    :goto_0
    iput-boolean p3, p0, Lcl2;->k:Z

    .line 52
    .line 53
    const/4 p3, 0x0

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    new-instance p1, Lvv1;

    .line 59
    .line 60
    invoke-direct {p1, v3, v1}, Lvv1;-><init>(ZZ)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object p1, p3

    .line 65
    :goto_1
    iput-object p1, p0, Lcl2;->g:Lvv1;

    .line 66
    .line 67
    iget-object p1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->a:Ljava/lang/String;

    .line 68
    .line 69
    iput-object p1, p0, Lcl2;->h:Ljava/lang/String;

    .line 70
    .line 71
    iget-object p1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->b:Ljava/util/List;

    .line 72
    .line 73
    iput-object p1, p0, Lcl2;->i:Ljava/util/List;

    .line 74
    .line 75
    iput-object p3, p0, Lcl2;->l:Ljava/util/ArrayList;

    .line 76
    .line 77
    iget-object p1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFPurpose;->k:Ljava/lang/Integer;

    .line 78
    .line 79
    iput-object p1, p0, Lcl2;->m:Ljava/lang/Integer;

    .line 80
    .line 81
    return-void
.end method

.method public constructor <init>(Lyf2;Z)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iget-object v0, p1, Lyf2;->b:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;

    .line 103
    sget-object v1, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    invoke-virtual {v1, v0}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcl2;->a:Ljava/lang/String;

    .line 104
    iget v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->c:I

    .line 105
    iput v1, p0, Lcl2;->b:I

    .line 106
    iget-object v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->d:Ljava/lang/String;

    .line 107
    iput-object v1, p0, Lcl2;->c:Ljava/lang/String;

    .line 108
    iget-boolean v1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->f:Z

    .line 109
    iput-boolean v1, p0, Lcl2;->d:Z

    .line 110
    iget-boolean p1, p1, Lyf2;->a:Z

    .line 111
    iput-boolean p1, p0, Lcl2;->e:Z

    const/4 v1, 0x0

    .line 112
    iput-boolean v1, p0, Lcl2;->f:Z

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    .line 113
    new-instance p2, Lvv1;

    invoke-direct {p2, v1, p1}, Lvv1;-><init>(ZZ)V

    goto :goto_0

    :cond_0
    move-object p2, v2

    .line 114
    :goto_0
    iput-object p2, p0, Lcl2;->g:Lvv1;

    .line 115
    iget-object p1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->a:Ljava/lang/String;

    .line 116
    iput-object p1, p0, Lcl2;->h:Ljava/lang/String;

    .line 117
    iget-object p1, v0, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialFeature;->b:Ljava/util/List;

    .line 118
    iput-object p1, p0, Lcl2;->i:Ljava/util/List;

    .line 119
    iput-boolean v1, p0, Lcl2;->j:Z

    .line 120
    iput-boolean v1, p0, Lcl2;->k:Z

    .line 121
    iput-object v2, p0, Lcl2;->l:Ljava/util/ArrayList;

    .line 122
    iput-object v2, p0, Lcl2;->m:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Lzf2;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iget-object p1, p1, Lzf2;->a:Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;

    .line 84
    sget-object v0, Lya2;->Companion:Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;

    invoke-virtual {v0, p1}, Lcom/usercentrics/sdk/models/settings/ServicesIdStrategy$Companion;->id(Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcl2;->a:Ljava/lang/String;

    .line 85
    iget v0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->c:I

    .line 86
    iput v0, p0, Lcl2;->b:I

    .line 87
    iget-object v0, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->d:Ljava/lang/String;

    .line 88
    iput-object v0, p0, Lcl2;->c:Ljava/lang/String;

    const/4 v0, 0x0

    .line 89
    iput-boolean v0, p0, Lcl2;->d:Z

    .line 90
    iput-boolean v0, p0, Lcl2;->e:Z

    const/4 v1, 0x1

    .line 91
    iput-boolean v1, p0, Lcl2;->f:Z

    .line 92
    iput-boolean v0, p0, Lcl2;->j:Z

    .line 93
    iput-boolean v0, p0, Lcl2;->k:Z

    const/4 v0, 0x0

    .line 94
    iput-object v0, p0, Lcl2;->g:Lvv1;

    .line 95
    iget-object v1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->a:Ljava/lang/String;

    .line 96
    iput-object v1, p0, Lcl2;->h:Ljava/lang/String;

    .line 97
    iget-object p1, p1, Lcom/usercentrics/sdk/services/tcf/interfaces/TCFSpecialPurpose;->b:Ljava/util/List;

    .line 98
    iput-object p1, p0, Lcl2;->i:Ljava/util/List;

    .line 99
    iput-object v0, p0, Lcl2;->l:Ljava/util/ArrayList;

    .line 100
    iput-object v0, p0, Lcl2;->m:Ljava/lang/Integer;

    return-void
.end method
