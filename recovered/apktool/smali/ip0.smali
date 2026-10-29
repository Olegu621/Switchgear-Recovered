.class public final Lip0;
.super Lsq3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lhp0;

.field public static final U:Lej0;


# instance fields
.field public final b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

.field public final c:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

.field public final d:Lur3;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final v:Z

.field public final w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lhp0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lip0;->Companion:Lhp0;

    .line 7
    .line 8
    sget-object v0, Lej0;->a:Lej0;

    .line 9
    .line 10
    sput-object v0, Lip0;->U:Lej0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;Lur3;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lnv1;)V
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1}, Lsq3;-><init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lip0;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 20
    .line 21
    iput-object p2, p0, Lip0;->c:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 22
    .line 23
    iput-object p3, p0, Lip0;->d:Lur3;

    .line 24
    .line 25
    iput-object p4, p0, Lip0;->e:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p5, p0, Lip0;->f:Ljava/util/List;

    .line 28
    .line 29
    iput-object p6, p0, Lip0;->i:Ljava/util/List;

    .line 30
    .line 31
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->b:Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;

    .line 32
    .line 33
    iget-boolean p2, p1, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->c:Z

    .line 34
    .line 35
    iput-boolean p2, p0, Lip0;->v:Z

    .line 36
    .line 37
    iget-boolean p1, p1, Lcom/usercentrics/sdk/v2/settings/data/SecondLayer;->d:Z

    .line 38
    .line 39
    iput-boolean p1, p0, Lip0;->w:Z

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final A()Ldu1;
    .locals 14

    .line 1
    sget-object v0, Ln03;->Companion:Lm03;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lip0;->f:Ljava/util/List;

    .line 7
    .line 8
    iget-object v1, p0, Lip0;->i:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {v0, v1}, Lm03;->a(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    invoke-static {v0, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    iget-boolean v4, p0, Lip0;->w:Z

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lxr;

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_0
    iget-object v4, v3, Lxr;->c:Ljava/util/ArrayList;

    .line 48
    .line 49
    new-instance v5, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-static {v4, v2}, Lqw;->h(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_1

    .line 67
    .line 68
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    move-object v8, v6

    .line 73
    check-cast v8, Lm61;

    .line 74
    .line 75
    new-instance v7, Lmv1;

    .line 76
    .line 77
    iget-object v6, p0, Lip0;->b:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;

    .line 78
    .line 79
    iget-object v11, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;->B:Lq90;

    .line 80
    .line 81
    iget-object v6, v8, Lm61;->p:Li61;

    .line 82
    .line 83
    invoke-virtual {p0, v6}, Lsq3;->l(Li61;)Lkv1;

    .line 84
    .line 85
    .line 86
    move-result-object v12

    .line 87
    const/4 v13, 0x2

    .line 88
    const/4 v9, 0x0

    .line 89
    iget-boolean v10, p0, Lip0;->v:Z

    .line 90
    .line 91
    invoke-direct/range {v7 .. v13}, Lmv1;-><init>(Lm61;Llv1;ZLq90;Lkv1;I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    new-instance v4, Lov1;

    .line 99
    .line 100
    invoke-direct {v4, v5}, Lov1;-><init>(Ljava/util/ArrayList;)V

    .line 101
    .line 102
    .line 103
    move-object v5, v4

    .line 104
    :goto_2
    new-instance v4, Lcu1;

    .line 105
    .line 106
    iget-object v6, v3, Lxr;->a:Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;

    .line 107
    .line 108
    iget-object v6, v6, Lcom/usercentrics/sdk/v2/settings/data/UsercentricsCategory;->c:Ljava/lang/String;

    .line 109
    .line 110
    invoke-direct {v4, v3, v5, v6}, Lcu1;-><init>(Lxr;Lov1;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    if-eqz v4, :cond_3

    .line 118
    .line 119
    new-instance v0, Lfu1;

    .line 120
    .line 121
    iget-object v2, p0, Lip0;->c:Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;

    .line 122
    .line 123
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/translation/data/LegalBasisLocalization;->a:Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;

    .line 124
    .line 125
    iget-object v2, v2, Lcom/usercentrics/sdk/v2/translation/data/TranslationLabelsDto;->f:Ljava/lang/String;

    .line 126
    .line 127
    iget-object p0, p0, Lip0;->e:Ljava/lang/String;

    .line 128
    .line 129
    invoke-direct {v0, v2, p0}, Lfu1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_3
    move-object v0, v5

    .line 134
    :goto_3
    new-instance p0, Ldu1;

    .line 135
    .line 136
    invoke-direct {p0, v5, v1, v0}, Ldu1;-><init>(Ljava/lang/String;Ljava/util/List;Lfu1;)V

    .line 137
    .line 138
    .line 139
    return-object p0
.end method
