.class public Lxhpgvfjuz/L;
.super Lxhpgvfjuz/ao;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/ComponentName;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lxhpgvfjuz/C;->l:Lxhpgvfjuz/C;

    invoke-direct {p0, v0}, Lxhpgvfjuz/ao;-><init>(Lxhpgvfjuz/C;)V

    iget-object v0, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 v1, 0x3001

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 v0, 0x3002

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 p1, 0x3003

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Landroid/content/ComponentName;
    .locals 1

    const/16 v0, 0x3001

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object p0, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/ComponentName;

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x3003

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x3002

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
