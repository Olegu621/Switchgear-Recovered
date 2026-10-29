.class public Lxhpgvfjuz/at;
.super Lxhpgvfjuz/ao;
.source "SourceFile"


# direct methods
.method private constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lxhpgvfjuz/C;->b:Lxhpgvfjuz/C;

    invoke-direct {p0, v0}, Lxhpgvfjuz/ao;-><init>(Lxhpgvfjuz/C;)V

    iget-object v0, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 v1, 0x401

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 v0, 0x402

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 p2, 0x404

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 p2, 0x403

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 p2, 0x405

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2, p5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p0, Lxhpgvfjuz/ao;->a:Ljava/util/HashMap;

    const/16 p1, 0x406

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x402

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x404

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x406

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x403

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    const/16 v0, 0x405

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->a(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public f()Z
    .locals 1

    const/16 v0, 0x401

    invoke-virtual {p0, v0}, Lxhpgvfjuz/ao;->f(I)Z

    move-result p0

    return p0
.end method
