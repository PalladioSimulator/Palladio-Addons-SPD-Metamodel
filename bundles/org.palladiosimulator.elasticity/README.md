# org.palladiosimulator.elasticity (Elasticity 2.0)

Generic elasticity-policy metamodel — successor design to SPD 1.0.

| Path | Contents |
|------|----------|
| `model/Elasticity.ecore` | Abstract syntax |
| `model/Elasticity.ocl` | Well-formedness sketch |
| `examples/before-spd/` | SPD 1.0 reference instances |
| `examples/after-elasticity/` | Equivalent / extended Elasticity instances |
| `migration/` | Migrator + validator (Python, stdlib) |
| `docs/` | Redesign, comparison, migration, further work |

```bash
python3 migration/validate_elasticity.py
python3 migration/migrate_spd_to_elasticity.py examples/before-spd/InfrastructureSPD.xmi /tmp/out.elasticity
```

Start with [docs/REDESIGN.md](docs/REDESIGN.md).
